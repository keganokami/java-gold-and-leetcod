package nio;

import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SystemInSample {
  public static void main(String[] args) throws IOException {
    System.out.println(" >");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    Path p = Paths.get("./src/nio", name);
    if (!Files.exists(p)) {
      Files.createFile(p);
    }

    System.out.println(Files.getLastModifiedTime(p));
    System.out.println(Files.getPosixFilePermissions(p));

    System.out.println("delete y/n? > ");
    if ("y".equals(scanner.nextLine())) {
      Files.delete(p);
      System.out.println("deleted");
    }
  }
}
