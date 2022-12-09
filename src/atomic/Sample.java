package atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.processing.SupportedSourceVersion;

public class Sample {
  public static void main(String[] args) {
    ExecutorService exec = Executors.newFixedThreadPool(2);

    for (int i = 0; i < 100; i++) {
      // Value val = new Value();
      Value val = new AtomicValue();

      exec.submit(new Task(val));
      exec.submit(new Task(val));


      try {
        Thread.sleep(200);
      } catch (Exception e) {
        System.out.println("error");
      }

      if (val.get() == 100){
        System.out.println("not atomic");
        System.out.println(val.get());
        break;
      }
    }
    exec.shutdown();
  }
}
