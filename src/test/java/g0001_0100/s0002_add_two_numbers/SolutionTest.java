package g0001_0100.s0002_add_two_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;

/**
 * SolutionTest
 */
public class SolutionTest {

  @Test
  public void addTwoNumberTest() {

    ListNode l1 = LinkedListUtils.contructLinkedList(new int[] { 2, 4, 3 });
    ListNode l2 = LinkedListUtils.contructLinkedList(new int[] { 5, 6, 4 });
    assertThat(new Solution().addTwoNumbers(l1, l2).toString(), equalTo("7, 0, 8"));
  }
}
