package files.CaesarCipher;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Programa que encripta un fichero que le pasamos como parámetro y almacena el resultado en otro,
 * que también pasamos como parámetro, de manera que:
 *
 * <p>- Si el programa no recibe uno o dos parámetros termina con un error 1. - Si el programa
 * recibe un solo parámetro guardará la información encriptada en el mismo archivo del que lee, pero
 * antes advertirá al usuario de que machacará el archivo origen, dando opción a que la operación no
 * se haga. - Si el fichero origen no existe (da error al abrirlo como lectura) el programa termina
 * con un mensaje de error y código 2. - Si en el fichero destino no se puede escribir (da error al
 * abrirlo como escritura) el programa termina con un mensaje de error y código 3.
 *
 * <p>Para encriptar usamos el método César, necesitaremos una clave que hay que pedir al usuario.
 */
public class Encripta {

  public static void main(String[] args) {
    finishIfTheNumberOfArgsIsIncorrect(args);

    // Path where is the file to encrypt =
    // C:\\Users\\manue\\Prog2020-21\\Java\\src\\files\\CaesarCipher\\text.txt

    List<String> lines = getFileLines(args[0]);

    try (var encriptedFile = new BufferedWriter(new FileWriter(args[1]))) {

      for (String line : lines) {
        encriptedFile.write(encrypt(line));
        encriptedFile.newLine();
      }
      System.out.println("File Encripted");

    } catch (IOException e) {
      System.err.println("Error writting " + args[1]);
      System.exit(3);
    }
  }

  private static void finishIfTheNumberOfArgsIsIncorrect(String[] args) {
    if (args.length < 1 || args.length > 2) {
      System.err.println("Number of arguments incorrect");
      System.exit(1);
    }
  }

  private static List<String> getFileLines(String file) {
    List<String> lines = null;
    try {
      lines = Files.readAllLines(Paths.get(file));
    } catch (IOException e) {
      System.err.println("I can't open " + file);
      System.exit(2);
    }
    return lines;
  }

  private static String encrypt(String line) {
    // TODO Encriptar la línea

    //    int password = Teclado.leerEntero("Tell me a positive number: ");

    return "ENCRIPTAR " + line;
  }
}
