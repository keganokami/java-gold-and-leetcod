package optional;

import java.util.Optional;

public class Sample2 {
  public static void main(String[] args) {
    Optional<String> sample = Optional.ofNullable(null);
    Optional<String> result = sample.map(str -> str.toUpperCase());

    System.out.println(sample.isEmpty());
    System.out.println(result.isEmpty());
  }
}
