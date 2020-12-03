/**
 * Author: Manuel Brito
 *
 * <p>Program that convert a decimal number to palotes system.
 *
 * <p>This system consist in a list of | depending in the number. if the number is 4, in palotes
 * system is | | | |
 */
package loops;

import java.util.Scanner;

public class Ej37PalotesSystem {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("\nTell me a positive integer number: ");
    String num = s.next();

    int lenNum = num.length();

    int numInt = Integer.parseInt(num);
    System.out.println(numInt);
    System.out.println(lenNum);

    while (lenNum > 1) {
      System.out.println(numInt / (10 ^ (lenNum--)));
      break;
    }

    //    for (int i = 1; i <= lenNum; i++) {
    //      System.out.println(i);
    //    }

    //    int n1 = num / 100;
    //    System.out.println(n1 + "\n");
    //
    //    for (int i = 0; i < n1; i++) {
    //      System.out.print("|");
    //    }

    s.close();
  }
}
