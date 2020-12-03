/**
 * Program that draw a "u" with asterisk.
 *
 * <p>- The user introduce the height of the letter.
 */
package loops;

import java.util.Scanner;

public class Ej33DrawU {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Height of the letter
    System.out.print("\nTell me the height of the letter: ");
    int heightU = s.nextInt();
    System.out.println();

    // I use a 'for' loop to create the left vertical line of the letter
    for (int i = 1; i < heightU; i++) {
      System.out.print("*");

      // Then this 'for' for the whitespace between
      for (int j = 1; j <= heightU - 2; j++) {
        System.out.print(" ");
      }
      // I use a 'for' loop to create the right vertical line of the letter
      System.out.println("*");
    }
    // to print the first and last whitespace, in the horizontal line
    System.out.print(" ");

    // to print the horizontal line
    for (int j = 1; j <= heightU - 2; j++) {
      System.out.print("*");
    }

    s.close();
  }
}
