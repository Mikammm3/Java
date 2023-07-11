

//LeetCode 110. 平衡二叉树
//class Solution {
//    public boolean isBalanced(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        return getHeigh(root) >= 0;
//    }
//
//    public int getHeigh(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int leftHeigh = getHeigh(root.left);
//        int rightHeigh = getHeigh(root.right);
//        if (leftHeigh >= 0 && rightHeigh >= 0 && Math.abs(leftHeigh - rightHeigh) <= 1) {
//            return Math.max(leftHeigh, rightHeigh) + 1;
//        } else {
//            return -1;
//        }
//    }
//}


//LeetCode 100. 相同的树
//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null && q != null || p != null && q == null) {
//            return false;
//        }
//        if (p == null && q == null) {
//            return true;
//        }
//        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//    }
//}


//LeetCode 226. 翻转二叉树
//class Solution {
//    public TreeNode invertTree(TreeNode root) {
//        //交换地址
//        if (root == null) {
//            return null;
//        }
//        TreeNode tmp = root.left;
//        root.left = root.right;
//        root.right = tmp;
//        invertTree(root.left);
//        invertTree(root.right);
//        return root;
//    }
//}


//LeetCode 101. 对称二叉树
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        return isSame(root.left, root.right);
//    }
//
//    public boolean isSame(TreeNode p, TreeNode q) {
//        if (p == null && q != null || p != null && q == null) {
//            return false;
//        }
//        if (p == null && q == null) {
//            return true;
//        }
//        if (p.val == q.val && isSame(p.left, q.right) && isSame(p.right, q.left)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}


//LeetCode 572. 另一棵树的子树
//class Solution {
//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        if (root == null) {
//            return false;
//        }
//        if (isSametree(root, subRoot)) {
//            return true;
//        }
//        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//    }
//
//    public boolean isSametree(TreeNode p, TreeNode q) {
//        //1.结构相同
//        if (p == null && q != null || p != null && q == null) {
//            return false;
//        }
//        if (p == null && q == null) {
//            return true;
//        }
//        //2.值相同
//        if (p.val != q.val) {
//            return false;
//        }
//        return isSametree(p.left, q.left)
//                && isSametree(p.right, q.right);//对称
//    }
//}


//牛客网 KY11 二叉树遍历
//import java.util.Scanner;
//
//class TreeNode {
//    char val;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode() {
//
//    }
//
//    public TreeNode(char val) {
//        this.val = val;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String str = in.nextLine();
//            TreeNode root = createTree(str);
//            inorder(root);
//        }
//    }
//
//    public static int i = 0;
//
//    public static TreeNode createTree(String str) {
//        TreeNode root = null;
//        if (str.charAt(i) != '#') {
//            root = new TreeNode(str.charAt(i));
//            i++;
//            root.left = createTree(str);
//            root.right = createTree(str);
//        } else {
//            i++;
//        }
//        return root;
//    }
//
//    public static void inorder(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        inorder(root.left);
//        System.out.print(root.val + " ");
//        inorder(root.right);
//    }
//}