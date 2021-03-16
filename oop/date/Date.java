package oop.date;

/**
 * Class where you can realize different things like check if the date is correct, add and subtract
 * days to the date, comparing two dates, know if the year of the date is leap and also return the
 * date in this string format: dd of MM of yy.
 *
 * @author Manuel Brito
 */
public class Date implements Cloneable, Comparable<Date> {

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
  public boolean isDateCorrect() {
    if (day > 0 && day < 31) {
      return true;
    }
    if (month > 0 && month < 13) {
      return true;
    }
    if (year > 0) {
      return true;

    } else {
      return false;
    }
  }

  public void addDaysToDate() {}

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

  /** Implementation of 'compareTo' interface */
  @Override
  public int compareTo(Date d) {

    return this.year - d.year;
  }

  public Date clone() {
    return new Date(this.day, this.month, this.year);
  }
}
