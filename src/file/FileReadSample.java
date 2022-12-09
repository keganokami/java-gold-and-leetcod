package file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReadSample {
  public static void main(String[] args) throws IOException {
    FileReader reader = new FileReader("./src/file/data.txt");
    BufferedReader bufferedReader = new BufferedReader(reader);
    FileInputStream fi = new FileInputStream("./src/file/data.txt");
    BufferedInputStream bi = new BufferedInputStream(fi);
    try (bi) {
      // int i = 0;
      // while ((i = reader.read()) != -1) {
      //   char c = (char) i;
      //   System.out.print(c);
      // }
      // String line = null;
      // while ((line = bufferedReader.readLine()) != null) {
      //   System.out.println(line);
      // }
        // bi.readli().forEach(System.out::println);
        bi.readAllBytes();
    }
  }
}
