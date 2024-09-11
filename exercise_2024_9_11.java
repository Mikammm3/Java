
// leetcode LCR 175. 计算二叉树的深度
//class Solution {
//    public int calculateDepth(TreeNode root) {
//        if (root == null) return 0;
//        int leftHeight = calculateDepth(root.left);
//        int rightHeight = calculateDepth(root.right);
//        return Math.max(leftHeight, rightHeight) + 1;
//    }
//}


// leetcode LCR 176. 判断是否为平衡二叉树
//class Solution {
//    public boolean isBalanced(TreeNode root) {
//        // 可以在计算树的高度时，也判断是否是平衡二叉树
//        return getHeight(root) >= 0;
//    }
//
//
//    public int getHeight(TreeNode root) {
//        if (root == null) return 0;
//        int leftHeight = getHeight(root.left);
//        int rightHeight = getHeight(root.right);
//        if (leftHeight >= 0 && rightHeight >= 0 && Math.abs(leftHeight - rightHeight) <= 1) {
//            return Math.max(leftHeight, rightHeight) + 1;
//        } else {
//            // 说明不是平衡二叉树，那高度返回负数即可
//            return -1;
//        }
//    }
//}