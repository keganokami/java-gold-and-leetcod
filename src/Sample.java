import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Sample {
  public static void main(String[] args) {
   List<Item> item = List.of(
    new Item("apple", 100),
    new Item("banana", 80),
    new Item("apple", 200)
   );

   double result = item.stream().filter(e -> e.getName().equals("apple")).mapToInt(Item::getPrice).average().getAsDouble();
   System.out.println(result);
  }


  public static class Item {
    private String name;
    private int price;

    Item(String name, int price) {
      this.name = name;
      this.price = price;
    }

    public String getName() {
      return this.name;
    }

    public int getPrice() {
      return this.price;
    }
  }
}
