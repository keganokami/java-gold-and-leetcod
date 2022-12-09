public class ObjectSample {
  public static void main(String[] args) {
    var object = new Object() {
      public void test() {
        System.out.println("test");
      }
    };
    object.test();
  }
}
