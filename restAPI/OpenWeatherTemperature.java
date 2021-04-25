package restAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

import restAPI.openWeatherDTO.DTOWeather;
import restAPI.openWeatherDTO.Result;

/**
 * This program show the forecast of a city. - Showing the average, min and max temperature in
 * Celsius for every day and globally.
 *
 * @author Manuel Brito
 */
public class OpenWeatherTemperature {

  private static final String API_KEY_OPENWEATHER = System.getenv().get("API_KEY_OPENWEATHER");
  private static final String ROOT_ENDPOINT = "https://api.openweathermap.org";
  private static final String PATH = "/data/2.5/forecast";

  private static List<Double> globalMinTemps = new ArrayList<Double>();
  private static List<Double> globalMaxTemps = new ArrayList<Double>();

  public static void main(String[] args) {
    try {
      validateArgs(args);
      String endpoint = getEndpoint(args[0]);

      String responseJson = getResponseOpenWeather(endpoint);
      showData(responseJson);

    } catch (IOException e) {
      System.out.println(e.getMessage());
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
  }

  private static void validateArgs(String[] args) {
    if (args.length != 1) {
      System.err.println("\nInvalid Number Of Arguments");
      System.exit(0);
    }
  }

  private static String getEndpoint(String city) {
    String params = "?q=" + city + ",es&units=metric&appid=";
    return ROOT_ENDPOINT + PATH + params + API_KEY_OPENWEATHER;
  }

  private static String getResponseOpenWeather(String endpoint)
      throws IOException, InterruptedException {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endpoint)).GET().build();
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

    return response.body();
  }

  private static void showData(String responseJson) {
    Gson gson = new Gson();
    DTOWeather dto = gson.fromJson(responseJson, DTOWeather.class);

    showingTemperatures(dto);
  }

  private static void showingTemperatures(DTOWeather dto) {

    showDailyMinAndMaxTemp(dto);

    addingGlobalTemperaturesToArray(dto);

    showGlobalMaxTemperature();

    showGlobalMinTemperature();

    showMeanGlobalTemperatures(meanMaxTemperatures(), meanMinTemperatures());

    // formatDate(dto);
  }

  private static void showMeanGlobalTemperatures(double maxTemps, double minTemps) {
    System.out.println(
        "\nLa temperatura media global es de: " + getGlobalMean(maxTemps, minTemps) + " ºC");
  }

  private static long getGlobalMean(double maxTemps, double minTemps) {
    return Math.round(((maxTemps + minTemps) / 2));
  }

  private static double meanMaxTemperatures() {
    double additionTemps = 0;
    for (Double maxTemp : globalMaxTemps) {
      additionTemps += maxTemp;
    }
    return additionTemps / globalMaxTemps.size();
  }

  private static double meanMinTemperatures() {
    double additionTemps = 0;
    for (Double minTemp : globalMinTemps) {
      additionTemps += minTemp;
    }
    return additionTemps / globalMinTemps.size();
  }

  private static void showGlobalMinTemperature() {
    Double minTemperature;
    minTemperature = Collections.min(globalMaxTemps);

    System.out.println("\nLa temperatura mínima global es de " + minTemperature + " ºC");
  }

  private static void showGlobalMaxTemperature() {
    Double maxTemperature;
    maxTemperature = Collections.max(globalMaxTemps);

    System.out.println("\nTEMPERATURAS GLOBALES");
    System.out.println("-".repeat(45));

    System.out.println("\nLa temperatura máxima global es de " + maxTemperature + " ºC");
  }

  private static void addingGlobalTemperaturesToArray(DTOWeather dto) {
    for (Result results : dto.getList()) {
      globalMinTemps.add(results.getMain().getTempMin());
      globalMaxTemps.add(results.getMain().getTempMax());
    }
  }

  private static void showDailyMinAndMaxTemp(DTOWeather dto) {
    System.out.println("\nTEMPERATURAS DIARIAS");
    System.out.println("-".repeat(112));

    for (Result results : dto.getList()) {
      System.out.println(
          "\nLa temperatura mínima del día "
              + results.getDtTxt()
              + " será de: "
              + results.getMain().getTempMin()
              + " ºC y la temperatura máxima será de: "
              + results.getMain().getTempMax()
              + " ºC");
    }
  }

  //  private static void formatDate(DTOWeather dto) {
  //    LocalDate date;
  //    String fecha = "";
  //    for (Result results : dto.getList()) {
  //      fecha = results.getDtTxt().substring(0, 10);
  //      System.out.println(fecha);
  //    }
  //  }
}
