

public class BinarySearchTree {

    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public TreeNode root;// 根节点


    public boolean search(int key) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val > key) {
                // 目标值小于 cur 的值，往右边走
                cur = cur.left;
            } else if (cur.val < key) {
                // 目标值大于 cur 的值，往右边走
                cur = cur.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean insert(int val) {
        // node 一定是插入到叶子节点的孩子节点
        TreeNode node = new TreeNode(val);
        if (root == null) {
            // 空树
            root = node;
            return true;
        }
        TreeNode cur = root;
        TreeNode prev = null;// 指向 cur 的父亲节点
        // cur 找插入位置
        while (cur != null) {
            if (node.val > cur.val) {
                prev = cur;
                cur = cur.right;
            } else if (node.val < cur.val) {
                prev = cur;
                cur = cur.left;
            } else {
                // 二叉搜索树本身是不能存在相同的数据的
                return false;
            }
        }
        // 此时 cur 为空，比较 prev 和 node
        if (node.val > prev.val) {
            prev.right = node;
        } else {
            prev.left = node;
        }
        return true;
    }

}
