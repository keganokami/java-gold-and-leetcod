import java.util.stream.IntStream;

public class Main2 {
  public static void main(String[] args) {
    
    IntStream stream = IntStream.iterate(0, a -> a + 1);
    stream.limit(5).mapToObj(x -> x + ",").forEach(System.out::print);
  }
}
