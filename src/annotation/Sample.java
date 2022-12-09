package annotation;

public class Sample {
  
  @NotNull(message = "name is not allowed null")
  private String name;

  @NotNull(message = "price is not allowed null")
  private Integer price;

  public Sample(String name, Integer price) {
    this.name = name;
    this.price = price;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
