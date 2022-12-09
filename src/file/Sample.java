package file;

import java.io.File;
import java.io.IOException;

public class Sample {
  public static void main(String[] args) throws IOException {
    File file = new File("./src/file/data,txt");
    if (!file.exists()) {
      // file.createNewFile();
    }
    System.out.println(file.getAbsolutePath());
  }
}
