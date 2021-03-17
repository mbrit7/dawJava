package oop.list;

/** @author Manuel Brito */
public class QueueTest {
  public static void main(String[] args) {
    //    QueueInteger q1 = new QueueInteger();
    QueueInteger q2 = new QueueInteger(3, 5, 2, 6, 0, 0, 0, 7, 1);

    //    System.out.println(q1.toString());
    System.out.println("\n" + q2.toString());

    System.out.println("\nNumber of elements: " + q2.getContentSize());

    System.out.println("\nThe queue is empty?? " + q2.isEmpty());

    //    System.out.println("\nClear the queue");
    //    q2.clear();
    //
    //    System.out.println("\nThe queue is empty?? " + q2.isEmpty());
    //    System.out.println(q2.toString());

    //    System.out.println("\nResizing the queue");
    //    q2.resize(13);
    //    System.out.println("\nNumber of elements: " + q2.getContentSize());

    System.out.println("\nPushing a number ");
    q2.push(6);
    System.out.println("\n" + q2.toString());

    System.out.println(q2.top());

    System.out.println("\n" + q2.toString());
  }
}
