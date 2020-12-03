/*
 * Author: Manuel Brito
 * Program for the security of a vault.
 * The correct combination is a number of four digits, the user has four opportunities.
 *
 * If the the combination is correct: "La caja fuerte se ha abierto satisfactoriamente"
 * Else: "Lo siento, esa no es la combinación"
 *
 */

package loops;

import java.util.Scanner;

public class Ej7AccessControl {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("--- The Security Vault ---");

    try {

      // op are the opportunities
      for (int op = 0; op != 4; op++) {

        // I order the user to write a number with four digits
        System.out.print("\nTell me a number with four digits: ");
        String userNumber = sc.nextLine();

        if (userNumber.length() == 4) {
          System.out.println("\nThat's the correct combination, congrats");
          break;

        } else {
          System.out.println("\nSorry, the combination is different");
          System.out.println("You have " + (3 - op) + " opportunities left");
        }
      }

    } catch (Exception e) {
      System.out.println(e);
      System.out.println("Err0r");
    }
    sc.close();
  }
}
