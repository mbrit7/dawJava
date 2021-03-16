/**
 * @author Manuel Brito
 *     <p>The program order 20 numbers that save it in an array with 4 rows and 5 columns.
 */
package arrays2dimen;

import java.util.Scanner;

public class Ej2SumArrayFunction {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Init the array
    // int[][] array = new int[4][5];

    randomNum();

    // Go through the array
    // int rows, columns;
    //    for (int rows = 0; rows < 4; rows++) {
    //      for (int columns = 0; columns < 5; columns++) {
    //        array[rows][columns] = randomNum();
    //        ;
    //      }
    //      System.out.print(array);
    //      System.out.println();
    //    }

    s.close();
  }

  public static void randomNum() {
    for (int i = 1; i <= 20; i++) {
      int randNum = (int) (Math.random() * 21);
      System.out.println(randNum);
    }
  }
}
