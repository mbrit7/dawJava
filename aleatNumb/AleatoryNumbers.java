package aleatNumb;

public class AleatoryNumbers {

  public static void main(String[] args) {

    //    for (int i = 1; i <= 10; i++) {
    //
    //      // Show ten random double numbers from 0,00 until 0,99
    //      // System.out.println("Number " + i + " -> " + Math.random());
    //
    //      // Show ten random integer numbers from 0 until 9
    //      // System.out.println("Number " + i + " -> " + (int) (Math.random() * 10));
    //
    //      // Show ten random integer numbers from 1 until 10
    //      // System.out.println("Number " + i + " -> " + (int) (Math.random() * 10 + 1);
    //    }

    for (int i = 1; i <= 30; i++) {

      // Show random integer numbers between 10 and 50

      final int FIRST_RANDOM = 10;
      final int LAST_RANDOM = 50;

      int randomNum = FIRST_RANDOM + (int) (Math.random() * (LAST_RANDOM - FIRST_RANDOM + 1));
      System.out.println(randomNum);

      // Show random integer numbers from 50 until 60
      //      System.out.println("Number " + i + " -> " + (50 + (int) (Math.random() * 60c)));

      //      int randomNum = (int) (Math.random() * 1001);
      //      System.out.println(randomNum);
      //      if (randomNum == 0) {
      //        System.err.println(randomNum);
      //      } else if (randomNum == 1000) {
      //        System.err.println(randomNum);
      //      }

    }
  }
}
