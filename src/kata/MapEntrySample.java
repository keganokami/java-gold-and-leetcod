package kata;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapEntrySample {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("ONE", 1);
    map.put("TWO", 2);
    map.put("THREE", 3);

     Set<Entry<String, Integer>> entrySet = map.entrySet();

    entrySet.forEach((Map.Entry<String, Integer> entry) -> {
      String key = entry.getKey();
      Integer val = entry.getValue();
      System.out.println(key + " " + val);
    });
  }
}
