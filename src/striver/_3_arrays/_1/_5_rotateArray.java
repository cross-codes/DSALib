package striver._3_arrays._1;

public class _5_rotateArray {
  public static void swap(int[] arr, int idx1, int idx2) {
    int temp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = temp;
  }

  // Code to move the last element to the beginning
  public static void rotateOnePermutation(int[] arr) {
    for (int i = arr.length - 1; i > 0; i--) swap(arr, i, i - 1);
  }

  public static void rotate(int[] nums, int k) {
    for (int i = nums.length - k; i < nums.length; i++) rotateOnePermutation(nums);
  }

  public static void main(String[] args) {
    int[] testArr = {3, 1, 2, 5};
    rotateOnePermutation(testArr);
    for (int i = 0; i < testArr.length; i++) {
      System.out.println(testArr[i]);
    }
  }
}
