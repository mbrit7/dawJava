package oop.list;

/**
 * Stack class where you can add a element to the top, extract the last element, read the last
 * element.
 *
 * <p>Also you can create the stack with or without values, obtain the numbers of elements that the
 * stack have, know if the stack is empty, modify the max size of the stack and clear the stack.
 *
 * @author Manuel Brito
 */
public class StackInteger extends IntegerList {

  public StackInteger() {
    super();
  }

  public StackInteger(int... content) {
    super(content);
  }

  /** Methods */

  /**
   * Method to return the last element of the stack
   *
   * @return the last element
   */
  public int top() {
    if (this.isEmpty()) {
      System.err.println("Exception. The stack is empty.");
      return 0;
    }

    return super.content[super.getContentSize()];
  }
}
