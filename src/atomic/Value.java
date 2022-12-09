package atomic;
public class Value {
  private int num = 0;
  public void add(int num) {
    System.out.println("no atomic add");
    this.num += num;
  }

  public int get() {
    return num;
  }
}
