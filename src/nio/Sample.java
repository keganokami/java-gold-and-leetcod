package nio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {
  public static void main(String[] args) {
    Path path = Paths.get("./src/nio/sample.txt");
    Path path2 = Paths.get("src", "nio", "sample.txt");
    System.out.println(path);
    System.out.println(path2);

    Path fileTopPath = new File("./src/nio/sample.txt").toPath();
    System.out.println(fileTopPath.toAbsolutePath());
  }
}
