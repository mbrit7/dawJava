/*
 * Programa que muestra los múltiplos de 5 del 0 al 100
 *
 * */

package repetitivas;

public class Ej1multiplos5 {

  public static void main(String[] args) {

    // Con el bucle 'for' recorro los número del 1 al 100 y posteriormente muestro los
    // que son múltiplos de 5
    for (int i = 0; i < 101; i++) {
      if (i % 5 == 0) {
        System.out.println(i);
      }
    }
  }
}
