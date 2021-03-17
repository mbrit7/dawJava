package oop.rectangle;

/** @author Manuel Brito */
public class Square extends Rectangle {

  public Square(int side) {
    super(side, side);
  }

  /**
   * Method to modify the square's side
   *
   * @param side
   */
  public void setSide(int side) {
    this.setBase(side);
    this.setHeight(side);
  }

  /**
   * Method to return the square's side
   *
   * @return side of the square
   */
  public double getSide() {
    return this.getBase();
  }

  @Override
  public String toString() {
    return "\nThe Square has sides with the size " + getSide();
  }
}
