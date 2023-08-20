
//LeetCode 107. 二叉树的层序遍历 II
//class Solution {
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> ret = new ArrayList<>();
//        if (root == null) {
//            return ret;
//        }
//        //使用队列
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> tmp = new ArrayList<>();
//            while (size != 0) {
//                TreeNode cur = queue.poll();
//                tmp.add(cur.val);
//                size--;
//                if (cur.left != null) {
//                    queue.offer(cur.left);
//                }
//                if (cur.right != null) {
//                    queue.offer(cur.right);
//                }
//            }
//            ret.add(tmp);
//        }
//        int left = 0;
//        int right = ret.size() - 1;
//        while (left < right) {
//            List<Integer> tmp = ret.get(left);
//            ret.set(left, ret.get(right));
//            ret.set(right, tmp);
//            left++;
//            right--;
//        }
//        return ret;
//    }
//}