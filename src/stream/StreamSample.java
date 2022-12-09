package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSample {
  public static void main(String[] args) {
    // int[] array = {1,2,3,4,5};
    // IntStream intStream = Arrays.stream(array);

    // intStream.forEach(System.out::println);

    Set<String> set = new HashSet<>();
    List<String> list = Arrays.asList("A", "B", "C");
    Stream<String> stream = list.parallelStream();
    set.add("E");
    set.add("D");
    set.add("C");
    set.add("B");
    set.add("A");

    // Stream<String> stream = set.stream();/
    stream.forEach(System.out::println);
  }
}
