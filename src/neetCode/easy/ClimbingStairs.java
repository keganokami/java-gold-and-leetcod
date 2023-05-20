package neetCode.easy;

public class ClimbingStairs {

  public static void main(String[] args) {
    System.out.println(climbStairs(5));
  }

  public static int climbStairs(int n) {

    int a = 1;
    int b = 1;
    for (int i = 0; i < n - 1; i++) {
      int temp = a;
      a = b;
      b = b + temp;
    }

    return b;
  }
}

// Example 1:
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:
// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step
