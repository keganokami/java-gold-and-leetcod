package kata;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeSample {
  public static void main(String[] args) {
    Deque deque = new ArrayDeque<>();
    deque.addLast("A");
    deque.addFirst("B");
    deque.addFirst("C");
    deque.addLast("D");
    deque.addLast("E");

    /**
     * addFirstは下から、addLastは上から。
     */

    deque.stream().forEach(System.out::println);
  }
}
