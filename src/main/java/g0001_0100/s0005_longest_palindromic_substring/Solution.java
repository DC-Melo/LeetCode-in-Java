package g0001_0100.s0005_longest_palindromic_substring;

import java.nio.channels.Selector;

/**
 * Solution
 */
public class Solution {

  public String longestPalindrome(String s) {
    int n = s.length();
    int startPos = 0;
    int maxLen = 0;

    boolean[][] dp = new boolean[n][n];
    // for one elements
    for (int i = 0; i < n; i++) {
      dp[i][i] = true;
    }
    // for two elements
    for (int i = 0; i < n - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        dp[i][i + 1] = true;
        maxLen = 2;
        startPos = i;
      }
    }
    // for more than 3 elements
    for (int l = 3; l <= n; l++) {
      for (int i = 0; i <= n - l; i++) {
        if (s.charAt(i) == s.charAt(i + l - 1) && dp[i + 1][i + l - 2]) {
          dp[i][i + l - 1] = true;
          startPos = i;
          maxLen = l;
        } else {
          dp[i][i + l - 1] = false;
        }
      }
    }
    return s.substring(startPos, startPos + maxLen);
  }
}
