package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsSample {
  public static void main(String[] args) {
    List<Item> list = Arrays.asList(
      new Item(1, ItemType.BOOK, "java", 1980),
      new Item(2, ItemType.BOOK, "Lambda", 2980),
      new Item(3, ItemType.MAGAZINE, "Soft", 980),
      new Item(4, ItemType.MAGAZINE, "Test", 1280)
    );

    // Map<String, Item> books = list.stream().filter(item -> item.getType() == ItemType.BOOK).collect(Collectors.toMap(Item::getName, item -> item));
    // books.keySet().stream().forEach(System.out::println);

    // Map<ItemType, List<Item>> group = list.stream().collect(Collectors.groupingBy(Item::getType));
    // System.out.println(group);

    Map<ItemType, Integer> group = list.stream().collect(Collectors.groupingBy(Item::getType, Collectors.summingInt
    (Item::getPrice)));
    System.out.println(group);
  }
}
