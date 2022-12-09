package collector;

import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class SampleCollector implements Collector<String, StringBuilder, String> {

  @Override
  public Supplier<StringBuilder> supplier() {
    return StringBuilder::new;
  }

  @Override
  public BiConsumer<StringBuilder, String> accumulator() {
    return (builder, str) -> {
      if (builder.length() != 0) {
        builder.append(",");
      }
      builder.append(str);
    };
  }

  @Override
  public BinaryOperator<StringBuilder> combiner() {
    return (a, b) -> {
      a.append(b);
      return a;
    };
  }

  @Override
  public Function<StringBuilder, String> finisher() {
    return builder -> builder.toString();
  }

  @Override
  public Set<Characteristics> characteristics() {
    return EnumSet.noneOf(Characteristics.class);
  }
}