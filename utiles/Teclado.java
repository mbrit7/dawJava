package utiles;

import java.util.NoSuchElementException;
import java.util.Scanner;

/** Permite lectura desde teclado */
public class Teclado {

  static Scanner scanner = new Scanner(System.in);

  /**
   * Lee un carácter del teclado
   *
   * @return carácter introducido por el usuario
   */
  public static char leerCaracter() {
    char caracter;
    try {
      caracter = scanner.next().charAt(0);
    } catch (Exception e) {
      caracter = 0;
    }
    return caracter;
  }

  /**
   * Lee un carácter del teclado
   *
   * @param msj mensaje mostrado al usuario
   * @return carácter introducido por el usuario
   */
  public static char leerCaracter(String msj) {
    System.out.print(msj);
    return leerCaracter();
  }

  /**
   * Lee una cadena del teclado
   *
   * @param msj mensaje mostrado al usuario
   * @return cadena introducida por el usuario
   */
  public static String leerCadena(String msj) {
    System.out.print(msj);
    return leerCadena();
  }

  /**
   * Lee una cadena del teclado
   *
   * @return cadena introducida por el usuario
   */
  public static String leerCadena() {
    String cadena;
    try {
      cadena = scanner.nextLine(); // Lee una línea de texto (hasta intro)
    } catch (NoSuchElementException e) {
      cadena = "";
    } catch (IllegalStateException e) {
      cadena = "";
    }
    return cadena;
  }

  /**
   * Lee un entero del teclado
   *
   * @return entero introducido por el usuario
   */
  public static int leerEntero() {
    boolean comprobar = true;
    int x;
    do {
      try {
        x = Integer.parseInt(leerCadena().trim());
        comprobar = false;

      } catch (Exception e) {
        x = 0;
      }

    } while (comprobar);
    return x;
  }

  /**
   * Lee una entero del teclado
   *
   * @param msj mensaje mostrado al usuario
   * @return entero introducida por el usuario
   */
  public static int leerEntero(String msj) {
    System.out.print(msj);
    return leerEntero();
  }

  /**
   * Lee un decimal del teclado
   *
   * @return decimal introducido por el usuario
   */
  public static double leerDecimal() {
    double x;
    try {
      x = Double.parseDouble(leerCadena().trim());
    } catch (Exception e) {
      x = 0;
    }
    return x;
  }

  /**
   * Lee una decimal del teclado
   *
   * @param msj mensaje mostrado al usuario
   * @return decimal introducida por el usuario
   */
  public static double leerDecimal(String msj) {
    System.out.print(msj);
    return leerDecimal();
  }
}
