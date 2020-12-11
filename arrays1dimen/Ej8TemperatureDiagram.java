/**
 * @author Manuel Brito
 *     <p>Program that ask for the temperature of every month in a year.
 *     <p>And show a diagram with the data.
 */
package arrays1dimen;

import java.util.Scanner;

public class Ej8TemperatureDiagram {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    /** Init the array */
    int[] data = new int[12];

    /** counter for the months */
    int monthNum = 1;

    /**
     * Ask for the average temperature of the month.
     *
     * <p>Add the temperature to the array
     */
    for (int i = 0; i < data.length; i++) {
      System.out.print("Tell me average temperature of the " + monthNum + " month: ");
      data[i] = s.nextInt();
      monthNum++;
    }

    /** Show the diagram */
    System.out.println("\n---TEMPERATURE DIAGRAM---\n");

    /**
     * 'for' loop to go through the numbers of the array.
     *
     * <p>And print "*" depending in the number
     */
    monthNum = 1;
    for (int i : data) {
      // System.out.println(i);
      System.out.println("Month " + monthNum);
      monthNum++;

      if (i < 0) {
        for (int j = 0; j < i; j++) {

          System.err.print("*");
          System.exit(0);
        }

      } else {
        for (int j = 0; j < i; j++) {
          System.out.print("*");
        }
      }
      System.out.println("\n");
    }
    s.close();
  }
}
