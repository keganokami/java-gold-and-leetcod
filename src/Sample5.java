import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Sample5 {
  static class Item {
    private String name;
    public Item(String name) {
      super();
      this.name = name;
    }
  }

  public static void main(String[] args) {
    Item[] items = {
      new Item("A"),
      new Item("B"),
      new Item("C")
    };
    Arrays.sort(items);

    for (Item item : items) {
      System.out.println(item.name);
    }
  }

  IntFunction<Integer> f = n -> n * 2;
}
