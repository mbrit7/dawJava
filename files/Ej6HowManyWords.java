/**
 * @author Manuel Brito
 *     <p>Program that tell how many occurrences of a word a file have. Name of the file and word
 *     via command line.
 */
package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ej6HowManyWords {
  public static void main(String[] args) {

    finishIfTheNumberOfArgumentsIsIncorrect(args);

    try {

      Scanner file = readArgumentInPositionZero(args);
      String word = readArgumentInPositionOne(args);

      int cont = 0;

      cont = readingFile(file, word, cont);

      System.out.println("El numero de palabras es: " + cont);

    } catch (FileNotFoundException e) {
      System.err.print("No se ha encontrado el archivo");
    }
  }

  private static void finishIfTheNumberOfArgumentsIsIncorrect(String[] args) {
    if (args.length != 2) {
      System.err.println("Error in the number of arguments");
      System.exit(-1);
    }
  }

  private static String readArgumentInPositionOne(String[] args) {
    String word = args[1];
    return word;
  }

  private static Scanner readArgumentInPositionZero(String[] args) throws FileNotFoundException {
    Scanner file = new Scanner(new BufferedReader(new FileReader(args[0])));
    return file;
  }

  private static int readingFile(Scanner file, String word, int cont) {
    String fileWord;
    while (file.hasNext()) {
      fileWord = file.next();
      cont = countingTheWords(word, cont, fileWord);
    }
    return cont;
  }

  private static int countingTheWords(String word, int cont, String fileWord) {
    if (fileWord.equals(word)) {
      cont++;
    }
    return cont;
  }
}
