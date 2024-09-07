
// leetcode LCR 149. 彩灯装饰记录 I
//class Solution {
//    public int[] decorateRecord(TreeNode root) {
//        if (root == null) return new int[0];
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        List<Integer> arr = new ArrayList<>();
//        while (!queue.isEmpty()) {
//            TreeNode top = queue.poll();
//            arr.add(top.val);
//            if (top.left != null) {
//                queue.offer(top.left);
//            }
//            if (top.right != null) {
//                queue.offer(top.right);
//            }
//        }
//        int[] ret = new int[arr.size()];
//        for (int i = 0; i < ret.length; i++) {
//            ret[i] = arr.get(i);
//        }
//        return ret;
//    }
//}


// leetcode LCR 150. 彩灯装饰记录 II
//class Solution {
//    public List<List<Integer>> decorateRecord(TreeNode root) {
//        List<List<Integer>> ret = new ArrayList<>();
//        if (root == null) return ret;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            List<Integer> arr = new ArrayList<>();
//            int size = queue.size();
//            while (size != 0) {
//                TreeNode top = queue.poll();
//                arr.add(top.val);
//                if (top.left != null) {
//                    queue.offer(top.left);
//                }
//                if (top.right != null) {
//                    queue.offer(top.right);
//                }
//                size--;
//            }
//            ret.add(arr);
//        }
//
//        return ret;
//    }
//}