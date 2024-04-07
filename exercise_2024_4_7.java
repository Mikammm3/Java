
// leetcode 236. 二叉树的最近公共祖先
//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null) return null;
//        // 根左右遍历
//        if (p == root || q == root) {
//            return root;
//        }
//
//        TreeNode left = lowestCommonAncestor(root.left, p, q);
//        TreeNode right = lowestCommonAncestor(root.right, p, q);
//        if (left != null && right != null) {
//            // 说明 p 和 q 在 root 的左子树和右子树
//            return root;
//        } else if (left != null) {
//            // p 和 q 在 root 的左边,
//            return left;
//        } else {
//            // // p 和 q 在 root 的右边
//            return right;
//        }
//    }
//}