/*
 * Author: Manuel Brito
 * Program that read a list of ten numbers a show the quantity of positive and negatives
 * numbers.
 */

package loops;

import java.util.Scanner;

public class Ej13PositiveAndNegatives {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("--- Tell me ten numbers ---");
    System.out.println("The program show the quantity of positive and negatives numbers");

    // Start the positive and negative counter
    int positive = 0;
    int negative = 0;

    // To order ten numbers
    for (int i = 0; i < 11; i++) {

      System.out.print("\nTell me a number: ");
      int number = s.nextInt();

      if (number >= 0) {
        positive += 1;

      } else {
        negative += 1;
      }
    }
    System.out.println("\nPositive numbers = " + positive);
    System.out.println("Negative numbers = " + negative);
    s.close();
  }
}
