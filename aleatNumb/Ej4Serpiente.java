/**
 * Author: Manuel Brito
 *
 * <p>Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. La
 * cabeza se representará con el carácter @ y se debe colocar exactamente en la posición 13 (con 12
 * espacios delante). A partir de ahí, el cuerpo irá serpenteando de la siguiente manera: se
 * generará de forma aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una posición a la
 * derecha del anterior. La longitud de la serpiente se pedirá por teclado y se supone que el
 * usuario introducirá un dato correcto.
 */
package aleatNumb;

import java.util.Scanner;

public class Ej4Serpiente {

  public static void main(String[] args) {

    System.out.println("SNAKE\n");

    Scanner s = new Scanner(System.in);

    System.out.println("Tell me the length of the snake: ");

    // for print the head of the snake with 12 spaces
    for (int i = 1; i <= 12; i++) {
      //      System.out.print("-");
      System.out.print(" ");
    }
    System.out.print("@");

    s.close();
  }
}
