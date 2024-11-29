
// leetcode 101. 对称二叉树
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) return true;
//        return isSymmetric(root.left, root.right);
//    }
//
//    public boolean isSymmetric(TreeNode p, TreeNode q) {
//        if (p == null && q == null) return true;
//        if (p == null && q != null || p != null && q == null) {
//            return false;
//        }
//        if (p.val != q.val) return false;
//        return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
//    }
//}