package poo.date;

/** @author Manuel Brito */
public class Date {

  /** Attributes */
  private int day;

  private int month;
  private int year;

  /** Methods */

  /**
   * Function that tells if the introduced date is correct
   *
   * <p>In this program I use 30 days for a month
   */
  public void isDateCorrect() {
    if (day < 100 && month < 100 && year < 10000) {
      if (day < 1 || day > 30) {
        System.err.println("\nPlease introduce a day between 1 and 30, both including");

      } else if (month < 1 || month > 12) {
        System.err.println("\nPlease introduce a month between 1 and 12, both including");

      } else if (year < 0) {
        System.err.println("\nPlease introduce a valid year");

      } else {
        System.out.println("\nThe date is correct");
      }

    } else {
      System.err.println("\nPlease introduce number with correct length to the date");
    }
  }

  /**
   * Function to know the length of year's number
   *
   * @return
   */
  //  public int showLengthOfYear() {
  //    int lengthYear = 0;
  //    return lengthYear;
  //  }

  /**
   * Constructor
   *
   * @param day
   * @param month
   * @param year
   */
  public Date(int day, int month, int year) {
    this.setDay(day);
    this.setMonth(month);
    this.setYear(year);
  }

  /** Getters, Setters and toString */

  /** @return the day */
  public int getDay() {
    return day;
  }

  /** @param day the day to set */
  public void setDay(int day) {
    this.day = day;
  }

  /** @return the month */
  public int getMonth() {
    return month;
  }

  /** @param month the month to set */
  public void setMonth(int month) {
    this.month = month;

    //      switch (this.month) {
    //        case 1:
    //          break;
    //        case 2:
    //          break;
    //        case 3:
    //          break;
    //        case 4:
    //          break;
    //        case 5:
    //          break;
    //        case 6:
    //          break;
    //        case 7:
    //          break;
    //        case 8:
    //          break;
    //        case 9:
    //          break;
    //        case 10:
    //          break;
    //        case 11:
    //          break;
    //        case 12:
    //          break;
    //
    //        default:
    //          break;
    //      }
    //    }
  }

  /** @return the year */
  public int getYear() {
    return year;
  }

  /** @param year the year to set */
  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return +this.day + " of " + this.month + " of " + this.year;
  }
}
