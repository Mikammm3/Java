
// leetcode 114. 二叉树展开为链表
//class Solution {
//    public void flatten(TreeNode root) {
//        if (root == null) return;
//        List<TreeNode> ret = prevOrder(root);
//        for (int i = 0; i < ret.size() - 1; i++) {
//            TreeNode cur = ret.get(i);
//            cur.left = null;
//            cur.right = ret.get(i + 1);
//        }
//    }
//
//    public List<TreeNode> prevOrder(TreeNode root) {
//        List<TreeNode> ret = new ArrayList<>();
//        if (root == null) return ret;
//        ret.add(root);
//        ret.addAll(prevOrder(root.left));
//        ret.addAll(prevOrder(root.right));
//        return ret;
//    }
//}