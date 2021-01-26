package poo.time;

/** @author Manuel Brito */
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
  public Time addObjects(Time object) {
    this.hours += object.hours;
    this.minutes += object.minutes;
    this.seconds += object.seconds;
    return object;
  };

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
    this.hours = hours * 3600;
    this.minutes = (hours % 3600) * 60;
    this.seconds = seconds;
  }

  /** Getters and Setters */

  /** @return the hours */
  public int getHours() {
    return hours;
  }

  /** @param hours the hours to set */
  public void setHours(int hours) {
    this.hours = hours;
  }

  /** @return the minutes */
  public int getMinutes() {
    return minutes;
  }

  /** @param minutes the minutes to set */
  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  /** @return the seconds */
  public int getSeconds() {
    return seconds;
  }

  /** @param seconds the seconds to set */
  public void setSeconds(int seconds) {
    this.seconds = seconds;
  }
}
