package g0001_0100.s0003_longest_substring_without_repeating_characters;

/**
 * InnerSolution
 */
/**
 * Solution
 */
public class Solution {

  public int lengthOfLongestSubstring(String s) {
    int maxLen = 0;

    int[] lastIndex = new int[256];
    for (int i = 0; i < lastIndex.length; i++) {
      lastIndex[i] = -1;
    }

    int startPos = 0;
    for (int i = 0; i < s.length(); i++) {
      char charAt = s.charAt(i);
      if (lastIndex[charAt] < startPos) {
        lastIndex[charAt] = i;
      } else {
        startPos = lastIndex[charAt] + 1;
        lastIndex[charAt] = i;
      }
      maxLen = Math.max(maxLen, i - startPos + 1);
    }

    return maxLen;
  }

}
