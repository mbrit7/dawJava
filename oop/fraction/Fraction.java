package oop.fraction;

/** @author Manuel Brito */
public class Fraction implements Cloneable, Comparable<Fraction> {

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
   * @param f the fraction to multiply
   * @return a fraction multiplied with the 'f' fraction
   */
  // For make the code more legible,
  // I create another method with a different name to multiply
  public Fraction multiplyTwoFractions(Fraction f) {
    return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
  }

  /**
   * Function to divide two fractions
   *
   * @param f the fraction to divide
   * @return a fraction divided with the 'f' fraction
   */
  public Fraction divideTwoFractions(Fraction f) {
    return new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
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
    return "\nThe fraction is: " + this.numerator + "/" + this.denominator;
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
  public void setDenominator(int denominator) throws ArithmeticException {
    try {
      this.denominator = denominator;

    } catch (ArithmeticException ae) {
      throw ae;
    }
  }

  @Override
  public int compareTo(Fraction f) {
    return 0;
  }
}
