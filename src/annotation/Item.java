package annotation;

@Test(name = "test", price = 100)
@ArraysData(data = {1,2,3,4})
public class Item {
  private String name;
  private int price;

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return price;
  }
}
