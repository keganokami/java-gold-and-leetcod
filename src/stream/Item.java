package stream;


public class Item {
  private int id;
  private ItemType type;
  private String name;
  private int price;
  public Item(int id, ItemType type, String name, int price) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.price = price;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public ItemType getType() {
    return type;
  }
  public void setType(ItemType type) {
    this.type = type;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Item [id=" + id + ", type=" + type + ", name=" + name + ", price=" + price + "]";
  }
}
