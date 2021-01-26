package poo.fraction;

/** @author Manuel Brito */
public class Fraction {

  /** Attributes */
  private int numerator;

  private int denominator;

  /** Methods */

  /**
   * Function that calculate the result of a fraction
   *
   * @return the result of the fraction
   */
  public double calculateFraction() {
    return (double) this.numerator / this.denominator;
  }

  /** Function to show the result of a fraction with exceptions */
  //  public void showResultFraction() {
  //    try {
  //      System.out.println((double) this.numerator / this.denominator);
  //
  //    } catch (Exception e) {
  //      System.out.println("Exception --> " + e.getClass());
  //      System.out.println("Error --> " + e.getMessage());
  //      System.out.println("Introduce another denominator number.");
  //    }
  //  }
  /**
   * Function that multiply a number to the fraction
   *
   * @param number the number to multiply
   * @return a fraction with the number multiplied
   */
  public Fraction multiplyWithANumber(int number) {
    return new Fraction(this.numerator * number, this.denominator);
  }

  /**
   * Function to multiply two fractions
   *
   * @param numerator the numerator of the fraction to multiply
   * @param denominator the denominator of the fraction to multiply
   * @return a fraction multiplied with the other fraction
   */
  // For make the code more legible,
  // I create another method with a different name to multiply
  public Fraction multiplyWithAFraction(int numerator, int denominator) {
    return new Fraction(this.numerator * numerator, this.denominator * denominator);
  }

  /**
   * Constructor
   *
   * @param numerator
   * @param denominator
   */
  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.setDenominator(denominator);
  }

  /**
   * Method toString
   *
   * @return
   */
  @Override
  public String toString() {
    return "\nThe numerator is " + numerator + " and the denominator is " + denominator;
  }

  /** Getters and Setters */

  /** @return the numerator */
  public int getNumerator() {
    return numerator;
  }

  /** @param numerator the numerator to set */
  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  /** @return the denominator */
  public int getDenominator() {
    return denominator;
  }

  /** @param denominator the denominator to set */
  public void setDenominator(int denominator) {
    if (denominator == 0) {
      System.err.println("\nThe denominator can't be 0");
    } else {
      this.denominator = denominator;
    }
  }
}
