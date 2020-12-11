/**
 * @author Manuel Brito
 *     <p>The program order 20 numbers that save it in an array with 4 rows and 5 columns.
 *     <p>Fill the array with numbers between 100 and 999.
 */
package arrays2dimen;

public class Ej3SumArray {

  public static void main(String[] args) {

    //    Scanner s = new Scanner(System.in);

    /** Init the array */
    int[][] array = new int[4][5];

    /** Go through the array and add a random number between 0 and 20 to the array. */
    for (int rows = 0; rows < 4; rows++) {
      for (int columns = 0; columns < 5; columns++) {

        for (int i = 1; i <= 20; i++) {
          int randNum = (int) (Math.random() * 21);
          array[rows][columns] = randNum;
        }
        System.out.printf("%-10d %5s", array[rows][columns], "suma ");
        //        System.out.printf("%10s", "Suma");
      }
      System.out.println();
    }
  }
}
