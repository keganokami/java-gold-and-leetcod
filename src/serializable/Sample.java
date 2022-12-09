package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sample {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("./src/serializable/sample.ser");
    ObjectOutputStream out = new ObjectOutputStream(fos);

    try (out) {
      Item item = new Item("apple", 100);
      out.writeObject(item);
    } catch (Exception e) {
      //TODO: handle exception
    }
  }
}
