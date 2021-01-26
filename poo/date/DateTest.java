package poo.date;

/** @author Manuel Brito */
public class DateTest {
  public static void main(String[] args) {

    // Creating new objects
    Date date1 = new Date(30, 12, 2020);
    Date date2 = new Date(25, 10, 1845);

    // Flag for stop the program if it's necessary
    //    boolean stopProgram;

    // Checking the date

    date1.isDateCorrect();
    date2.isDateCorrect();

    // Print the date
    System.out.println(date1.toString());
  }
}
