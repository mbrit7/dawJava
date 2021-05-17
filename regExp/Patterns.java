package regExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {
  static final String DNI = "\\d{8}[A-Z]";
  static final String LICENSE_PLATE = "\\d{4}[A-Z]{3}";
  static final String DATE = "^\\d{2}/[0-1][1-2]/[1-2][0-9]{3}$";

  static Pattern getCompiledPattern(String regExpConst) {
    Pattern regExp = Pattern.compile(regExpConst);
    return regExp;
  }

  static void showingRegExpFound(String filename, Pattern regEx) throws IOException {

    var file = searchingInTheFileTheRegExp(filename, regEx);

    file.close();
  }

  private static BufferedReader searchingInTheFileTheRegExp(String filename, Pattern regExp)
      throws IOException {

    var file = openFile(filename);

    readingTheFile(regExp, file);

    return file;
  }

  private static BufferedReader openFile(String filename) throws IOException {

    var file = Files.newBufferedReader(Paths.get(filename));

    return file;
  }

  private static void readingTheFile(Pattern regExp, BufferedReader file) throws IOException {

    String line;

    while ((line = file.readLine()) != null) {

      findingTheValue(line, regExp);
    }
  }

  static void findingTheValue(String line, Pattern regExp) {
    Matcher m = regExp.matcher(line);

    while (m.find()) {
      System.out.println(m.group(0));
    }
  }
}
