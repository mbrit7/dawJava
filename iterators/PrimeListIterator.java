package iterators;

/**
 * Program that show a list of prime numbers, the quantity of numbers is introduced via parameter.
 *
 * @author Manuel Brito
 */
import java.util.Iterator;

public class PrimeListIterator implements Iterator<Integer> {

  private int number = 2;
  private int quantityNumbers;

  public PrimeListIterator(int quantityNumbers) {
    this.quantityNumbers = quantityNumbers;
  }

  @Override
  public boolean hasNext() {
    return number <= quantityNumbers;
  }

  @Override
  public Integer next() {
    return null;
  }

  public int getQuantityNumbers() {
    return quantityNumbers;
  }

  public int getNumber() {
    return number;
  }
}
