package exam2Trimestre;

import java.io.IOException;

import utiles.Menu;
import utiles.Teclado;

/** @author Manuel Brito */
public class TestCyclistsProgram {

  private static final String PATH = "C:\\Users\\manue\\Prog2020-21\\Java\\src\\exam2Trimestre\\";

  // Creating the menu
  static String menuTitle = "Menú Almacén";
  static String[] menuOptions = {
    "Cargar datos etapas",
    "Mostrar ganador de la vuelta",
    "Mostrar ganador de una etapa",
    "Mostrar ganadores de cada etapa",
    "Guardar ganadores de cada etapa en un fichero CSV",
    "Mostrar tabla de tiempos",
    "Finalizar"
  };

  static Menu menu = new Menu(menuTitle, menuOptions);

  static CyclistsTour cyt = new CyclistsTour();

  public static void main(String[] args) {
    int option;
    boolean generatedData = false;

    do {
      isDataGenerated(generatedData);
      option = menu.gestionarMenu();

      switch (option) {
        case 1:
          importDataPhases();
          generatedData = true;
          break;

        case 2:
          showWinnerTour();
          break;

        case 3:
          showWinnerOfAPhase();
          break;

        case 4:
          // all phases
          showWinnerOfAPhase();
          break;

        case 5:
          exportWinnersPhasesToCSV();
          break;

        case 6:
          showTimeTable();
          break;

        case 7:
          System.out.println("ADIOSSS");
          System.exit(0);
          break;
      }
    } while (option != 8);
  }

  private static void isDataGenerated(boolean generatedData) {
    if (generatedData) {
      System.out.println("\n--Generated the data about cyclists--\n\n");
    } else {
      System.out.println("\n--The data about cyclists aren't generated--\n\n");
    }
  }

  private static void showTimeTable() {
    cyt.list();
  }

  private static void exportWinnersPhasesToCSV() {}

  private static void showWinnerOfAPhase() {}

  private static void showWinnerTour() {}

  private static void importDataPhases() {

    try {
      String nameFile =
          Teclado.leerCadena(
              "\nDime el nombre del fichero CSV a importar para obtener los datos: ");

      cyt.importCSV(PATH + nameFile);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
