/**
 * Program that remove the comments in a java program.
 *
 * @author Manuel Brito
 */
package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ej5RemoveComments {
  public static void main(String[] args) {
    String filePath = "C:\\Users\\manue\\Prog2020-21\\Java\\src\\files\\JavaExample.java";

    try {
      List<String> lines = Files.readAllLines(Paths.get(filePath));

      for (int i = 0; i < lines.size(); i++) {
        String line = lines.get(i);

        if (blockComment(line) || lineComment(line)) {
          lines.remove(line);
        } else {
          System.out.println(line);
        }
      }
    } catch (IOException e) {
      System.out.println("Can't open the file");
      System.out.println(e.getClass());
    }
  }

  private static boolean blockComment(String line) {
    return line.contains("/**") || line.contains("*/") || line.contains("*");
  }

  private static boolean lineComment(String line) {
    return line.contains("//");
  }
}
