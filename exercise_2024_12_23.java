

// letcode 114. 二叉树展开为链表
//class Solution {
//    public void flatten(TreeNode root) {
//        if (root == null) return;
//        List<TreeNode> ret = prevOrder(root);
//        for (int i = 0; i < ret.size(); i++) {
//            TreeNode cur = ret.get(i);
//            TreeNode curNext = null;
//            if (i < ret.size() - 1) {
//                curNext = ret.get(i + 1);
//            }
//            cur.left = null;
//            cur.right = curNext;
//        }
//
//    }
//
//    public List<TreeNode> prevOrder(TreeNode root) {
//        List<TreeNode> ret = new ArrayList<>();
//        if (root == null) return ret;
//        ret.add(root);
//        ret.addAll(prevOrder(root.left));
//        ret.addAll(prevOrder(root.right));
//        return ret;
//
//    }
//}
class Solution {
    public void flatten(TreeNode root) {
        // 思路：将左子树变成链表，根连接链表
        // 找链表最后一个节点，让右子树变成链表，最后连接尾巴节点和右子树链表
        if (root == null)
            return;
        // 先将左子树变成链表
        flatten(root.left);
        TreeNode right = root.right;
        // 题目要求, 连接后此时 root 和左子树已经是链表了
        root.right = root.left;
        root.left = null;
        // 找连接点，链表的最后一个节点
        while (root.right != null) {
            root = root.right;
        }
        // 将右子树变成链表
        flatten(right);
        root.right = right;
    }
}

// leetcode 105. 从前序与中序遍历序列构造二叉树
//class Solution {
//    // 前序遍历下标
//    int prevIndex;
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        return inOrder(preorder, inorder, 0, preorder.length - 1);
//    }
//
//    public TreeNode inOrder(int[] preorder, int[] inorder, int start, int end) {
//        if (start > end) return null;
//        int rootVal = preorder[prevIndex];
//        TreeNode root = new TreeNode(rootVal);
//        // 找中序遍历的根节点
//        int rootIndex = findRootIndex(inorder, start, end, rootVal);
//        prevIndex++;
//        if (rootIndex == -1) {
//            return root;
//        }
//        root.left = inOrder(preorder, inorder, start, rootIndex - 1);
//        root.right = inOrder(preorder, inorder, rootIndex + 1, end);
//        return root;
//    }
//
//    public int findRootIndex(int[] arr, int start, int end, int target) {
//        for (int i = start; i <= end; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}