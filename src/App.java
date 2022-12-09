import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws Exception {
        // ItemBuilder item = new ItemBuilder.Builder(100)
        // .with(b -> {
        // b.name = "orange";
        // b.price = 200;
        // }).build();
        // System.out.println(item);
        // ExecutorService executor = Executors.newSingleThreadExecutor();

        // Future<Integer> future = executor.submit(() -> {
        //     System.out.println(LocalTime.now() + " Starting runnable");
        //     Integer sum = 1 + 1;
        //     Thread.sleep(3000);
        //     return sum;
        // });


        // System.out.println(LocalTime.now() + " Waiting the task done");
        // Integer result = future.get();
        // System.out.println(LocalTime.now() + " Result : " + result);

        Runnable r = () -> {
            System.out.println("hello");
          };
      
          r.run();

      
          var a = Files.lines(Paths.get("data.txt"));
          a.forEach(System.out::print);
    }
}
