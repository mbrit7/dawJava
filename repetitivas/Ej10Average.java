/*
 * Author: Manuel Brito
 * Program that show the mean of some numbers.
 * The program show the mean when the user write a negative number.
 *
 *
 */

package repetitivas;

import java.util.Scanner;

public class Ej10Average {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("---The Mean---");

    try {

      // numbers
      System.out.println("\nTell me a positive number: ");
      double nums = s.nextDouble();

      int contNums = 0; // to count

      // loop for show positive numbers
      while (nums > 0) {
        System.out.println("\nTell me a positive number: ");
        nums = s.nextDouble();

        contNums++;
        double addition = nums + nums;

        if (nums < 0) {
          nums = 0;

          System.out.println(addition);
          System.out.println(contNums);

          // Show the mean of the numbers
          System.out.println("\nThe mean is: " + (addition / contNums));
        }
      }

    } catch (Exception e) {
      System.out.println(e);
      System.out.println("Error");
    }
    s.close();
  }
}
