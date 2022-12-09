package file;

import java.io.Console;

public class UsePassword {
  public static void main(String[] args) {
    Console console = System.console();
    // 注意　
    char[] password = console.readPassword();
    System.out.println(String.valueOf(password));
  }
}
