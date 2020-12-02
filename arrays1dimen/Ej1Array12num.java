/**
 * Author: Manuel Brito
 *
 * <p>Create an array with 12 integer numbers
 */
package arrays1dimen;

public class Ej1Array12num {

  public static void main(String[] args) {

    // Initialize the array
    int[] num = new int[12];

    num[0] = 39;
    num[1] = -2;
    //    num[2] = 0;
    //    num[3] = 0;
    num[4] = 0;
    //    num[5] = 1;
    num[6] = 14;
    //    num[7] = 1;
    num[8] = 5;
    num[9] = 120;
    //    num[10] = 1;
    //    num[11] = 1;

    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }
  }
}
