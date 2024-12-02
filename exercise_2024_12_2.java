
// leetcode 117. 填充每个节点的下一个右侧节点指针 II
//class Solution {
//    public Node connect(Node root) {
//        if (root == null) return null;
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Node> arr = new LinkedList<>();
//            while (size != 0) {
//                Node cur = queue.poll();
//                if (cur.left != null) {
//                    queue.offer(cur.left);
//                }
//                if (cur.right != null) {
//                    queue.offer(cur.right);
//                }
//                arr.add(cur);
//                size--;
//            }
//            for (int i = 0; i < arr.size() - 1; i++) {
//                Node cur = arr.get(i);
//                cur.next = arr.get(i + 1);
//            }
//
//        }
//        return root;
//
//    }
//}