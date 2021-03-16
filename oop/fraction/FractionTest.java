/** */
package oop.fraction;

import java.util.Scanner;

/** @author Manuel Brito */
public class FractionTest {

  /** @param args */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    /** Create a new object */
    Fraction fraction1 = new Fraction(15, 0);
    //    Fraction fraction2 = new Fraction(30, 5);

    //    /** Print the fraction */
    //    System.out.println(fraction1.toString());
    //
    //    /** To organize the code */
    //    for (int i = 0; i <= 60; i++) {
    //      System.out.print("-");
    //    }
    //    System.out.println();
    //
    //    /** Obtain and modify the numerator and denominator */
    //    System.out.println("\nThe numerator is " + fraction1.getNumerator());
    //    System.out.println("The denominator is " + fraction1.getDenominator());
    //
    //    System.out.print("\nTell me a number for the numerator: ");
    //    int introducedNum = s.nextInt();
    //
    //    System.out.print("Tell me a number for the denominator: ");
    //    int introducedDenom = s.nextInt();
    //
    //    /** Modify the numerator and denominator */
    //    fraction1.setNumerator(introducedNum);
    //    fraction1.setDenominator(introducedDenom);
    //
    //    System.out.println(fraction1.toString());
    //
    //    /** To organize the code */
    //    for (int i = 0; i <= 60; i++) {
    //      System.out.print("-");
    //    }
    //    System.out.println();
    //
    /** Show the result of the fraction */
    System.out.println("\nThe result of the fraction is --> " + fraction1.calculateFraction());

    //
    //    /** To organize the code */
    //    for (int i = 0; i <= 60; i++) {
    //      System.out.print("-");
    //    }
    //    System.out.println();

    /** Multiply the fraction with another number */
    //    System.out.println(fraction1.toString());
    //    System.out.print("\nTell me the number for multiply: ");
    //    int numberToMultiply = s.nextInt();
    //    System.out.println();
    //
    //    System.out.print("--- The Multiplication ---");
    //    System.out.println(fraction1.multiplyWithANumber(numberToMultiply));

    /** Multiply, add and subtract fractions */
    //    System.out.println(fraction1.toString());
    //    System.out.println(fraction2.toString());
    //
    //    System.out.println("\nMultiplication" + fraction1.multiplyTwoFractions(fraction2));
    //
    //    System.out.println(fraction1.toString());
    //    System.out.println(fraction2.toString());
    //
    //    System.out.println("\nDivision" + fraction1.divideTwoFractions(fraction2));

    /** Simplify a fraction */
    s.close();
  }
}
