
// LeetCode 230. 二叉搜索树中第K小的元素
//class Solution {
//    public int count = 0;
//    public int ret = 0;
//
//    public int kthSmallest(TreeNode root, int k) {
//        if (root == null) return -1;
//        count = k;
//        dfs(root);
//        return ret;
//    }
//
//    public void dfs(TreeNode root) {
//        if (root == null) return;
//        dfs(root.left);
//        count--;
//        if (count == 0) {
//            ret = root.val;
//            return;
//        }
//        dfs(root.right);
//    }
//}