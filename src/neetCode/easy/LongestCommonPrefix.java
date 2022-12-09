package neetCode.easy;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
  // 文字分、文字をためてSETにして重複があればそれまでの文字を出す。
  // forで１インデックス目の文字の先頭と残りの文字を比較して、全部通るならその文字を＋＝結合 ない時点でリターン
  public static void main(String[] args) {
    String[] target = {"abab","aba","abc"};
    System.out.println(longestCommonPrefix(target));
    
  }

  public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    Arrays.sort(strs);
    String first = strs[0];
    String last = strs[strs.length - 1];
    int c = 0;
    while (c < first.length()) {
      if (first.charAt(c) == last.charAt(c))
        c++;
      else
        break;
    }
    return c == 0 ? "" : first.substring(0, c);
  }
}
