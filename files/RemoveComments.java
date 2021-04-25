package files;

public class RemoveComments {

  public static void main(String[] args) {
    // Another way to read a file
    // BufferedReader file = Files.newBufferedReader(Paths.get(filePath));
    //
    // // var file = Files.newBufferedReader(Paths.get(filePath));
    //
    // String line;
    // while ((line = file.readLine()) != null) {
    // System.out.println(line);
    // }
    // file.close();

    //	      // Saving the file data in a string
    //	      String lines = Files.readString(Paths.get(filePath));
    //
    //	      for (int i = 0; i < lines.length(); i++) {
    //	        extracted(lines, i);
    //	        System.out.println("----------------");
    //	      }

    //    for (String line : lines) {
    //
    //        if (line.startsWith("/**")) {
    //          lines.remove(line);
    //        } else {
    //          System.out.println(line);
    //        }
    //      }

  }
}
