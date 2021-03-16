package oop.time;

/** @author Manuel Brito */
public class TimeTest {

  /** @param args */
  public static void main(String[] args) {

    /** Creating a new object */
    Time time1 = new Time(1, 35, 20);
    Time time2 = new Time(3, 30, 20);

    System.out.println("\nTime1 = " + time1.toString());
    System.out.println("Time2 = " + time2.toString());
    System.out.println();

    /** To organize the code */
    for (int i = 0; i <= 60; i++) {
      System.out.print("-");
    }
    System.out.println();

    /** Adding and subtracting objects */
    System.out.println(
        "\nThe addition of "
            + time1.toString()
            + "and "
            + time2.toString()
            + "is "
            + time1.sumToObject(time2));

    System.out.println();

    System.out.println(
        "\nThe subtraction of "
            + time1.toString()
            + "and "
            + time2.toString()
            + "is "
            + time1.subtractObject(time2));

    /** To organize the code */
    for (int i = 0; i <= 60; i++) {
      System.out.print("-");
    }
    System.out.println();
  }
}
