package oop.rectangle;

/** @author Manuel Brito */
public class Rectangle implements Comparable<Rectangle>, Cloneable {

  /** Attributes */
  private double base;

  private double height;

  /** Constructor */
  public Rectangle(double base, double height) {
    this.setBase(base);
    this.setHeight(height);
  }

  /** Methods */

  /**
   * Method to calculate the rectangle's perimeter
   *
   * @return the perimeter of the rectangle
   */
  public double calculatePerimeter() {
    return (this.base + this.height) * 2;
  }

  /**
   * Method to calculate the rectangle's area
   *
   * @return the area of the rectangle
   */
  public double calculateArea() {
    return this.base * this.height;
  }

  /**
   * Method to calculate the rectangle's area, introducing the dimensions via parameter
   *
   * @param base
   * @param height
   * @return
   */
  public double calculateArea(double base, double height) {
    return base * height;
  }

  /** Method to draw the shape of the rectangle */
  public void drawRectangle() {
    // Drawing the top base
    System.out.println("*".repeat((int) this.base));

    // Drawing the sides
    for (int i = 1; i <= height; i++) {
      System.out.println("*" + " ".repeat(((int) this.base) - 2) + "*");
    }

    // Drawing the bottom base
    System.out.println("*".repeat((int) this.base));
  }

  /** Getters & Setters */

  /** @return the height */
  public double getHeight() {
    return height;
  }
  /** @param height the height to set */
  public void setHeight(double height) {
    if (height < 0) {
      System.err.println("\nDon't introduce a negative number for the height");
    }
    this.height = height;
  }
  /** @return the base */
  public double getBase() {
    return base;
  }
  /** @param base the base to set */
  public void setBase(double base) {
    if (base < 0) {
      System.err.println("\nDon't introduce a negative number for the base");
    }
    this.base = base;
  }

  /** Method toString */
  @Override
  public String toString() {
    return "\nThe Rectangle has a height of " + base + " and a base of " + height;
  }

  /** Implementation of 'compare to' Interface */
  @Override
  public int compareTo(Rectangle r) {
    return (int) (this.calculateArea() - this.calculateArea(r.base, r.height));
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(base);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(height);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Rectangle other = (Rectangle) obj;
    if (Double.doubleToLongBits(base) != Double.doubleToLongBits(other.base)) return false;
    if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height)) return false;
    return true;
  }

  /** Method to clone a rectangle object */
  public Rectangle clone() {
    return new Rectangle(this.base, this.height);
  }
}
