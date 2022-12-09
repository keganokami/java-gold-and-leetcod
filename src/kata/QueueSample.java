package kata;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueSample {
  public static void main(String[] args) {
    Queue queue = new ArrayDeque<>(5);
    queue.add("A");
    queue.add("B");
    queue.add("C");

    queue.stream().forEach(System.out::println);
  }
}
