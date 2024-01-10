
// LeetCode 257. 二叉树的所有路径
//class Solution {
//    List<String> ret = new ArrayList<>();
//
//    public List<String> binaryTreePaths(TreeNode root) {
//        dfs(root, "");
//        return ret;
//    }
//
//    public void dfs(TreeNode root, String path) {
//        if (root.left == null && root.right == null) {
//            path += root.val;
//            ret.add(path);
//        } else path += root.val + "->";
//        if (root.left != null) dfs(root.left, path);
//        if (root.right != null) dfs(root.right, path);
//    }
//}