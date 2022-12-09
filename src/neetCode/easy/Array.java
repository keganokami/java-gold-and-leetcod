package neetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Array {
  public static void main(String[] args) {

    int[] nums = {1,2,3,4};
    System.out.println(containsDuplicate(nums));
  }

  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> list = Arrays.stream(nums)       // IntStream
                                    .boxed()          // Stream<Integer>
                                    .collect(Collectors.toSet());
    return !(nums.length == list.size());
  }
}
