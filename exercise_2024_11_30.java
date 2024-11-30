
// leetcode 105. 从前序与中序遍历序列构造二叉树
//class Solution {
//    public int i = 0;
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        return buildTree(preorder, inorder, 0, preorder.length - 1);
//    }
//
//    public TreeNode buildTree(int[] preorder, int[] inorder, int start, int end) {
//        if (start > end) return null;
//        int rootVal = preorder[i];
//        // 然后从中序遍历中寻找 rootIndex
//        int rootIndex = findRootIndex(inorder, start, end, rootVal);
//        // 找完后 i++
//        i++;
//        TreeNode root = new TreeNode(rootVal);
//        // 根的左边是左子树
//        root.left = buildTree(preorder, inorder, start, rootIndex - 1);
//        // 右边是右子树
//        root.right = buildTree(preorder, inorder, rootIndex + 1, end);
//        return root;
//    }
//
//    public int findRootIndex(int[] inorder, int start, int end, int rootVal) {
//        for (int i = start; i <= end; i++) {
//            if (inorder[i] == rootVal) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}