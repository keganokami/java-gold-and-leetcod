package annotation;

public class TestItem {
  public static void main(String[] args) {
    Class<Item> clazz = Item.class;
    Test test = clazz.getAnnotation(Test.class);
    if (test == null) {
      return;
    }

    String name = test.name();
    int price = test.price();

    Item item = new Item(name, price);

    System.out.println(item.getName());
    System.out.println(item.getPrice());

  }
}
