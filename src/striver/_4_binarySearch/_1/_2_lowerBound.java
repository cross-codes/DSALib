package striver._4_binarySearch._1;

/**
 *
 *
 * <pre>
 * The lower bound algorithm finds the smallest index in a sorted array, where the element is larger
 * than the target or equal to it
 *
 * The array is already sorted in ascending order. Binary search would enable us to find a target element,
 * but here, we need to find an element that is smaller than the target, and the next is greater than the target
 *
 * An easy strategy would be to binary search for the target, and then trace backwards from the L = R point.
 * </pre>
 */
public class _2_lowerBound {
  public static int lowerBound(int[] nums, int x) {
    int n = nums.length, L = 0, R = n - 1, m = -1;
    while (L != R) {
      if ((L + R) % 2 != 0) m = (L + R) / 2 + 1;
      else m = (L + R) / 2;

      if (nums[m] > x) R = m - 1;
      else L = m;
    }

    for (; L > 0; L--) if (nums[L] <= x) return L + 1;
    return n;
  }

  public static void main(String[] args) {
    int[] arr = {3, 5, 8, 15, 19};
    int T = 9;
    System.out.println(lowerBound(arr, T));
  }
}
