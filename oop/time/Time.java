package oop.time;

/**
 * @author Manuel Brito
 *     <p>With this class you can add and subtract another object, add and subtract seconds, minutes
 *     and hours to an object and also you can show the time in this format (10h 34m 12s).
 */
public class Time {

  /** Attributes */
  private int hours;

  private int minutes;
  private int seconds;

  /** Methods */

  /**
   * Function to add hours, minutes and seconds to an object
   *
   * @param the object that I will add to another object
   * @return the addition of the objects
   */
  public Time sumToObject(Time object) {
    return new Time(
        this.hours + object.hours, this.minutes + object.minutes, this.seconds + object.seconds);
  };

  /**
   * Function to subtract hours, minutes and seconds of two objects
   *
   * @param object
   * @return
   */
  public Time subtractObject(Time object) {
    return new Time(
        this.hours - object.hours, this.minutes - object.minutes, this.seconds - object.seconds);
  }

  @Override
  public String toString() {
    return hours + "h " + minutes + "m " + seconds + "s ";
  }

  /**
   * Constructor
   *
   * @param hours
   * @param minutes
   * @param seconds
   */
  public Time(int hours, int minutes, int seconds) {
    if (hours < 0 || minutes < 0 || seconds < 0) {
      System.err.println("\nYou can't introduce a negative number.");
    }
    int timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
    this.hours = timeInSeconds / 3600;
    this.minutes = (timeInSeconds % 3600) / 60;
    this.seconds = timeInSeconds % 60;
  }

  /** Getters and Setters */

  /** @return the hours */
  public int getHours() {
    return hours;
  }

  /** @param hours the hours to set */
  public void setHours(int hours) {
    if (hours < 0) {
      System.err.println("\nYou can't introduce a negative number.");
    }
    this.hours = hours;
  }

  /** @return the minutes */
  public int getMinutes() {
    return minutes;
  }

  /** @param minutes the minutes to set */
  public void setMinutes(int minutes) {
    if (minutes < 0) {
      System.err.println("\nYou can't introduce a negative number.");
    }
    this.minutes = minutes;
  }

  /** @return the seconds */
  public int getSeconds() {
    return seconds;
  }

  /** @param seconds the seconds to set */
  public void setSeconds(int seconds) {
    if (seconds < 0) {
      System.err.println("\nYou can't introduce a negative number.");
    }
    this.seconds = seconds;
  }
}
