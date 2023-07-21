import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BinaryTree {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    public TreeNode root;//根节点

    //前序遍历 根左右
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    //将前序遍历的结果存储到list当中
    public List<TreeNode> preOrder2(TreeNode root) {
        List<TreeNode> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        ret.add(root);
        //System.out.print(root.val + " ");
        List<TreeNode> left = preOrder2(root.left);
        ret.addAll(left);
        List<TreeNode> right = preOrder2(root.right);
        ret.addAll(right);
        return ret;
    }


    //中序遍历 左根右
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //后序遍历 左右根
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }


    //获取结点个数
    //思路1：使用前中后序遍历二叉树，
    //遇到不为空的结点就计数器++
    //思路2：总结点数 = 左子树结点个数 + 右子树结点个数 + 1
    public int nodeSize(TreeNode root) {
        int count = 0;
        if (root == null) {
            return count;
        }
        count++;
        int left = nodeSize(root.left);
        count += left;
        int right = nodeSize(root.right);
        count += right;
        return count;
    }


    public int nodeSize2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + nodeSize2(root.left) + nodeSize2(root.right);
    }


    //获取叶子结点个数
    //叶子结点：左边为空&&右边为空
    //root左树的叶子 + root右树的叶子 = 整棵树的叶子
    public int getLeafSize(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return ((root.left == null && root.right == null) ? 1 : 0) + getLeafSize(root.left) + getLeafSize(root.right);
    }

    //获取第K层结点个数
    //思路：root这棵树的第k层 = root.left第k-1层 + root.right第k-1层
    public int getKLevelNodeCount(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        //root不为空说明结点存在所以返回1，k最低为第一层
        if (k == 1) {
            return 1;
        }
        return getKLevelNodeCount(root.left, k - 1)
                + getKLevelNodeCount(root.right, k - 1);
    }


    //获取树的高度
    //思路：整棵树的高度 = MAX(左树的高度,右树的高度) + 1
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }


    //检测值为key的元素是否存在,相当于遍历二叉树
    public boolean find(TreeNode root, char key) {
        if (root == null) {
            return false;
        }
        if (root.val == key) {
            return true;
        }
        boolean left = find(root.left, key);
        if (left == true) {
            return true;
        }

        boolean right = find(root.right, key);
        if (right == true) {
            return true;
        }
        return false;
    }

    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }


}

//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        //结构不同
//        if (p == null && q != null || p != null && q == null) {
//            return false;
//        }
//        if (p == null && q == null) {
//            return true;
//        }
//        //值不同
//        if (p.val != q.val) {
//            return false;
//        }
//        //左树和右树都得相同
//        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//    }
//}


