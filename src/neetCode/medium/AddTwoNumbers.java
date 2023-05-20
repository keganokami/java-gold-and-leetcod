package neetCode.medium;

import neetCode.ListNode;

public class AddTwoNumbers {

  public static void main(String[] args) {
    var l1 = ListNode.createList(9,9,9,9,9,9,9);
    var l2 = ListNode.createList(9,9,9,9);
    System.out.println(addTwoNumbers(l1, l2));
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    int carry = 0;
    while (l1 != null || l2 != null || carry == 1) {
      int sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      sum += carry;
      carry = sum / 10;
      ListNode node = new ListNode(sum % 10);
      curr.next = node;
      curr = curr.next;
    }
    return dummy.next;
  }
}
