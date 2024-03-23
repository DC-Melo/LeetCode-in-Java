package com_github_leetcode;

/**
 * LinkListUtils
 */
public class LinkListUtils {

  public static ListNode contructLinkedList(int num[]) {
    ListNode head = new ListNode(0);
    ListNode cur = head;
    if (num == null || num.length == 0) {
      return null;
    }
    for (int i = 0; i < num.length; i++) {
      cur.next = new ListNode(num[i]);
      cur = cur.next;
    }

    return head.next;

  }
}
