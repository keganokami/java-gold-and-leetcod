import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Sample6 {
  public static void main(String[] args) {
    List<String> list  = List.of("A", "B", "C");
    Consumer<String> a = c -> System.out.println(c);
    Consumer<String> b = a.andThen(str -> System.out.println(":" + str.toLowerCase()));
    list.forEach(b);

    Function<Integer, Integer> f1 = x -> x + 2;
    Function<Integer, Integer> f2 = x -> x * 2;

    System.out.println(f1.andThen(f2).apply(10));
    // compose before
    // andThen after
  }
}
