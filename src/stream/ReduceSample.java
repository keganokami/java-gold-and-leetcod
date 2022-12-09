package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceSample {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5);
    Optional<Integer> result = list.stream().reduce((a,b) -> a + b);
    result.ifPresent((str) -> System.out.println(str));
  }
}
