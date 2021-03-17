package oop.list;

public class StackTest {

  public static void main(String[] args) {

    // Creating an object
    //    StackInteger st1 = new StackInteger();
    StackInteger st2 = new StackInteger(2, 3, 6, 1, 5, 4, 3, 12, 11);

    System.out.println("\n" + st2.toString()); // showing the list

    System.out.println("\n" + st2.isEmpty()); // true if the stack is empty

    //    st2.clear(); // emptying the stack
    //
    //    System.out.println("\n" + st2.isEmpty());

    System.out.println(
        "\nNumber of elements --> " + st2.getContentSize()); // number of elements in the stack

    st2.insert(5); // adding an element

    System.out.println(
        "\nNumber of elements --> " + st2.getContentSize()); // number of elements in the stack

    System.out.println("\n" + st2.toString());

    st2.resize(12);
    st2.insert(6);
    System.out.println("Resize to 12 elements");
    System.out.println("\nNumber of elements --> " + st2.getContentSize());
    System.out.println(st2.toString());

    //    System.out.println("\n" + st2.pop());
    //
    //    System.out.println("\n" + st2.toString());
    //
    //    System.out.println("\nThe top element: " + st2.top());
  }
}
