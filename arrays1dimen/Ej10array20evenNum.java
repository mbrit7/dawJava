/**
 * @author Manuel Brito
 *     <p>Program that create twenty integer random numbers between 0 and 100 and save it in an
 *     array. Then show first of all, the even numbers and then the not even numbers.
 */
package arrays1dimen;

public class Ej10array20evenNum {

  public static void main(String[] args) {

    /** Init the array of 20 numbers */
    int[] array = new int[20];

    /** Counter for the index of the array */
    int index = 1;

    /**
     * Generate twenty integer random numbers between 0 and 100.
     *
     * <p>Adding the numbers to the array.
     */
    for (int i = 0; i < 20; i++) {
      int aleatNum = ((int) (Math.random() * 101));
      array[i] = aleatNum;
    }

    /** Showing the array */
    for (int i : array) {

      System.out.print(index + ". " + i + "| ");

      index++;
    }
    System.out.println("\n");

    /** Showing the even numbers in the array */
    for (int i : array) {

      even(i);
    }
  }

  /**
   * Tell if the introduced number is even
   *
   * @param num the introduced number
   */
  public static void even(int num) {

    if (num % 2 == 0) {
      System.out.println(num + " es primo");
    } else {
      System.out.println(num + " no es primo");
    }
  }
}
