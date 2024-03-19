package striver._3_arrays._2;

import java.util.ArrayList;
import java.util.Collections;

public class _5_maximumSubarrayLength {
  public static int longestSubarrayWithSumK(int[] arr, long k) {
    long sum = Long.MIN_VALUE, currSum = 0;
    ArrayList<Integer> lengths = new ArrayList<>();
    int length = 0;
    for (int var : arr) {
      currSum += var;
      length++;
      if (currSum > sum) {
        currSum = 0;
        length = 0;
      } else if (currSum == sum) lengths.add(length);
    }
    return Collections.max(lengths);
  }
}
