/*
 * Author: Manuel Brito
 * Program that show all the prime numbers between 2 and 100; 2 and 100 are include.
 *
 * #Prime number: When a number have only two different positive divisors: 1 and the number.
 *
 */
package repetitivas;

import java.util.Scanner;

public class Ej22PrimeNumbers {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    for (int i = 2; i <= 100; i++) {

      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          System.out.println(i + "No es primo");
        }

        s.close();
      }
    }
  }
}
