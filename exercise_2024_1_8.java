
// LeetCode 98. 验证二叉搜索树
//class Solution {
//    public long prev = Long.MIN_VALUE;
//
//    public boolean isValidBST(TreeNode root) {
//        if (root == null) return true;
//        if (root.left == null && root.right == null) {
//            if (root.val > prev) {
//                prev = root.val;
//                return true;
//            } else return false;
//        }
//        boolean left = isValidBST(root.left);
//        if (root.val > prev) prev = root.val;
//        else return false;
//        boolean right = isValidBST(root.right);
//        return left && right;
//    }
//}