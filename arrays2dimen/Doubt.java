package arrays2dimen;

public class Doubt {

  public static void main(String[] args) {

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < 30; i++) {
      int randomN = (int) (Math.random() * 1001);
      if (randomN > max) {
        max = randomN;
      }
      System.out.println(randomN);
    }

    System.out.println("\nThe max number is: " + max);
  }
}
