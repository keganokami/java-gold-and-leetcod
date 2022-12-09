package nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferedSample {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("./src/nio/sample.txt");
    BufferedReader bReader = Files.newBufferedReader(path);
    try (bReader) {
      bReader.lines().forEach(System.out::println);
    } catch (Exception e) {
      //TODO: handle exception
    }

    // ---------------------------------------------------

    BufferedWriter bWriter = Files.newBufferedWriter(path, StandardOpenOption.APPEND);
    try (bWriter) {
      bWriter.write("Hello new line");
      bWriter.newLine();
    } catch (Exception e) {
      //TODO: handle exception
    }
  }
}
