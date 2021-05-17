package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeListIterable implements Iterable<Integer> {

  private int number = 0;
  private int quantityNumbers;

  public PrimeListIterable(int quantityNumbers) {
    this.quantityNumbers = quantityNumbers;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new PrimeListIterator(quantityNumbers);
  }

  List<Integer> listPrimeNumbers = new ArrayList<Integer>();

  public void getPrimeNumbers() {
    addingNumbersToList();

    removingMultiplesNumberOfTheFirstPrime();

    if (Math.pow(listPrimeNumbers.get(0), 2) < 20) {
      removingMultiplesNumberOfTheFirstPrime();
    }

    showingNumbersOfTheList();
  }

  private void addingNumbersToList() {
    for (int i = 2; i <= this.quantityNumbers; i++) {
      listPrimeNumbers.add(i);
    }
  }

  private void removingMultiplesNumberOfTheFirstPrime() {
    listPrimeNumbers
        .subList(1, listPrimeNumbers.size())
        .removeIf(n -> n % listPrimeNumbers.get(0) == 0);
  }

  private void showingNumbersOfTheList() {
    System.out.println(listPrimeNumbers.toString());
  }
}
