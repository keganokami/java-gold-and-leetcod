import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionSample {
  public static void main(String[] args) {
    // Function<Integer, Integer> a = x -> x + 2;
    // Function<Integer, Integer> b = x -> x * 2;
    // System.out.println(a.compose(b).apply(10));
    // BiFunction<Integer, Integer, String> test = (a, b) -> Integer.toString(a + b);
    // System.out.println(test.apply(3, 5));
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");

    list.replaceAll(x -> x.toUpperCase());
    for(String str : list) {
      System.out.println(str);
    }
    
  }




}
