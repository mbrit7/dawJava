/**
 * This program encrypt a file with the caesar method.
 *
 * <p>https://es.wikipedia.org/wiki/Cifrado_C%C3%A9sar
 *
 * @author Manuel Brito
 */
package files.CaesarCipher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Encription {
  private static final String PATH =
      "C:\\Users\\manue\\Prog2020-21\\Java\\src\\files\\CaesarCipher\\";

  public static void main(String[] args) {
    finishIfTheNumberOfArgsIsIncorrect(args);

    try {
      String fileToEncrypt = PATH + "text.txt";
      String encryptedFile = PATH + "encryptedFile.txt";

      encryptFile(fileToEncrypt, encryptedFile);

    } catch (IOException e) {
      System.out.println("\nCan't read the file: " + e.getMessage());
    }
  }

  private static void finishIfTheNumberOfArgsIsIncorrect(String[] args) {
    if (args.length < 1 || args.length > 2) {
      System.err.println("Incorrect number of arguments");
      System.exit(1);
    }
  }

  //  Method that encrypt the data of a file
  private static void encryptFile(String fileToEncrypt, String encryptedFile) throws IOException {
    var file = openFileForRead(fileToEncrypt);

    var encryptingFile = creatingNewFileForWrite(encryptedFile);

    writtingInTheNewFile(file, encryptingFile);

    encryptingFile.close();
    System.out.println("File writed");
  }

  private static void writtingInTheNewFile(BufferedReader file, BufferedWriter encryptingFile)
      throws IOException {
    String line;
    while ((line = file.readLine()) != null) {
      encryptingFile.write(line);
      encryptingFile.newLine();
      encryptingFile.write("Estoy cifrando el archivo");
    }
  }

  private static BufferedWriter creatingNewFileForWrite(String encryptedFile) throws IOException {
    String encryptedFilePath = encryptedFile;
    var encryptingFile =
        Files.newBufferedWriter(
            Paths.get(encryptedFilePath),
            StandardOpenOption.CREATE,
            StandardOpenOption.APPEND); // Create a new file for write in it
    return encryptingFile;
  }

  private static BufferedReader openFileForRead(String fileToEncrypt) throws IOException {
    String filePath = fileToEncrypt;
    var file = Files.newBufferedReader(Paths.get(filePath));
    return file;
  }
}
