package g0001_0100.s0004_median_of_two_sorted_arrays;

/**
 * Solution
 */
public class Solution {
  public double findMedianSortedArrays(int[] a1, int[] a2) {
    if (a1.length > a2.length)
      findMedianSortedArrays(a2, a1);

    int a1low = 0;
    int a1high = a1.length;
    int a1cut;
    int a2cut;
    System.out.println("=========");
    while (a1low <= a1high) {
      a1cut = (a1low + a1high) / 2;
      a2cut = (a1.length + a2.length + 1) / 2 - a1cut;
      System.out.printf("%d,%d\n", a1cut, a2cut);

      int a1l = (a1cut == 0) ? Integer.MIN_VALUE : a1[a1cut - 1];
      int a2l = (a2cut == 0) ? Integer.MIN_VALUE : a2[a2cut - 1];
      int a1r = (a1cut == a1.length) ? Integer.MAX_VALUE : a1[a1cut];
      int a2r = (a2cut == a2.length) ? Integer.MAX_VALUE : a2[a2cut];

      if (a1l <= a2r && a2l <= a1r) {
        if ((a1.length + a2.length) % 2 == 0) {
          return (Math.max(a1l, a2l) + Math.min(a1r, a2r)) / 2.0;
        }
        return Math.max(a1l, a2l);
      } else if (a1l > a2r) {
        a1high = a1cut - 1;
      } else {
        a1low = a1cut + 1;
      }

    }

    return 0.0d;
  }
}
