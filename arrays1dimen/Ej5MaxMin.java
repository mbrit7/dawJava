/**
 * @author Manuel Brito
 *     <p>Program that order 10 numbers and then show the min and max introduced number.
 */
package arrays1dimen;

import java.util.Scanner;

public class Ej5MaxMin {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("--- The program show the min and max introduced number ---\n");
    System.out.println("The user introduce ten numbers...\n");

    // int[] numbers = {5, 1, 6, 3, 8, 3, 12, 45, 56, 10};
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    /** Init the array of numbers */
    int[] numbers = new int[10];

    /** Input ten numbers */
    int counter = 1;
    for (int i = 0; i < 10; i++) {
      System.out.print(counter + ". Tell me a number: ");
      numbers[i] = s.nextInt();
      counter++;
    }

    /**
     * Go through the numbers of the array.
     *
     * <p>If the array's number is greater than the 'max' constant, save in max the number.
     *
     * <p>And with 'min' the same.
     */
    for (int i : numbers) {
      if (i > max) {
        max = i;

      } else if (i < min) {
        min = i;
      }
    }

    System.out.println("\nThe max number is: " + max);
    System.out.println("The min number is: " + min);

    s.close();
  }

  // Show the min and max number

  //    int number = 0;
  //    int number2 = 4;
  //
  //    System.out.println(Math.max(number, number2));

}
