package optional;

import java.util.Optional;

public class GetTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.of("hello");
    sample.ifPresentOrElse((str) -> System.out.println(str), () -> System.out.println("empty"));

    if(sample.isPresent()) {
      System.out.println(sample.map((str) -> test(str)).get());
    }

  }

  private static String test(String test) {
    return test.toUpperCase();
  }
}
