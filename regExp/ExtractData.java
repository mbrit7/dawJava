package regExp;

import static regExp.Patterns.DATE;
import static regExp.Patterns.DNI;
import static regExp.Patterns.LICENSE_PLATE;
import static regExp.Patterns.getCompiledPattern;
import static regExp.Patterns.showingRegExpFound;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

public class ExtractData {

  private static final String PATH = "C:/Users/manue/Prog2020-21/Java/src/regExp/";

  public static void main(String[] args) {

    validateArgs(args);

    try {

      String filename = fileWhereIsDataToExtract(args);

      whatExtract(args[1], filename);

    } catch (IOException e) {
      System.out.println("\nFile Error: " + e.getMessage());
    }
  }

  private static String fileWhereIsDataToExtract(String[] args) {
    String filename = PATH + args[0];
    return filename;
  }

  private static void validateArgs(String[] args) {
    if (args.length < 2) {
      System.err.println("\nInvalid Number Of Arguments");
      System.exit(0);
    }
  }

  private static void whatExtract(String value, String filename) throws IOException {
    Map<String, String> regExpToExtract = creatingMapWithOptionsOfRegExp();

    ifTheValueIsOnTheMapShowTheData(value, filename, regExpToExtract);

    System.err.println("\nIntroduce a correct value to search");
  }

  private static Map<String, String> creatingMapWithOptionsOfRegExp() {
    Map<String, String> regExpToExtract =
        Map.of("dni", DNI, "license", LICENSE_PLATE, "date", DATE);
    return regExpToExtract;
  }

  private static void ifTheValueIsOnTheMapShowTheData(
      String value, String filename, Map<String, String> regExpToExtract) throws IOException {
    if (regExpToExtract.containsKey(value)) {
      showingRegExpFound(filename, compilingTheRegExp(value, regExpToExtract));
    }
  }

  private static Pattern compilingTheRegExp(String value, Map<String, String> regExpToExtract) {
    return getCompiledPattern(regExpToExtract.get(value));
  }

  // The map ^^ act like a switch case
  //
  //    switch (value) {
  //      case "dni":
  //        showingRegExpFound(filename, getPatternDni());
  //        break;
  //
  //      case "license":
  //        showingRegExpFound(filename, getPatternLicensePlate());
  //        break;
  //
  //      case "date":
  //        showingRegExpFound(filename, getPatternDate());
  //        break;
  //
  //      default:
  //        System.err.println("\nIntroduce a correct value to search");
  //        break;
  //    }
}
