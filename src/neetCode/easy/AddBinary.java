package neetCode.easy;

import java.math.BigInteger;

public class AddBinary {

  public static void main(String[] args) {
    var target1 = "1111";
    var target2 = "1";
    System.out.println(addBinary(target1, target2));
  }

  public static String addBinary(String a, String b) {
    return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
  }
}
