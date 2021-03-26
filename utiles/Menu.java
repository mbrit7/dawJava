package utiles;

public class Menu {

  private String titulo;
  private String[] opciones;

  public Menu(String titulo, String[] opciones) {
    setTitulo(titulo);
    setOpciones(opciones);
  }

  private String getTitulo() {
    return titulo;
  }

  private void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  private String[] getOpciones() {
    return opciones;
  }

  private void setOpciones(String[] opciones) {
    this.opciones = opciones;
  }

  public int gestionarMenu() {
    mostrarMenu();
    return recogerOpcion();
  }

  private void mostrarMenu() {
    System.out.println(getTitulo());

    for (int i = 0; i < getOpciones().length; i++) {
      System.out.println("\t" + (i + 1) + ". " + getOpciones()[i]);
    }
  }

  private int recogerOpcion() {
    int opcion;
    do {
      opcion = Teclado.leerEntero("\n>>> Dime una opción a realizar: ");

    } while (opcion <= 0 || opcion > getOpciones().length);
    return opcion;
  }
}
