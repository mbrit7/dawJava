/*
 * Author: Manuel Brito
 * Programa que muestra los números del 320 al 160, contando de 20 en 20 hacia atrás.
 *
 */

package repetitivas;

public class Ej5de20en20 {

  public static void main(String[] args) {

    int i = 320;
    while (i >= 160) {
      System.out.println(i);
      i -= 20;
    }
  }
}
