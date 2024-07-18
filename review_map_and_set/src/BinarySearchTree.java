

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

}
