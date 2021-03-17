package oop.list;

/**
 * In this class you have to create a queue with or without values, obtain the numbers of elements
 * that the queue have, know if the queue is empty, modify the max size of the queue and clear the
 * stack.
 *
 * <p>With the queue you can add elements at the end(push), return and remove the first element of
 * the queue(top) and return the first element without removing it(front).
 *
 * @author Manuel Brito
 */
public class QueueInteger extends IntegerList {

  public QueueInteger() {
    super();
  }

  public QueueInteger(int... content) {
    super(content);
  }

  /** Methods */

  /**
   * Add an element at the end of the queue.
   *
   * @param element
   * @return success of the operation
   */
  public boolean push(int element) {
    if (this.isFull()) {
      return false;
    }
    // we have space in the queue
    this.content[this.contentSize] = element;
    ++this.contentSize;
    return true;
  }

  /**
   * Method that return and remove the first element of the queue.
   *
   * @return the first element
   */
  public int top() {
    if (this.isEmpty()) {
      System.err.println("Exception. The list is empty");
      return 0;
    }

    super.content[super.contentSize - super.contentSize] = 0;
    return super.content[super.contentSize - super.contentSize];
  }

  /**
   * Method that return first element of the queue.
   *
   * @return the first element
   */
  public int front() {
    if (this.isEmpty()) {
      System.err.println("Exception. The list is empty");
      return 0;
    }

    return super.content[super.contentSize - super.contentSize];
  }
}
