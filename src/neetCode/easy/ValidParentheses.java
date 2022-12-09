package neetCode.easy;

import java.text.FieldPosition;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
  public static void main(String[] args) {
    var s = "{}[]";
    System.out.println(isValid(s));

  }

  public static boolean isValid(String s) {
    // 偶数ならOK　奇数ならその場でだめ　前半部分と後半部分の比較
    char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char element : chars) {
            if (element == '(' || element == '[' || element == '{') {
                stack.push(element);
                continue;
            } else if (stack.empty()) {
                return false;
            }
            char top = stack.pop();
            if (top == '(' && element != ')') {
                return false;
            } else if (top == '[' && element != ']') {
                return false;
            } else if (top == '{' && element != '}') {
                return false;
            }
        }
        return stack.empty();
  }
}
