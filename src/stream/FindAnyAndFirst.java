package stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyAndFirst {
  public static void main(String[] args) {
    String[] array = {"A", "B", "c"};

    Stream<String> stream = Arrays.stream(array);
    Optional result = stream.findAny();
    // Optional result2 = stream.findFirst();

    result.ifPresent(System.out::println);
    // result2.ifPresent(System.out::println);
  }
}
