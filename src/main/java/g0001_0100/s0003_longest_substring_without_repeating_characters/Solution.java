package g0001_0100.s0003_longest_substring_without_repeating_characters;

import java.util.Arrays;

/**
 * Solution
 */
public class Solution {

  public int lengthOfLongestSubstring(String str) {
    int[] charPos = new int[255];
    int maxLen = 0;
    int pstart = 0;
    int pcur = 0;
    Arrays.fill(charPos, -1);

    for (int i = 0; i < charPos.length; i++) {
      for (int j = i; j < charPos.length; j++) {

        if (str.charAt(pcur) == str.charAt(pstart)) {

        } else {

        }

      }
    }
    return maxLen;
  }

  public int lengthOfLongestSubstring2(String str) {
    int[] charPos = new int[255];
    int maxLen = 0;
    int pstart = 0;
    int pcur = 0;
    Arrays.fill(charPos, -1);

    while (pstart < str.length()) {

      if (charPos[str.charAt(pcur)] >= pstart) {

      } else {

      }
    }

    return maxLen;
  }
}
