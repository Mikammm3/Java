


public class BinarySearchTree {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode root;//根节点

    public boolean search(int key) {
        TreeNode cur = root;
        //遍历二叉树来找key
        while (cur != null) {
            if (cur.val < key) {
                cur = cur.right;
            } else if (cur.val > key) {
                cur = cur.left;
            } else {
                return true;
            }
        }
        return false;
    }

    //往合适的位置插入元素
    public boolean insert(int val) {
        //node 一定是插入到叶子节点的孩子节点
        TreeNode node = new TreeNode(val);
        //空树
        if (root == null) {
            root = node;
            return true;
        }
        //用cur遍历二叉树
        TreeNode cur = root;
        //用parent来记录cur的父亲节点
        TreeNode parent = null;
        while (cur != null) {
            parent = cur;
            if (cur.val < val) {
                //说明val应该在cur的右边
                cur = cur.right;
            } else if (cur.val > val) {
                //说明val应该在cur的左边
                cur = cur.left;
            } else {
                //二叉搜索树本身是不能存在相同的数据的
                return false;
            }
        }
        //到这里说明cur为null
        if (parent.val > val) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return true;
    }

    //删除
    public void remove(int val) {
        //cur为要删除的元素
        TreeNode cur = root;
        //parent为cur的父亲节点
        TreeNode parent = null;
        //1.首先找到你要删除的元素
        while (cur != null) {
            parent = cur;
            if (cur.val > val) {
                cur = cur.left;
            } else if (cur.val < val) {
                cur = cur.right;
            } else {
                //2.删除
                removeNode(parent, cur);
                return;
            }
        }
    }

    private void removeNode(TreeNode parent, TreeNode cur) {
        if (cur.left == null) {
            if (cur == root) {
                root = cur.right;
            } else if (cur == parent.left) {
                parent.left = cur.right;
            } else {
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } else if (cur == parent.left) {
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }

        } else {
            //1.找到替罪羊:cur右子树最左边的那个节点
            TreeNode targetParent = cur;
            TreeNode target = cur.right;//替罪羊
            while (target.left != null) {
                //tp更新
                targetParent = target;
                target = target.left;
            }
            //2.将替罪羊的值赋给cur
            cur.val = target.val;
            //3.删除替罪羊
            // 根据t在tp位置的不同，分两种情况
            if (target == targetParent.left) {
                //t在tp左边
                targetParent.left = target.right;
            } else {
                //t在tp右边
                targetParent.right = target.right;
            }
        }
    }
}
