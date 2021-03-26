package exam2Trimestre;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CyclistsTour {

  ArrayList<Ciclista> cyclists = new ArrayList<Ciclista>();

  public void importCSV(String filename) throws IOException {
    var file = Files.newBufferedReader(Paths.get(filename));

    String line;
    while ((line = file.readLine()) != null) {
      Ciclista cyclist = newCyclistCSV(line);
      cyclists.add(cyclist);
    }

    file.close();
  }

  private Ciclista newCyclistCSV(String line) {
    String[] fieldsCyclist = line.split("\",");

    String nombre = fieldsCyclist[0].replace("\"", "");
    String dorsal = fieldsCyclist[1].replace("\"", "");
    String tiempo1 = fieldsCyclist[2].replace("\"", "");
    String tiempo2 = fieldsCyclist[3].replace("\"", "");
    String tiempo3 = fieldsCyclist[4].replace("\"", "");
    String tiempo4 = fieldsCyclist[5].replace("\"", "");
    String tiempo5 = fieldsCyclist[6].replace("\"", "");

    String[] tiempo = {tiempo1, tiempo2, tiempo3, tiempo4, tiempo5};

    Ciclista cyclist = null;

    cyclist = newCyclist(nombre, dorsal, tiempo);
    return cyclist;
  }

  private Ciclista newCyclist(String nombre, String dorsal, String[] tiempo) {
    int dorsalCasted = Integer.parseInt(dorsal);

    int[] tiempoCasted = {};

    for (int i = 0; i < tiempo.length; i++) {
      tiempoCasted[i] = Integer.parseInt(tiempo[i]);
    }

    Ciclista cyclist = new Ciclista(nombre, dorsalCasted, tiempoCasted);
    return cyclist;
  }

  public void list() {
    System.out.println("\n" + cyclists.toString() + "\n");
  }
}
