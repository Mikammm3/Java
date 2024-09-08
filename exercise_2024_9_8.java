
// leetcode LCR 151. 彩灯装饰记录 III
//class Solution {
//    public List<List<Integer>> decorateRecord(TreeNode root) {
//        List<List<Integer>> ret = new ArrayList<>();
//        if (root == null) return ret;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        boolean flg = true;
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> arr = new ArrayList<>();
//            while (size != 0) {
//                TreeNode top = queue.poll();
//                arr.add(top.val);
//
//                if (top.left != null) {
//                    queue.add(top.left);
//                }
//                if (top.right != null) {
//                    queue.add(top.right);
//                }
//                size--;
//            }
//            if (!flg) {
//                Collections.reverse(arr);
//            }
//            flg = !flg;
//            ret.add(arr);
//        }
//        return ret;
//    }
//}


// leetcode LCR 152. 验证二叉搜索树的后序遍历序列
//class Solution {
//    public boolean verifyTreeOrder(int[] postorder) {
//        return verifyTreeOrder(postorder, 0, postorder.length - 1);
//    }
//
//    public boolean verifyTreeOrder(int[] postorder, int start, int end) {
//        if (start >= end) return true;
//        // 以 end 为根节点，划分左子树和右子树
//        int root = postorder[end];
//        // 往后找大于 root 的值, 找到第一个右子树节点
//        int cur = start;
//        while (postorder[cur] < postorder[end]) cur++;
//        // 此时 postorder[cur] 一定大于 root
//        int mid = cur;
//        // mid, end 就是右子树范围
//        while (postorder[cur] > postorder[end]) cur++;
//        // 到这里，start, mid - 1 是左子树,  m,end - 1 是右子树
//        return cur == end && verifyTreeOrder(postorder, start, mid - 1) && verifyTreeOrder(postorder, mid, end - 1);
//    }
//}