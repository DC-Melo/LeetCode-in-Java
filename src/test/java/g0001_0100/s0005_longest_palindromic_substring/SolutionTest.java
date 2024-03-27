package g0001_0100.s0005_longest_palindromic_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

/**
 * SolutionTest
 */
public class SolutionTest {

  @Test
  public void longestPalindrome3() {
    assertThat(new Solution().longestPalindrome("aaaa"), equalTo("aaaa"));
  }

  @Test
  void longestPalindrome() {
    // assertThat(new Solution().longestPalindrome("babad"), equalTo("bab"));
    assertThat(new Solution().longestPalindrome("babad"), equalTo("aba"));
  }

  @Test
  void longestPalindrome2() {
    assertThat(new Solution().longestPalindrome("cbbd"), equalTo("bb"));
  }
}
