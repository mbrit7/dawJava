package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;

public class Ej4SortWords {
  public static void main(String[] args) {

    isNumbersArgsValid(args);

    List<String> wordsArray;

    try {
      wordsArray = Files.readAllLines(Paths.get(args[0]));

      sortingArray(wordsArray);

      writtingInTheFile(args, wordsArray);

    } catch (IOException e) {
      System.err.println("No se ha podido realizar la operación.");
      System.exit(-2);
    }
  }

  private static void isNumbersArgsValid(String[] args) {
    if (args.length != 1) {
      System.err.println("Error en el número de argumentos.");
      System.exit(-1);
    }
  }

  private static void sortingArray(List<String> wordsArray) {
    Collections.sort(wordsArray);
  }

  private static void writtingInTheFile(String[] args, List<String> wordsArray) throws IOException {
    var fileWr =
        Files.newBufferedWriter(Paths.get(fileToWrite(args[0])), StandardOpenOption.CREATE);

    for (String r : wordsArray) {
      fileWr.write(r);
      fileWr.newLine();
    }
    fileWr.close();
  }

  private static String fileToWrite(String name) {
    int pointPos = name.lastIndexOf(".");
    String nameFile = name.substring(0, pointPos);
    String extension = name.substring(pointPos);
    return nameFile + "_sort" + extension;
  }
}
