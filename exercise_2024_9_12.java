
// leetcode LCR 193. 二叉搜索树的最近公共祖先
//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        // 分三种情况，第一种是 p 或者 q 中有一个是 root
//        // 一种是 p 和 q 都在 root 的左边或者右边
//        // 另一种是 p 和 q 分别在 root 的两边
//        if (root == p || root == q) return root;
//        if (root == null || p == null || q == null) return null;
//        TreeNode left = lowestCommonAncestor(root.left, p, q);
//        TreeNode right = lowestCommonAncestor(root.right, p, q);
//        if (left != null && right != null) {
//            return root;
//        } else if (left == null) {
//            return right;
//        } else {
//            return left;
//        }
//
//    }
//}


// leetcode LCR 194. 二叉树的最近公共祖先
//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null) return null;
//        Stack<TreeNode> s1 = new Stack<>();
//        Stack<TreeNode> s2 = new Stack<>();
//        getPath(root, p, s1);
//        getPath(root, q, s2);
//        int len = s1.size() - s2.size();
//        if (len < 0) {
//            len = s2.size() - s1.size();
//            while (len != 0) {
//                s2.pop();
//                len--;
//            }
//        } else {
//            while (len != 0) {
//                s1.pop();
//                len--;
//            }
//        }
//        while (!s1.empty() && !s2.empty()) {
//            TreeNode top1 = s1.pop();
//            TreeNode top2 = s2.pop();
//            if (top1 == top2) return top1;
//        }
//        return null;
//    }
//
//    public boolean getPath(TreeNode root, TreeNode target, Stack<TreeNode> stack) {
//        if (root == null) return false;
//        stack.push(root);
//        if (root == target) return true;
//        boolean left = getPath(root.left, target, stack);
//        if (left) return true;
//        boolean right = getPath(root.right, target, stack);
//        if (right) return true;
//        // 到这里说明左子树和右子树都没找到 target
//        // 说明不是路径上的节点, 删除节点返回 false
//        stack.pop();
//        return false;
//    }
//}