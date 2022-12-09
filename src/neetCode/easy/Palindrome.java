package neetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Palindrome {
  public static void main(String[] args) {
    int target = 121;
    System.out.println(isTest(target));
  }

  public static boolean isPalindrome(int x) {
      if(x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
      }
      String[] strArray = String.valueOf(x).split("");
      List<String> strList1 = Arrays.stream(strArray).collect(Collectors.toList());
      
      Collections.reverse(strList1);
      for (int i = 0; i < strArray.length; i++) {
        if (!strArray[i].equals(strList1.get(i))) {
          return false;
        }
      }
      return true;
  }

  public static boolean isTest(int x) {
    if(x<0) {
      return false;
    }
        int rev=0;
        int y=x;
        while(y>0)
        {
            int a=y%10;
            rev=rev*10+a;
            y=y/10;
        }
        return rev==x;
    }
}
