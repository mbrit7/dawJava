/**
 * Program that remove the comments in a java program.
 *
 * @author Manuel Brito
 */
package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ej5RemoveComments {
  public static void main(String[] args) {
    finishIfTheNumberOfArgsIsIncorrect(args);

    // Path of the fileWithComments =
    // C:\\Users\\manue\\Prog2020-21\\Java\\src\\files\\JavaExampleForRemoveComments.java;

    String fileWithComments = args[0];
    String noCommentsFile = args[1];

    try {

      writtingInTheFile(fileWithComments, noCommentsFile);

    } catch (IOException e) {
      System.out.println("Can't open the file");
      System.out.println(e.getClass());
    }
  }

  private static void writtingInTheFile(String fileWithComments, String noCommentsFile)
      throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(fileWithComments));

    BufferedWriter fileWithNoComments = new BufferedWriter(new FileWriter(noCommentsFile));

    for (int i = 0; i < lines.size(); i++) {
      String line = lines.get(i);

      if (!blockComment(line) || !lineComment(line)) {
        fileWithNoComments.write(line);
        fileWithNoComments.newLine();
      }
    }
    System.out.println("Program writed");
    fileWithNoComments.close();
  }

  private static boolean blockComment(String line) {
    return line.contains("/**") || line.contains("*/") || line.contains("*");
  }

  private static boolean lineComment(String line) {
    return line.contains("//");
  }

  private static void finishIfTheNumberOfArgsIsIncorrect(String[] args) {
    if (args.length < 1 || args.length > 2) {
      System.err.println("Incorrect number of arguments");
      System.exit(1);
    }
  }
}
