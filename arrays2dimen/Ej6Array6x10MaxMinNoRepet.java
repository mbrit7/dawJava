/**
 * @author Manuel Brito
 *     <p>Program give the position where is the max and min number. The array has six rows and ten
 *     columns with numbers between 0 and 1000 without repeating any number.
 */
package arrays2dimen;

public class Ej6Array6x10MaxMinNoRepet {

  /** Init the constants */
  static final int ROWS = 6;

  static final int COLUMS = 10;
  // final static int FIRST_RANDOM = 0;
  // final static int LAST_RANDOM = 1000;

  public static void main(String[] args) {

    /** Init the array */
    int[][] array = new int[ROWS][COLUMS];

    /** Calling the functions */
    fillArray(array);
    showArray(array);

    System.out.println();

    int max = maxNumber(array);
    int min = minNumber(array);

    maxMinPosition(array, max, min);
  }

  /**
   * Function for fill an array passing it via parameter. Fill it with thirty random
   * integer numbers between 0 and 1000.
   *
   * @param array the array to fill
   * @return the filled array
   */
  public static int[][] fillArray(int[][] array) {
    for (int ROWS = 0; ROWS < 6; ROWS++) {
      for (int COLUMS = 0; COLUMS < 10; COLUMS++) {

        // Generate thirty random numbers between 0 and 1000
        for (int j2 = 0; j2 < 30; j2++) {
          int randomNum = (int) (Math.random() * 1001);
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
    for (int ROWS = 0; ROWS < 6; ROWS++) {
      for (int COLUMS = 0; COLUMS < 10; COLUMS++) {
        System.out.printf("%5d ", array[ROWS][COLUMS]);
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
    for (int ROWS = 0; ROWS < 6; ROWS++) {
      for (int COLUMS = 0; COLUMS < 10; COLUMS++) {

        if (array[ROWS][COLUMS] > max) {
          max = array[ROWS][COLUMS];
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
    for (int ROWS = 0; ROWS < 6; ROWS++) {
      for (int COLUMS = 0; COLUMS < 10; COLUMS++) {

        if (array[ROWS][COLUMS] < min) {
          min = array[ROWS][COLUMS];
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
    for (int rowPosi = 0; rowPosi < ROWS; rowPosi++) {
      for (int columnsPosi = 0; columnsPosi < COLUMS; columnsPosi++) {
        if (array[rowPosi][columnsPosi] == max) {
          System.out.println(
              "The max " + max + " is in the row " + rowPosi + " column " + columnsPosi);
        } else if (array[rowPosi][columnsPosi] == min) {
          System.out.println(
              "The min " + min + " is in the row " + rowPosi + " column " + columnsPosi);
        }
      }
    }
  }
}
