public class Parallels {
  public static void main(String[] args) {
    Thread thread = new Thread() {
      
      @Override
      public void start() {
        super.start();
        System.out.println("A");
      }
      @Override
      public void run() {
        super.run();
        System.out.println("B");
      }
    };
    thread.start();
    System.out.println("C");

  }
}
