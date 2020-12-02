package numAleat;

public class AleatoryNumbers {

  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {

      // Show ten random double numbers from 0,00 until 0,99
      // System.out.println("Number " + i + " -> " + Math.random());

      // Show ten random integer numbers from 0 until 9
      // System.out.println("Number " + i + " -> " + (int) (Math.random() * 10));

      // Show ten random integer numbers from 1 until 10
      // System.out.println("Number " + i + " -> " + (int) (Math.random() * 10 + 1);
    }

    for (int i = 1; i <= 20; i++) {

      // Show ten random integer numbers from 50 until 60
      System.out.println("Number " + i + " -> " + (int) (Math.random() * 60));
    }
  }
}
