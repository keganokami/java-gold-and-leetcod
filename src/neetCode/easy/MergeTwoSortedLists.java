package neetCode.easy;

import neetCode.ListNode;

public class MergeTwoSortedLists {

  public static void main(String[] args) {
    var list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
    var list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    System.out.println(mergeTwoLists(list1, list2).next.next.val);
  }


  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    final ListNode result = new ListNode();
    ListNode tail = result;
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;
    }
    tail.next = list1 != null ? list1 : list2;
    return result.next;
  }
}
