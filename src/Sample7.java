import java.util.Optional;

public class Sample7 {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty();
    System.out.println(sample.orElseGet(() -> "empty"));
  }
}
