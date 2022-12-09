package file;

import java.io.File;

public class Sample2 {
  public static void main(String[] args) {
    File rootDir = new File(".");
    String[] dirs = rootDir.list();
    for(String dir : dirs) {
      // string
      System.out.println(dir);
    }
    // showTree(rootDir, "");
  }

  private static void showTree(File dir, String indent) {
    File[] files = dir.listFiles();
    for(File file : files) {
      // files
      System.out.println(indent + file.getName());
      if (file.isDirectory()) {
        showTree(file, indent + "-");
      }
    }
  }
}
