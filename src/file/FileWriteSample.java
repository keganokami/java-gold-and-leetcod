package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteSample {
  public static void main(String[] args) throws IOException {
    FileWriter out = new FileWriter("./src/file/output.txt", true);
    BufferedWriter bufferedWriter = new BufferedWriter(out);
    try (bufferedWriter) {
      bufferedWriter.newLine();
      bufferedWriter.write("buffering output");
      bufferedWriter.flush();
    } 
  }
}
