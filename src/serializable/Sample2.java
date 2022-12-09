package serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Sample2 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("./src/serializable/sample.ser");
    ObjectInputStream in = new ObjectInputStream(fis);

    try (in) {
      Object obj = in.readObject();
      Item item = (Item) obj;
      System.out.println(item);
    } catch (Exception e) {
      //TODO: handle exception
    }
  }
}
