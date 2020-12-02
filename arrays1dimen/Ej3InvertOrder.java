/**
 * Author: Manuel Brito
 *
 * <p>The Program read 10 numbers and shows it in reverse order.
 *
 * <p>For instance; The first one will be the last showed.
 */
package arrays1dimen;

import java.util.Scanner;

public class Ej3InvertOrder {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Initialize the array
    int[] num = new int[10];

    // Variable for the length of the array
    int numLength = num.length;

    System.out.println(
        "-- The Program read 10 integer numbers introduced by the user and shows it in reverse order --");

    // Input 10 numbers to the array
    int counter = 0;
    for (int i = 0; i < 10; i++) {
      counter++;
      System.out.print("\n" + counter + ". Tell me a integer number: ");
      num[i] = s.nextInt();
    }

    // Print the array
    System.out.println("\nNumbers of the array: ");
    for (int n : num) {
      System.out.print(n + " ");
    }

    System.out.println("");

    // Print the reversed array
    System.out.println("\nThe numbers in reverse order are: ");
    for (int i = numLength - 1; i >= 0; i--) {
      //      System.out.print(i + " ");
      System.out.print(num[i] + " ");
    }

    s.close();
  }
}
