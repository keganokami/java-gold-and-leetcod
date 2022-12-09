import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorSample {
  public static void main(String[] args) throws InterruptedException {
    ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();

    exec.scheduleWithFixedDelay(() -> {
      int r = new Random().nextInt(10);
      System.out.println(r);
      try {
        Thread.sleep(r * 100);
      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      }
      System.out.println("interrupt");
    }, 1, 1, TimeUnit.SECONDS);

    int count = 0;
    while (true) {
      Thread.sleep(100);
      System.out.print(">");
      count++;
      if (count == 100) {
        exec.shutdown();
        break;
      }
    }
  }
}
