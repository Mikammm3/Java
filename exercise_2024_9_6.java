

// leetcode LCR 144. 翻转二叉树
//class Solution {
//    public TreeNode mirrorTree(TreeNode root) {
//        if (root == null) return null;
//        TreeNode tmp = root.left;
//        root.left = root.right;
//        root.right = tmp;
//        mirrorTree(root.left);
//        mirrorTree(root.right);
//        return root;
//    }
//}


// leetcode LCR 145. 判断对称二叉树
//class Solution {
//    public boolean checkSymmetricTree(TreeNode root) {
//        if (root == null) return true;
//        return isSymmetricTree(root.left, root.right);
//    }
//
//    public boolean isSymmetricTree(TreeNode p, TreeNode q) {
//        // 1. 结构相同 2. 值相同
//        if (p == null && q == null) return true;
//        if (p == null && q != null || p != null && q == null) return false;
//        if (p.val != q.val) return false;
//        // 对称，如图示例一
//        return isSymmetricTree(p.left, q.right) && isSymmetricTree(p.right, q.left);
//    }
//}