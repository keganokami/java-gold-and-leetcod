package neetCode.easy;

import neetCode.ListNode;

public class RemoveDuplicatesFromSortedList {
  public static void main(String[] args) {
    ListNode node = ListNode.createList(1, 1, 2, 3, 3, 3, 3);
    System.out.println(deleteDuplicates(node));
  }

  public static ListNode deleteDuplicates(ListNode head) {

    ListNode out = new ListNode();

    // 参照をうつす。
    // 参照値渡し。この時、outに参照が向いている。
    ListNode current = out;

    while (head != null) {
      while (head.next != null && head.val == head.next.val) {
        head = head.next;
      }

      current.next = new ListNode(head.val);
      // 参照の値渡し。currentの参照の位置を変える。
      current = current.next;
      head = head.next;
    }
    return out.next;
  }
}


/**
 * この問題を解くにあたって
 * 以下のことを再認識する必要がある。
 * 
 * An object is a class instance or an array.
 * The reference values (often just references) are pointers to these objects, and a special null reference, which refers to no object.
 * というわけで、Java で「参照 (references)」といったら「参照値 (reference values)」という「値」のことです。「参照値」という「値」の正体はオブジェクトへのポインタです。ポインタなのであって、他の言語、例えば C++ などで言うところの「参照」とは全く別物なのです。
 * でもって、参照型の変数に入っているものもこの「参照値」という「値」なわけです。
 */
