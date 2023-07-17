import com.sun.org.apache.bcel.internal.generic.LNEG;

public class BinarySearchTree {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode root = null;

    public boolean search(int val) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val < val) {
                cur = cur.right;
            } else if (cur.val > val) {
                cur = cur.left;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean insert(int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) {
            root = node;
        }
        TreeNode cur = root;
        TreeNode parent = null;
        while (cur != null) {
            parent = cur;
            if (cur.val < val) {
                cur = cur.right;
            } else if (cur.val > val) {
                cur = cur.left;
            } else {
                return false;
            }
        }
        if (parent.val < val) {
            parent.right = node;
        } else {
            parent.left = node;
        }
        return true;
    }


}


class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (arr[ch - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
