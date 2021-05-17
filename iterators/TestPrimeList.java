package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPrimeList {

  public static void main(String[] args) {

    List<Integer> listPrimeNumbers = new ArrayList<Integer>();

    var primeIterator = new PrimeListIterator(20);

    addingPrimeNumbersToList(listPrimeNumbers, primeIterator);

    showingTheHeader(primeIterator);

    showingThePrimeNumbersWithTheIterator(listPrimeNumbers);
  }

  private static void addingPrimeNumbersToList(
      List<Integer> listPrimeNumbers, PrimeListIterator primeIterator) {

    for (int n = 2; n <= primeIterator.getQuantityNumbers(); n++) {

      if (n % 2 == 0 || n % 3 == 0) {
        if (n == 2 || n == 3) {
          listPrimeNumbers.add(n);
        }

      } else {
        listPrimeNumbers.add(n);
      }
    }
  }

  private static void showingTheHeader(PrimeListIterator primeIterator) {
    System.out.println(
        "\nLista con los " + primeIterator.getQuantityNumbers() + " primeros números primos\n");
  }

  private static void showingThePrimeNumbersWithTheIterator(List<Integer> listPrimeNumbers) {
    Iterator<Integer> it = listPrimeNumbers.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
