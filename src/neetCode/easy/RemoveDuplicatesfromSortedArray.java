package neetCode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesfromSortedArray {
  public static void main(String[] args) {
    int[] list = {0,0,1,1,1,2,2,3,3,4};
    System.out.println(removeDuplicates(list));
    for(int i : list) {
      System.out.println(i);
    }
  }
  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int j = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[j++] = nums[i];
        System.out.println(j);
			}
		}
		nums[j++] = nums[nums.length - 1];
		return j;
  }
}
