
// leetcode LCR 124. 推理二叉树
//class Solution {
//    public int preIndex;
//
//    public TreeNode deduceTree(int[] preorder, int[] inorder) {
//        TreeNode root = createTree(inorder, preorder, 0, preorder.length - 1);
//        return root;
//    }
//
//    public TreeNode createTree(int[] inorder, int[] preorder, int start, int end) {
//        if (start > end) return null;
//        TreeNode root = new TreeNode(preorder[preIndex]);
//        // 找下标
//        int rootIndex = getRootIndex(inorder, start, end, preorder[preIndex]);
//        preIndex++;
//        if (rootIndex == -1) return root;
//        root.left = createTree(inorder, preorder, start, rootIndex - 1);
//        root.right = createTree(inorder, preorder, rootIndex + 1, end);
//        return root;
//    }
//
//    // 在中序遍历中找到根节点
//    public int getRootIndex(int[] inorder, int start, int end, int key) {
//        for (int i = start; i <= end; i++) {
//            if (inorder[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}


// leetcode LCR 143. 子结构判断
//class Solution {
//    public boolean isSubStructure(TreeNode A, TreeNode B) {
//        // 题目要求，如果两棵树都为空，则返回 false
//        if (A == null && B == null) {
//            return false;
//        }
//        if (A == null && B != null || A != null && B == null) return false;
//
//        return isSubTree(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
//    }
//
//    public boolean isSubTree(TreeNode p, TreeNode q) {
//        // 1. 值相同  2. 结构相同
//        if (p == null && q == null) return true;
//
//        if (p == null && q != null) return false;
//
//        // 当 q 为空时，p 可以不为空
//        if (p != null && q == null) return true;
//
//        // 值不相同
//        if (p.val != q.val) return false;
//
//        return isSubTree(p.left, q.left) && isSubTree(p.right, q.right);
//    }
//}