package neetCode.easy;

public class LengthOfLastWord {

  public static void main(String[] args) {
    var str = "rld";
    System.out.println(lengthOfLastWord(str));
  }
  
  public static int lengthOfLastWord(String s) {
        var tmp = s.split(" ");
        var i = s.split(" ").length;
        return tmp[i -1].length();
  }
}
