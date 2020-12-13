/**
 * @author Manuel Brito
 *     <p>Program give the position where is the max and min number. The array has six rows and ten
 *     columns with numbers between 0 and 1000.
 */
package arrays2dimen;

public class Ej6Array6x10MaxMin {

  /** Init the constants */
  static final int ROWS = 6;

  static final int COLUMS = 10;
  static final int FIRST_RANDOM = 0;
  static final int LAST_RANDOM = 1000;

  public static void main(String[] args) {

    /** Init the array */
    int[][] array = new int[ROWS][COLUMS];

    /** Calling the functions */
    fillArray(array);
    showArray(array);

    System.out.println();

    /** Calculate the max and min number */
    int max = maxNumber(array);
    int min = minNumber(array);

    maxMinPosition(array, max, min);
  }

  /**
   * Function for fill an array passing it via parameter. Fill it with thirty random integer numbers
   * between 0 and 1000.
   *
   * @param array the array to fill
   * @return the filled array
   */
  public static int[][] fillArray(int[][] array) {
    for (int ROWS = 0; ROWS < 6; ROWS++) {
      for (int COLUMS = 0; COLUMS < 10; COLUMS++) {

        // Generate thirty random numbers between 0 and 1000
        for (int j2 = 0; j2 < 30; j2++) {
          int randomNum = FIRST_RANDOM + (int) (Math.random() * (LAST_RANDOM - FIRST_RANDOM + 1));
          array[ROWS][COLUMS] = randomNum;
        }
      }
    }
    return array;
  }

  /**
   * Function that show in screen the array passed via parameter
   *
   * @param array the array to show
   */
  public static void showArray(int[][] array) {
    for (int row = 0; row < ROWS; row++) {
      for (int colums = 0; colums < COLUMS; colums++) {
        System.out.printf("%5d ", array[row][colums]);
      }
      System.out.println();
    }
  }

  /**
   * Function to show the max number in a array
   *
   * @param array the array that we want to know the max number
   */
  public static int maxNumber(int[][] array) {
    int max = Integer.MIN_VALUE;
    for (int row = 0; row < ROWS; row++) {
      for (int colums = 0; colums < COLUMS; colums++) {

        if (array[row][colums] > max) {
          max = array[row][colums];
        }
      }
    }

    return max;
  }

  /**
   * Function to show the min number in a array
   *
   * @param array the array that we want to know the min number
   */
  public static int minNumber(int[][] array) {
    int min = Integer.MAX_VALUE;
    for (int row = 0; row < ROWS; row++) {
      for (int colums = 0; colums < COLUMS; colums++) {

        if (array[row][colums] < min) {
          min = array[row][colums];
        }
      }
    }
    return min;
  }

  /**
   * Function to know the position of the max and min number of an array
   *
   * @param array the initial array
   * @param max the max number of the array
   * @param min the min number of the array
   */
  public static void maxMinPosition(int[][] array, int max, int min) {
    // Go through the array to know the position where is the max and min number
    for (int rowNum = 0; rowNum < ROWS; rowNum++) {
      for (int columnNum = 0; columnNum < COLUMS; columnNum++) {
        if (array[rowNum][columnNum] == max) {
          System.out.println(
              "The max " + max + " is in the row " + rowNum + " column " + columnNum);
        } else if (array[rowNum][columnNum] == min) {
          System.out.println(
              "The min " + min + " is in the row " + rowNum + " column " + columnNum);
        }
      }
    }
  }
}
