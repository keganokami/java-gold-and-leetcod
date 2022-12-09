import java.util.Comparator;

public class Sample3 {

  public static void main(String[] args) {
    Comparator c = new Comparator<String>() {
      public int compare(String a1, String a2) {
        return a1.compareTo(a2);
      };
    };

    System.out.println(c.compare("o1", "o2"));
  }
}
