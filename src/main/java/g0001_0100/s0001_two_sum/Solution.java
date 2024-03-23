package g0001_0100.s0001_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 */
public class Solution {
  public int[] twoSum(int[] arr, int target) {
    Map<Integer, Integer> expArr = new HashMap<>();
    Integer expNum;
    for (int i = 0; i < arr.length; i++) {
      expNum = target - arr[i];
      if (expArr.containsKey(expNum)) {
        return new int[] { expArr.get(expNum), i };
      } else {
        expArr.put(arr[i], i);
        System.out.println(expArr);
      }

    }
    return new int[] { -1, -1 };
  }

}
