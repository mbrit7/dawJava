package oop.list;

import java.util.Arrays;

/**
 * Esta clase implementará una estructura de datos tipo lista de números enteros.
 *
 * <p>Estado de los objetos:
 *
 * <p>- content: array de enteros donde guardaremos los elementos de la lista.
 *
 * <p>- size: número de elementos guardados en la lista.
 *
 * <p>Comportamiento:
 *
 * <p>- ListInteger(): crea una lista vacía cuyo tamaño máximo va a estar determinado por una
 * constante de la clase (10).
 *
 * <p>- ListInteger(ele1, ..., eleN): crea una lista con los elementos ele1 ... eleN.
 *
 * <p>- pop(): me devuelve el último elemento de la lista y lo saca de la lista.
 *
 * <p>- pop(posición): me devuelve el elemento que está en "posición" y lo saca de la lista.-
 *
 * <p>- remove(elemento): borra la primera ocurrencia de "elemento" en la lista. Devolverá true o
 * false en función del éxito de la operación.
 *
 * <p>- insert(elemento): añadir "elemento" al final de la lista. Devolveremos true o false en
 * función del éxito de la operación.
 *
 * <p>- insert(elemento, posición): añadir "elemento" en la posición "posición" de la lista.
 * Devolveremos true o false en función del éxito de la operación.
 *
 * <p>- clear(): vacía la lista.
 *
 * <p>- isFull(): me dice si la lista está llena.
 *
 * <p>- isEmpty(): me dice si la lista está vacía.
 *
 * <p>- resize(): cambia el tamaño máximo de la lista si el nuevo tamaño máximo no es menor que el
 * número de elementos que tiene. Devolveremos true o false en función del éxito de la operación.
 *
 * <p>- size(): nos devuelve el número de elementos que hay en la lista.
 *
 * <p>- maxSize(): tamaño máximo de la lista.
 *
 * @author Rafael del Castillo Gomariz
 * @author Manuel Brito
 */
public class List {

  // class's variable

  private static final int DEFAULT_MAX_SIZE = 10;

  // instance's variable

  private int[] content; // array where I save the elements of the list
  private int contentSize; // size of the list (quantity of elements)

  // Methods

  // Constructor

  public List() {
    this.contentSize = 0;
    this.content = new int[DEFAULT_MAX_SIZE];
  }

  public List(int... content) {
    if (content.length > DEFAULT_MAX_SIZE) {
      this.content = new int[content.length];

    } else {
      this.content = new int[DEFAULT_MAX_SIZE];
    }

    // Introduce the values via parameter to the array
    for (int i = 0; i < content.length; i++) {
      this.content[i] = content[i];
    }
  }

  // resto métodos

  /**
   * Add an element at the end of the list
   *
   * @param element
   * @return success of the operation
   */
  public boolean insert(int element) {
    for (int i = 0; i < content.length; i++) {
      content[content.length - 1] = element;
    }
    //    showArray(content);
    return true;
  }

  /**
   * Add an element in the indicated position
   *
   * @param element the element to add
   * @param pos the position where add the element
   * @return operation's success
   */
  public boolean insert(int element, int pos) {
    for (int i = 0; i < content.length; i++) {
      content[pos - 1] = element;
    }
    //    showArray(content);
    return true;
  }

  /**
   * Return the last element of the list and delete it
   *
   * @return last element of the list
   */
  public int pop() {
    int lastElement = 0;
    for (int i = 0; i < content.length; i++) {
      content[content.length - 1] = lastElement;
    }
    return lastElement;
  }

  /**
   * Borra la primera ocurrencia de un elemento en la lista.
   *
   * @param element
   * @return éxito de la operación.
   */
  public boolean remove(int element) {
    return false;
  }

  /** Clear the list. */
  public void clear() {
    this.contentSize = 0;
  }

  /** @return if the list is full. */
  public boolean isFull() {
    return this.content.length == this.contentSize;
  }

  /** @return if the list is empty. */
  public boolean isEmpty() {
    return this.content.length == 0;
  }

  /**
   * Cambia el tamaño máximo de la lista si el nuevo tamaño máximo no es menor que el número de
   * elementos que tiene.
   *
   * @return éxito de la operación.
   */
  public boolean resize() {
    return false;
  }

  /** @return number of element that the list have */
  public int getSize() {
    return this.contentSize;
  }

  /** @return max number of element that a list could have. */
  public int getMaxSize() {
    return this.content.length;
  }

  @Override
  public String toString() {
    // array auxiliar que tiene los elementos de la lista y con longitud contentSize
    // (primamos la legibilidad a ahorrarnos una línea)
    int[] arrayAux = Arrays.copyOfRange(this.content, 0, this.contentSize);
    return Arrays.toString(arrayAux);
  }
}
