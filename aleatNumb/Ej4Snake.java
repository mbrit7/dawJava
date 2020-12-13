/**
 * @author Manuel Brito
 *     <p>Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. La
 *     cabeza se representará con el carácter @ y se debe colocar exactamente en la posición 13 (con
 *     12 espacios delante). A partir de ahí, el cuerpo irá serpenteando de la siguiente manera: se
 *     generará de forma aleatoria un valor entre tres posibles que hará que el siguiente carácter
 *     se coloque una posición a la izquierda del anterior, alineado con el anterior o una posición
 *     a la derecha del anterior. La longitud de la serpiente se pedirá por teclado y se supone que
 *     el usuario introducirá un dato correcto.
 */
package aleatNumb;

import java.util.Scanner;

public class Ej4Snake {

  static final int SPACES = 12;

  public static void main(String[] args) {

    System.out.println("SNAKE\n");

    Scanner s = new Scanner(System.in);

    System.out.print("Tell me the length of the snake counting the head: ");
    int length = s.nextInt();

    s.close();

    printTheHead();
    generateRandomNumber(length);
  }

  /**
   * Function that print the first part of the snake, the head. Print an "@" with twelve spaces
   * before.
   */
  public static void printTheHead() {
    System.out.println();
    for (int i = 1; i <= SPACES; i++) {
      //      System.out.print("-");
      System.out.print(" ");
    }
    System.out.print("@");
  }

  /**
   * Function that generate a random number between -1, 0, 1 for change the number of spaces
   *
   * @param lengthSnake for type the length of the snake
   */
  public static void generateRandomNumber(int lengthSnake) {
    System.out.println();
    int firstRandom = -1;
    int lastRandom = 1;
    for (int j = 0; j < lengthSnake - 1; j++) {
      int randomNum = firstRandom + (int) (Math.random() * (lastRandom - firstRandom + 1));
      for (int k = 0; k <= (SPACES - randomNum); k++) {
        //      System.out.print("-");
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}
