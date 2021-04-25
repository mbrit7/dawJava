/**
 * Program that save in a file the prime numbers between 1 and 500.
 *
 * @author Manuel Brito
 */
package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ej1PrimeNumbers {
  public static void main(String[] args) throws IOException {

    int firstNumber = 1;
    int lastNumber = 500;

    writePrimeNumberInTheFile(firstNumber, lastNumber);
  }

  private static void writePrimeNumberInTheFile(int firstNumber, int lastNumber)
      throws IOException {

    String fileName = "primos.dat";

    var file = Files.newBufferedWriter(Paths.get(fileName), StandardOpenOption.CREATE);

    for (int i = firstNumber; i <= lastNumber; i++) {
      System.out.println(isPrime(i));
    }

    file.close();
  }

  /**
   * Method that return true if the @param is Prime
   *
   * @param i the number to know if is prime
   */
  private static boolean isPrime(int i) {
    if (i % 1 == 0 && i % i > 0) {
      System.out.println(i);
      return false;
    } else {
      return true;
    }
  }
}
