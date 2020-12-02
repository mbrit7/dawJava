/*
 *
 * Author: Manuel Brito
 * Program that ask for the temperature of every month in a year.
 * And show a diagram with the data.
 *
 */

package arrays1dimen;

import java.util.Scanner;

public class Ej8TemperatureDiagram {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int[] data = new int[12];

    int monthNum = 1;

    // Ask for
    for (int i = 0; i < 12; i++) {

      System.out.print("Tell me average temperature of the " + monthNum + " month:");
      data[i] = s.nextInt();
      monthNum++;
    }

    for (int i : data) {
      System.out.println(i);
    }

    s.close();
  }
}
