

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


    // 删除
    public void remove(int val) {
        // 先找到要删除的节点
        TreeNode cur = root;
        TreeNode parent = null;
        while (cur != null) {
            if (val > cur.val) {
                parent = cur;
                cur = cur.right;
            } else if (val < cur.val) {
                parent = cur;
                cur = cur.left;
            } else {
                // 找到了，删除对应节点
                removeNode(parent, cur);
                return;
            }
        }
    }

    private void removeNode(TreeNode parent, TreeNode cur) {
        if (cur.left == null) {
            if (cur == root) {
                // cur 为根节点
                root = cur.right;
            } else if (cur == parent.left) {
                // cur 是 parent 的左孩子
                parent.left = cur.right;
            } else {
                // cur 是 parent 的右孩子
                parent.right = cur.right;
            }

        } else if (cur.right == null) {
            if (root == cur) {
                // cur 为根节点
                root = cur.left;
            } else if (cur == parent.left) {
                // 左孩子
                parent.left = cur.left;
            } else {
                // 右孩子
                parent.right = cur.left;
            }

        } else {
            // 找 cur.left 的最后一个右孩子
            TreeNode target = cur.left;// 替罪羊
            TreeNode targetParent = cur;
            while (target.right != null) {
                targetParent = target;
                target = target.right;
            }
            // 找到了 target，赋值
            cur.val = target.val;
            // 删除 target
            if (target == targetParent.right) {
                // 有右孩子
                targetParent.right = target.left;
            } else {
                // 没有右孩子
                targetParent.left = target.left;
            }
        }
    }
}
