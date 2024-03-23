package com_github_leetcode;

import java.util.Objects;

/**
 * ListNode
 */
public class ListNode {

  public int val;
  public ListNode next = null;

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public ListNode(int val) {
    this.val = val;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder("" + val);
    ListNode cur = next;
    while (Objects.nonNull(cur)) {
      str.append(", ");
      str.append(cur.val);
      cur = cur.next;
    }
    return str.toString();
  }

}
