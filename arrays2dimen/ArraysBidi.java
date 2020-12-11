/** @author Manuel Brito */
package arrays2dimen;

public class ArraysBidi {

  public static void main(String[] args) {

    /** Create a two dimensions array */
    int[][] array = new int[3][2]; // [rows][columns]

    array[0][0] = 20;
    array[0][1] = 15;
    array[1][0] = 30;
    array[1][1] = 10;
    array[2][0] = 25;
    array[2][1] = 15;

    int fila, columna;
    int count = 1;
    for (fila = 0; fila < 3; fila++) {
      System.out.print("Fila: " + count + "--");
      count++;

      for (columna = 0; columna < 2; columna++) {
        System.out.printf("%10d ", array[fila][columna]);
      }
      System.out.println();
    }
  }
}
