package iterators;

public class TestPrimeListEratosthenes {

  public static void main(String[] args) {

    var primeNumbers = new PrimeListIterable(20);

    primeNumbers.getPrimeNumbers();
  }
}
