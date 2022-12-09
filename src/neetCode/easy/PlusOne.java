package neetCode.easy;

import java.math.BigDecimal;
import java.util.Arrays;

public class PlusOne {
  public static void main(String[] args) {
    int[] digits = {9,9,9};
    System.out.println(plusOne(digits));
  }

  public static int[] plusOne(int[] digits) {
    int n = digits.length;
    for(int i= n - 1; i >= 0 ; i--) {
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        else{
            digits[i]=0;
        }
    }
    int [] arr = new int[n+1];
    arr[0]=1;
    return arr;
  }
}
