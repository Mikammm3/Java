
// leetcode LCR 153. 二叉树中和为目标值的路径
//class Solution {
//
//    public List<List<Integer>> pathTarget(TreeNode root, int target) {
//        dfs(root, target);
//        return ret;
//
//    }
//
//    public int sum = 0;
//    public List<Integer> arr = new ArrayList<>();
//    public List<List<Integer>> ret = new ArrayList<>();
//
//    public void dfs(TreeNode root, int target) {
//        if (root == null) return;
//        arr.add(root.val);
//        sum += root.val;
//        if (sum == target && root.left == null && root.right == null) {
//            ret.add(new ArrayList<>(arr));
//            arr.remove(arr.size() - 1);
//            sum -= root.val;
//            return;
//        }
//
//        dfs(root.left, target);
//        dfs(root.right, target);
//        arr.remove(arr.size() - 1);
//        sum -= root.val;
//
//    }
//}


// leetcode LCR 155. 将二叉搜索树转化为排序的双向链表
//class Solution {
//    public Node treeToDoublyList(Node root) {
//        if (root == null) return null;
//        dfs(root);
//        // 最后 prev 一定就是尾巴节点
//        head.left = prev;
//        prev.right = head;
//        return head;
//    }
//
//    public Node prev = null;
//    public Node head = null;
//
//    // 中序遍历
//    public void dfs(Node cur) {
//        if (cur == null) return;
//        dfs(cur.left);
//        if (prev == null) {
//            head = cur;
//        } else {
//            prev.right = cur;
//        }
//        cur.left = prev;
//        // prev 往后走
//        prev = cur;
//        dfs(cur.right);
//    }
//}