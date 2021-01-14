/** @author Manuel Brito */
package examen;

import java.util.Scanner;

public class CyclismV2 {

  static final int ROWSCYCLISTPHASE = 15;
  static final int COLUMNSCYCLISTPHASE = 5;

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    /** Initialise the array with 15 rows and 5 columns */
    int[][] cyclistPhaseTimeArray = new int[ROWSCYCLISTPHASE][COLUMNSCYCLISTPHASE];

    /** Initialise the array with 15 rows(number of the cyclist) */
    int[] cyclistNumber = new int[ROWSCYCLISTPHASE];

    /** Initialise the array with 15 rows(cyclist name) */
    String[] cyclistName = new String[15];
    for (int i = 0; i < cyclistName.length; i++) {
      cyclistName[i] = "cyclist " + (i + 1);
    }

    /** Initialise the array where I save the total time of the phases of every cyclist */
    int[] totalTimeOfCyclists = new int[ROWSCYCLISTPHASE];

    int option;
    boolean continuar = true;
    boolean generatedData = false;

    do {
      option = menu(generatedData);
      switch (option) {
        case 1:
          generateCyclistNumber(cyclistNumber);
          generateTimePhase(cyclistPhaseTimeArray);
          generatedData = true;
          generateTotalTimePhase(cyclistPhaseTimeArray, totalTimeOfCyclists);
          break;

        case 2:
        case 3:
        case 4:
        case 5:
          if (generatedData) {
            switch (option) {
              case 2:
                System.out.println();
                showWinnerTour(
                    cyclistName, cyclistNumber, cyclistPhaseTimeArray, totalTimeOfCyclists);

                break;

              case 3:
                System.out.print("\nTell me a phase number, between 1 and 5: ");
                int numPhase = s.nextInt();

                while (numPhase < 1 || numPhase > 5) {
                  System.err.println("\nA number between 1 and 5");
                  System.out.print("\nTell me a phase number, between 1 and 5: ");
                  numPhase = s.nextInt();
                }

                if (numPhase >= 1 || numPhase <= 5) {
                  showWinnerOfAPhase(cyclistName, cyclistNumber, cyclistPhaseTimeArray, numPhase);
                }

                break;

              case 4:
                // Go through the number of phases
                int numberPhase = 1;
                for (int i = 1; i <= 5; i++) {
                  showWinnerOfAPhase(
                      cyclistName, cyclistNumber, cyclistPhaseTimeArray, numberPhase);
                  numberPhase++;
                }
                break;

              case 5:
                showTimeTable(
                    cyclistNumber, cyclistName, cyclistPhaseTimeArray, totalTimeOfCyclists);

                break;
            }

          } else {
            System.err.println(
                "\nFirst you have to generate the phase's time and the cyclist number");
          }
          break;

        case 6:
          continuar = false;
          break;

        default:
          System.err.println("\nIncorrect Answer, introduce a menu number");
      }
    } while (continuar);
    System.out.println("\n\n¡Bye!");

    s.close();
  }

  /**
   * Function to print in screen winner's tour name
   *
   * @param cyclistName
   * @param cyclistNumber
   * @param cyclistPhaseTimeArray
   * @param totalTimeOfCyclists
   */
  public static void showWinnerTour(
      String[] cyclistName,
      int[] cyclistNumber,
      int[][] cyclistPhaseTimeArray,
      int[] totalTimeOfCyclists) {

    String totalTimeWinner = convertSecondsToHMS(minNumber(totalTimeOfCyclists));
    System.out.println(
        "The winner is "
            + nameWinnerTour(cyclistName, rowMinNumber(totalTimeOfCyclists))
            + " with cyclist number "
            + cyclistNumberWinner(cyclistNumber, rowMinNumber(totalTimeOfCyclists))
            + " and with a time of "
            + totalTimeWinner
            + " HH:MM:SS");
  }

  /**
   * Function to show the time table with the cyclists numbers, cyclists names, phase's time and
   * total time of every cyclist.
   *
   * @param cyclistNumber
   * @param cyclistName
   * @param cyclistPhaseTimeArray
   * @param totalTimeOfCyclists
   */
  public static void showTimeTable(
      int[] cyclistNumber,
      String[] cyclistName,
      int[][] cyclistPhaseTimeArray,
      int[] totalTimeOfCyclists) {

    // Decorators of the table
    for (int i = 1; i <= 165; i++) {
      System.out.print("-");
    }
    System.out.println();

    // Header
    System.out.printf("%10s %20s", "Cyclist Number", "Cyclist Name");
    for (int i = 1; i <= 5; i++) {
      System.out.printf("%20s", "Phase " + i);
    }
    System.out.printf("%20s", "TOTAL");

    System.out.println();

    // Decorators of the table
    for (int i = 1; i <= 165; i++) {
      System.out.print("-");
    }
    System.out.println();

    // Content
    for (int row = 0; row < ROWSCYCLISTPHASE; row++) {
      //      int accumulatorTotalTimeCyclists = 0;
      System.out.printf("%10s %23s", cyclistNumber[row], cyclistName[row]);
      for (int colums = 0; colums < COLUMNSCYCLISTPHASE; colums++) {

        //        accumulatorTotalTimeCyclists += cyclistPhaseTimeArray[row][colums];

        System.out.printf("%20d", cyclistPhaseTimeArray[row][colums]);
      }

      System.out.printf("%20d \n", totalTimeOfCyclists[row]);
      //      System.out.printf("%20d \n", accumulatorTotalTimeCyclists);
    }

    // Decorators of the table
    for (int i = 1; i <= 165; i++) {
      System.out.print("-");
    }
    System.out.println();
  }

  /**
   * Function to show the total time of the phases, adding every number of the row.
   *
   * @param cyclistPhaseTimeArray
   * @return
   */
  public static int[] generateTotalTimePhase(
      int[][] cyclistPhaseTimeArray, int[] totalTimeOfCyclists) {
    for (int row = 0; row < ROWSCYCLISTPHASE; row++) {
      for (int columns = 0; columns < COLUMNSCYCLISTPHASE; columns++) {
        totalTimeOfCyclists[row] += cyclistPhaseTimeArray[row][columns];
      }
    }
    return totalTimeOfCyclists;
  }

  /**
   * Function to show the winner of the phase.
   *
   * @param cyclistNumber
   * @param cyclistName
   * @param array
   * @param numPhase
   */
  public static void showWinnerOfAPhase(
      String[] cyclistName, int[] cyclistNumber, int[][] cyclistPhaseTimeArray, int numPhase) {

    String totalTimeWinner = convertSecondsToHMS(minNumber2Dimen(cyclistPhaseTimeArray, numPhase));
    System.out.println(
        "The winner of the phase "
            + numPhase
            + " is "
            + nameWinnerPhase(cyclistName, rowMinNumber2Dimen(cyclistPhaseTimeArray, numPhase))
            + " with the cyclist number"
            + cyclistNumberWinner(
                cyclistNumber, rowMinNumber2Dimen(cyclistPhaseTimeArray, numPhase))
            + " and with a time of "
            + totalTimeWinner
            + " HH:MM:SS");
  }
  /**
   * Function to show winner's name of a phase
   *
   * @param cyclistName
   * @param maxNumberRow
   * @return the winner of a phase
   */
  public static String nameWinnerPhase(String[] cyclistName, int rowMinNumber) {
    String nameWinner = cyclistName[rowMinNumber];
    return nameWinner;
  }

  /**
   * Function to return winner's tour name
   *
   * @param cyclistName
   * @param rowMinNumber
   * @return
   */
  public static String nameWinnerTour(String[] cyclistName, int rowMinNumber) {
    String nameWinner = cyclistName[rowMinNumber];
    return nameWinner;
  }
  /**
   * Function to return the cyclist number of tour's winner
   *
   * @param cyclistNumber
   * @param rowMinNumber
   * @return
   */
  public static int cyclistNumberWinner(int[] cyclistNumber, int rowMinNumber) {
    int cyclistNumberOfTheWinner = cyclistNumber[rowMinNumber];
    return cyclistNumberOfTheWinner;
  }

  /**
   * Function to return the max number in a two dimensions array
   *
   * @param cyclistPhaseTimeArray
   * @param numPhase
   * @return the max number
   */
  public static int maxNumber(int[][] cyclistPhaseTimeArray, int numPhase) {
    int max = Integer.MIN_VALUE;
    for (int row = 0; row < ROWSCYCLISTPHASE; row++) {
      for (int colums = 0; colums < COLUMNSCYCLISTPHASE; colums++) {

        if (cyclistPhaseTimeArray[row][numPhase - 1] > max) {
          max = cyclistPhaseTimeArray[row][numPhase - 1];
        }
      }
    }

    return max;
  }

  /**
   * Function to show in which row is the max number
   *
   * @param cyclistPhaseTimeArray
   * @param column is the phase number
   * @return the row where the max number is
   */
  public static int rowMaxNumber(int[][] cyclistPhaseTimeArray, int column) {
    int max = Integer.MIN_VALUE;
    int rowMax = 0;
    for (int row = 0; row < ROWSCYCLISTPHASE; row++) {
      for (int colums = 0; colums < COLUMNSCYCLISTPHASE; colums++) {

        if (cyclistPhaseTimeArray[row][column - 1] > max) {
          max = cyclistPhaseTimeArray[row][column - 1];
          rowMax = row;
        }
      }
    }

    return rowMax;
  }
  /**
   * Function to show the min number in a two dimensions array
   *
   * @param cyclistPhaseTimeArray
   * @param numPhase
   * @return
   */
  public static int minNumber2Dimen(int[][] cyclistPhaseTimeArray, int numPhase) {
    int min = Integer.MAX_VALUE;
    for (int row = 0; row < ROWSCYCLISTPHASE; row++) {
      for (int colums = 0; colums < COLUMNSCYCLISTPHASE; colums++) {

        if (cyclistPhaseTimeArray[row][numPhase - 1] < min) {
          min = cyclistPhaseTimeArray[row][numPhase - 1];
        }
      }
    }

    return min;
  }

  /**
   * Function to show in which row is the min number
   *
   * @param cyclistPhaseTimeArray
   * @param column is the phase number
   * @return the row where the max number is
   */
  public static int rowMinNumber2Dimen(int[][] cyclistPhaseTimeArray, int column) {
    int min = Integer.MAX_VALUE;
    int rowMin = 0;
    for (int row = 0; row < ROWSCYCLISTPHASE; row++) {
      for (int colums = 0; colums < COLUMNSCYCLISTPHASE; colums++) {

        if (cyclistPhaseTimeArray[row][column - 1] < min) {
          min = cyclistPhaseTimeArray[row][column - 1];
          rowMin = row;
        }
      }
    }

    return rowMin;
  }

  /**
   * Function to show the min number in an array
   *
   * @param totalTimePhase
   * @return the min number
   */
  public static int minNumber(int[] totalTimeOfCyclists) {
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < totalTimeOfCyclists.length; i++) {
      if (totalTimeOfCyclists[i] < min) {
        min = totalTimeOfCyclists[i];
      }
    }

    return min;
  }

  /**
   * Function to show in which row is the min number
   *
   * @param totalTimeOfCyclists
   * @return the row where is the min number
   */
  public static int rowMinNumber(int[] totalTimeOfCyclists) {
    int min = Integer.MAX_VALUE;
    int rowMin = 0;

    for (int row = 0; row < totalTimeOfCyclists.length; row++) {
      if (totalTimeOfCyclists[row] < min) {
        min = totalTimeOfCyclists[row];
        rowMin = row;
      }
    }

    return rowMin;
  }

  /**
   * Function to convert a given time in seconds to hours, minutes and seconds.
   *
   * @param seconds the given seconds
   * @return the time in the specified format
   */
  public static String convertSecondsToHMS(int seconds) {
    int hours = seconds / 3600;
    int secs = seconds % 3600;
    int min = secs / 60;
    secs = secs % 60;

    return String.format("%02d:%02d:%02d", hours, min, secs);
  }
  /**
   * Function for generate non repeatable random numbers between 1 and 99 and for fill the
   * 'cyclistNumber' array.
   *
   * @param cyclistNumber the array that we want to fill with random numbers
   * @return the array
   */
  public static int[] generateCyclistNumber(int[] cyclistNumber) {
    int firstRandom = 1;
    int lastRandom = 99;

    /**
     * In this array I will save true if the random number is in the array and false if isn't in the
     * array
     */
    boolean[] isInArray = new boolean[lastRandom - firstRandom + 1];

    /** Initialise the array with false, now we don`t any number repeated. */
    for (int i = 0; i < isInArray.length; i++) {
      isInArray[i] = false;
    }

    /** Go through the array 'array' */
    for (int j = 0; j < cyclistNumber.length; j++) {

      // Generating the random numbers between 0 and 1000
      int randomNum;
      do {

        randomNum = firstRandom + (int) (Math.random() * (lastRandom - firstRandom + 1));

      } while (isInArray[randomNum - firstRandom]);

      isInArray[randomNum - firstRandom] = true;

      cyclistNumber[j] = randomNum;
    }
    return cyclistNumber;
  }
  /**
   * Function to create random number between 10000 and 19999 and save it in an array.
   *
   * @param cyclistPhaseTimeArray the array where we want to save the numbers
   */
  public static void generateTimePhase(int[][] cyclistPhaseTimeArray) {
    int firstRandom = 10000;
    int lastRandom = 19999;

    for (int row = 0; row < ROWSCYCLISTPHASE; row++) {
      for (int colums = 0; colums < COLUMNSCYCLISTPHASE; colums++) {
        for (int i = 0; i < cyclistPhaseTimeArray.length; i++) {
          int randomNum = firstRandom + (int) (Math.random() * (lastRandom - firstRandom + 1));
          cyclistPhaseTimeArray[row][colums] = randomNum;
        }
      }
    }
  }

  /**
   * Function that show in screen the data of a two dimensions array, passed via parameter.
   *
   * @param cyclistPhaseTimeArray the array to show
   */
  public static void show2dimenArray(int[][] cyclistPhaseTimeArray) {
    for (int row = 0; row < ROWSCYCLISTPHASE; row++) {
      for (int colums = 0; colums < COLUMNSCYCLISTPHASE; colums++) {
        System.out.printf("%5d ", cyclistPhaseTimeArray[row][colums]);
      }
      System.out.println();
    }
    System.out.println();
  }

  /**
   * Function to show in screen the data of an array
   *
   * @param array
   */
  public static void showArray(int[] array) {
    for (int i : array) {
      System.out.println(i);
    }
  }

  /**
   * Function to show in screen the data of a string type array
   *
   * @param array
   */
  public static void showStringArray(String[] array) {
    for (String i : array) {
      System.out.println(i);
    }
  }

  /**
   * Function to show the menu of the program.
   *
   * @param data
   * @return
   */
  public static int menu(boolean data) {
    // write the menu
    System.out.println();
    System.out.println("Options Menu");
    System.out.println("----------------");
    System.out.println("1. Generate phase time and cyclist number.");
    System.out.println("2. The Winner.");
    System.out.println("3. Show winner of a phase.");
    System.out.println("4. Show winners of the phases.");
    System.out.println("5. Show time table.");
    System.out.println("6. Finish\n");

    // the data are generated
    if (data) {
      System.out.println("--Generated the phase time and cyclist number--\n\n");
    } else {
      System.out.println("--The phase time and cyclist number aren't generated--\n\n");
    }

    // read the option
    @SuppressWarnings("resource")
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce an option: ");
    return s.nextInt();
  }
}
