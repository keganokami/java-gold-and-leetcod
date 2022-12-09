import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) throws IOException {
    var subject = new Main().new Subject("name");
    subject.toString();
    new Main().test();
  }

  class Subject {
    String name;
    Subject(String name) {
      this.name = name;
    }
  }

  private void test() {
    System.out.println("");
  }
}
