
// leetcode 226. 翻转二叉树
//class Solution {
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;
//        TreeNode tmp = root.left;
//        root.left = root.right;
//        root.right = tmp;
//        invertTree(root.left);
//        invertTree(root.right);
//        return root;
//    }
//}