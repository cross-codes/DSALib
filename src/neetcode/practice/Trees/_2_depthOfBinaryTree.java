package neetcode.practice.Trees;

public class _2_depthOfBinaryTree {
  public static int maxDepth(TreeNode root) {
    if (root == null) return 0;

    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }
}
