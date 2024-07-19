package neetcode.practice.Sliding_Window;

import java.util.LinkedHashMap;
import java.util.Map;

public class _4_permutationString {
  public static boolean checkInclusion(String s1, String s2) {
    int n = s1.length(), N = s2.length();

    if (s2.length() == 1) {
      if (s2.equals(s1)) return true;
      else return false;
    }

    // Calculate frequencies
    int[] freq = new int[26];

    for (int i = 0; i < n; i++) freq[s1.charAt(i) - 'a']++;

    Map<Character, Integer> map = new LinkedHashMap<>();

    int i = -1, j = -1;

    for (int k = 0; k < N; k++) {
      if (map.containsKey(s2.charAt(k))) {
        i = k;
        j = i + 1;
        break;
      }
    }

    while (j < n) {}
  }
}
