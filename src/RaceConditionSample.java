import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RaceConditionSample implements Runnable {
  private int num = 100;
  public static void main(String[] args) {
    RaceConditionSample s = new RaceConditionSample();

    ExecutorService exec = Executors.newFixedThreadPool(2);
    while(true) {
      exec.submit(s);
      exec.submit(s);
  
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      System.out.println(s.num);
      if (s.num == 200) {
        break;
      }
      s.num = 100;
    }
    System.out.println(s.num);
    exec.shutdown();
  }

  public synchronized void add(int amount) {
    this.num = this.num + amount;
  }

  @Override
  public void run() {
    add(100);
  }
}
