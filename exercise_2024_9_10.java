
// leetcode LCR 174. 寻找二叉搜索树中的目标节点
//class Solution {
//    public int findTargetNode(TreeNode root, int cnt) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        getKMax(root, cnt, queue);
//        return queue.peek();
//    }
//
//    public int i;
//
//    public void getKMax(TreeNode root, int cnt, PriorityQueue<Integer> queue) {
//        if (root == null) return;
//        if (i < cnt) {
//            queue.offer(root.val);
//        } else {
//            int top = queue.peek();
//            int val = root.val;
//            if (val > top) {
//                queue.poll();
//                queue.offer(val);
//            }
//        }
//        i++;
//        getKMax(root.left, cnt, queue);
//        getKMax(root.right, cnt, queue);
//    }
//}
//class Solution {
//    public int findTargetNode(TreeNode root, int cnt) {
//        getMax(root, cnt);
//        return kMax;
//    }
//
//    public int i = 1;
//    public int kMax = 0;
//
//    public void getMax(TreeNode root, int cnt) {
//        if (root == null) return;
//        // 中序:  左根右
//        // 反着来:右根左
//        getMax(root.right, cnt);
//        if (i == cnt) {
//            kMax = root.val;
//        }
//        if (i > cnt) return;
//        i++;
//        getMax(root.left, cnt);
//
//    }
//}


// leetcode LCR 156. 序列化与反序列化二叉树
//public class Codec {
//
//    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//        if (root == null) return "[]";
//        // 可以利用层序遍历实现
//        Queue<TreeNode> queue = new LinkedList<>();
//        StringBuilder str = new StringBuilder("[");
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            TreeNode top = queue.poll();
//            if (top != null) {
//                str.append(top.val + ",");
//                queue.offer(top.left);
//                queue.offer(top.right);
//            } else str.append("null,");
//
//        }
//        str.deleteCharAt(str.length() - 1);
//        str.append("]");
//        return str.toString();
//
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        if (data.equals("[]")) {
//            return null;
//        }
//        // 点号分隔，那就是每个节点 [1,2,3,null,null,4,5,null,null]
//
//        String[] arr = data.substring(1, data.length() - 1).split(",");
//        TreeNode root = new TreeNode(Integer.valueOf(arr[0]));
//        // 用层序遍历的方式解析
//        // 从 0 下标开始编号，如果该节点不为空，则:
//        // 左子树 2*i + 1
//        // 右子树 2*i + 2
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        int i = 0;
//        while (!queue.isEmpty()) {
//            TreeNode top = queue.poll();
//            if (top != null) {
//                if (2 * i + 1 < arr.length && !arr[2 * i + 1].equals("null")) {
//                    TreeNode left = new TreeNode(Integer.valueOf(arr[2 * i + 1]));
//                    queue.offer(left);
//                    top.left = left;
//                }
//                if (2 * i + 2 < arr.length && !arr[2 * i + 2].equals("null")) {
//                    TreeNode right = new TreeNode(Integer.valueOf(arr[2 * i + 2]));
//                    queue.offer(right);
//                    top.right = right;
//                }
//            }
//            // 是 null 就跳过
//            i++;
//
//        }
//        return root;
//    }
//}