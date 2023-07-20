

//LeetCode 144. 二叉树的前序遍历
//class Solution {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> ret = new ArrayList<>();
//        if (root == null) {
//            return ret;
//        }
//        ret.add(root.val);
//        //System.out.print(root.val + " ");
//        List<Integer> left = preorderTraversal(root.left);
//        ret.addAll(left);
//        List<Integer> right = preorderTraversal(root.right);
//        ret.addAll(right);
//        return ret;
//    }
//}