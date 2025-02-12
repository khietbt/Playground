public class DeleteTheMiddleNodeOfALinkedList {
  public static void main(String[] args) {

  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

class Solution {
  public ListNode deleteMiddle(ListNode head) {
    ListNode dummy = new ListNode(0, head);

    ListNode slow = dummy;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    slow.next = slow.next.next;

    return dummy.next;
  }
}
