/**
 * @author Manuel Brito Program give the position where is the max and min number. The array has six
 *     rows and ten columns with numbers between 0 and 1000.
 */
package arrays2dimen;

public class Ej5Array6x10Max {

  public static void main(String[] args) {

    /** Init the array */
    int[][] array = new int[6][10];

    /** Go through the array */
    for (int rows = 0; rows < 6; rows++) {
      for (int columns = 0; columns < 10; columns++) {

        /**
         * Generate thirty random integer numbers between 0 and 1000.
         *
         * <p>Add it to the array
         */
        for (int i = 0; i < 30; i++) {
          int randomN = (int) (Math.random() * 1001);
          array[rows][columns] = randomN;
          maxNum(randomN);
        }

        //        System.out.print(array[rows][columns] + "\t");
      }
      System.out.println("\n");
    }
  }

  /**
   * Function to know the max number
   *
   * @param num introduced number to know if is max
   * @return the max number
   */
  public static int maxNum(int num) {
    int max = Integer.MIN_VALUE;
    if (num > max) {
      max = num;
    }
    return max;
  }
}
