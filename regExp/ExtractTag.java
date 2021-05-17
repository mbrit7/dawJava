package regExp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program that extract the text of a html tag.
 *
 * <p>The url and the tag are introduced via parameter.
 *
 * @author Manuel Brito
 */
public class ExtractTag {

  public static void main(String[] args) {

    validateArgs(args);

    try {

      String html = getHtml(args[0]);

      getPattern(html, args[1]);

    } catch (IOException e) {

      System.err.println("\nFile Error: " + e.getMessage());

    } catch (InterruptedException e) {

      System.err.println("\nInterrupted Thread Error: " + e.getMessage());
    }
  }

  static void getPattern(String html, String tag) {

    String regExpHtml = "<" + tag + "[^>]*>(.*?)</" + tag + ">";

    Pattern regExp = Pattern.compile(regExpHtml, Pattern.DOTALL);

    Matcher m = regExp.matcher(html);

    while (m.find()) {
      System.out.println(m.group(1));
    }
  }

  private static void validateArgs(String[] args) {
    if (args.length < 2) {
      System.err.println("\nInvalid Number Of Arguments");
      System.exit(0);
    }
  }

  private static String getHtml(String url) throws IOException, InterruptedException {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

    return response.body();
  }
}
