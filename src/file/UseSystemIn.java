package file;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UseSystemIn {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String input = br.readLine();
      System.out.println(input);
    } catch (Exception e) {
      //TODO: handle exception
    }
  }
}
