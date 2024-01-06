
// LeetCode 129. 求根节点到叶节点数字之和
//class Solution {
//    public int sumNumbers(TreeNode root) {
//        return dfs(root, 0);
//    }
//
//    public int dfs(TreeNode root, int presum) {
//        if (root == null) return 0;
//        int newSum = presum * 10 + root.val;
//        if (root.left == null && root.right == null) return newSum;
//        else return dfs(root.left, newSum) + dfs(root.right, newSum);
//    }
//}