package distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctSample {
  public static void main(String[] args) {
    // List<String> list = Arrays.asList("A","B","C", "A");
    // list.stream().distinct().forEach(System.out::println);

    List<Value> list = Arrays.asList(
      new Value("A"),
      new Value("B"),
      new Value("C"),
      new Value("A")
    );

    long size = list.stream().distinct().count();
    System.out.println(size);
  }
}
