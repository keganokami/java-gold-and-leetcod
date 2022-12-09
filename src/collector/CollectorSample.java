package collector;

import java.util.Arrays;
import java.util.List;

public class CollectorSample {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("A","B","C","D");
    // StringBuilder builder = new StringBuilder();

    // list.stream().forEach(str -> {
    //   if (builder.length() != 0) {
    //     builder.append(",");
    //   }
    //   builder.append(str);
    // });
    // System.out.println(builder);
    String result = list.parallelStream().collect(new SampleCollector());
    System.out.println(result);
  }

}
