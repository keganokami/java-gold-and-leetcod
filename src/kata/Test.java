package kata;

// public class Test<T extends A> {
//   public void test(T t) {
//     t.hello();
//   }
// }

public class Test<T> {
  T value;

  public Test(T value) {
    super();
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
