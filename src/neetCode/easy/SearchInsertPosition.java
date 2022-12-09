package neetCode.easy;

public class SearchInsertPosition {
  public static void main(String[] args) {
    int[] nums = {1,2,7,8,10,15,20,22,30,50};
    int target = 18;
    System.out.println(searchInsert(nums, target));
    
  }

  public static int searchInsert(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++) {
        //   if (nums[i] == target) {
        //     return i;
        //   }
        //   if (nums[i] > target) {
        //     return i;
        //   }
        // }
        // return nums.length;
        int lo = 0; 
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target < nums[mid]) {
              hi = mid - 1;
            }
            else if (target > nums[mid]) {
              lo = mid + 1;
            } else {
              return mid;
            }
        }

        return lo;
  }
}
