public class Factory {
  public static void Hello () {
    Test test = new Test() {
      @Override
      public void call() {
        System.out.println("call");
      };

      @Override
      public void execute() {
        System.out.println("hello");
      };
    };
    test.call();
    test.execute();
  }

  public static Test Bye() {
    String message = "Byee";
    class Bye implements Test {
      @Override
      public void execute() {
        System.out.println(message);
      }

      @Override
      public void call() {
        System.out.println("call Bye");
        
      }
    }
    return new Bye();
  }
}

interface Test {
  void execute();
  void call();
}

interface A {
  default void test() {
    System.out.println("A");
  }
}

interface B {
  
}