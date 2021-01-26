package poo.time;

/** @author Manuel Brito */
public class TimeTest {

  /** @param args */
  public static void main(String[] args) {

    // Creating a new object
    Time time1 = new Time(2, 30, 45);
    Time time2 = new Time(3, 30, 20);

    System.out.println("Time1 = " + time1.toString());
    System.out.println("Time2 = " + time2.toString());
    time1.addObjects(time2);

    System.out.println("Time1 adding time2 --> " + time1.toString());
  }
}
