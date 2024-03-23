package g0001_0100.s0002_add_two_numbers;

import java.util.Objects;

import com_github_leetcode.ListNode;

/**
 * Solution
 */
public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    System.out.println("=============");
    System.out.println(l1.toString());
    System.out.println(l2.toString());
    System.out.println("=============");

    ListNode head = new ListNode(0);
    ListNode cur = head;
    ListNode cur1 = l1;
    ListNode cur2 = l2;
    int carry = 0;
    while (Objects.nonNull(cur1) || Objects.nonNull(cur2)) {
      int v1 = Objects.nonNull(cur1) ? cur1.val : 0;
      int v2 = Objects.nonNull(cur2) ? cur2.val : 0;
      cur.next = new ListNode((v1 + v2 + carry) % 10);
      carry = (v1 + v2 + carry) / 10;
      System.out.println(v1 + v2);
      if (Objects.nonNull(cur1)) {
        cur1 = cur1.next;
      }
      if (Objects.nonNull(cur2)) {
        cur2 = cur2.next;
      }
      cur = cur.next;
    }

    return head.next;
  }
}
