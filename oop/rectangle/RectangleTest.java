package oop.rectangle;

/** @author Manuel Brito */
public class RectangleTest {

  public static void main(String[] args) {

    /** Creating objects */
    Rectangle rect1 = new Rectangle(32.5, 20.3);
    Rectangle rect2 = new Rectangle(20.2, 10.3);

    //    /** Showing the perimeter */
    //    System.out.println("\nThe perimeter of rect1 is: " + rect1.calculatePerimeter());
    //    System.out.println("The perimeter of rect2 is: " + rect2.calculatePerimeter());
    //
    //    /** To organize the code */
    //    System.out.println();
    //    for (int i = 0; i <= 60; i++) {
    //      System.out.print("-");
    //    }
    //    System.out.println();
    //
    //    /** Showing the area */
    //    System.out.println("\nThe area of rect1 is: " + rect1.calculateArea());
    //    System.out.println("The area of rect2 is: " + rect2.calculateArea());
    //
    //    /** To organize the code */
    //    System.out.println();
    //    for (int i = 0; i <= 60; i++) {
    //      System.out.print("-");
    //    }
    //    System.out.println();

    /** Drawing the rectangle */
    rect1.drawRectangle();

    /** To organize the code */
    System.out.println();
    for (int i = 0; i <= 60; i++) {
      System.out.print("-");
    }
    System.out.println();

    /** Comparing */
    //    System.out.println(rect1.compareTo(rect2));

    /** Cloning and showing an object */
    //    System.out.println(rect1.clone());

    /** Showing the base and the height */
    System.out.println(rect1.toString());
    System.out.println(rect2.toString());
  }
}
