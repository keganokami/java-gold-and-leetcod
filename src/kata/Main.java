package kata;

public class Main {
  public static void main(String[] args) {
    // // A a = new B();
    // // a.hello();
    // Test<A> a = new Test<>();
    // Test<B> b = new Test<>();
    // // Test<C> c = new Test<>();
    // a.test(new A());
    // a.test(new B());
    // b.test(new B());

    // Test<? extends B> test = new Test<B>(new B());
    // B b = test.getValue();
    // b.hello(); 
    Test<? super B> a = new Test<A>(new A());
    Test<? super B> b = new Test<B>(new B());
    // Test<? super B> c = new Test<C>(new C());

    // a.setValue(new A());
    a.setValue(new B());
    a.setValue(new C());
    b.setValue(new B());
    b.setValue(new C());


    /**
     * extendsはポリモーフィズムがはたらいて、戻り値を受け取ることができる。
     * superは安全性のためにObject型でウケる。
     */

  }
}
