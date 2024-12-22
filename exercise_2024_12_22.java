
// leetcode 104. 二叉树的最大深度
//class Solution {
//    public int maxDepth(TreeNode root) {
//        if (root == null) return 0;
//        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
//    }
//}


// leetcode 226. 翻转二叉树
//class Solution {
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;
//        TreeNode tmp = root.left;
//        root.left = root.right;
//        root.right = tmp;
//        invertTree(root.left);
//        invertTree(root.right);
//        return root;
//
//    }
//}

// leetcode 101. 对称二叉树
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) return true;
//        return isSymmetric(root.left, root.right);
//    }
//
//    public boolean isSymmetric(TreeNode p, TreeNode q) {
//        // 值相同
//        // 结构相同
//        if (p == null && q == null) return true;
//        if (p != null && q == null || p == null && q != null) return false;
//        if (p.val != q.val) return false;
//        return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
//    }
//}

// leetcode 543. 二叉树的直径
//class Solution {
//    int maxCount = 0;
//
//    public int diameterOfBinaryTree(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        // 直径可以看作是从根开始，左子树和右子树向下遍历的高度+1
//        // 比如例子：从 1 开始，左子树走到 2 4，右子树走到 3
//        // 所以直径 = 左子树高度 + 右子树高度 + 1(根节点本身) - 1(求的是边/度)
//        getHeight(root);
//        return maxCount - 1;
//    }
//
//    public int getHeight(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int left = getHeight(root.left);
//        int right = getHeight(root.right);
//        int len = Math.max(left, right) + 1;
//        maxCount = Math.max(maxCount, left + right + 1);
//        return len;
//    }
//}


// leetcode 102. 二叉树的层序遍历
//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> ret = new ArrayList<>();
//        if (root == null) return ret;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> tmp = new ArrayList<>();
//            while (size != 0) {
//                TreeNode node = queue.poll();
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//                tmp.add(node.val);
//                size--;
//            }
//            ret.add(tmp);
//        }
//        return ret;
//
//    }
//}

// leetcode 108. 将有序数组转换为二叉搜索树
//class Solution {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        // 数组升序, 所以每次都选择中间位置作为根节点
//        // root.left = 根节点左边位置区间
//        // root.right = 根节点右边位置区间
//        return merge(nums, 0, nums.length - 1);
//    }
//
//    public TreeNode merge(int[] nums, int left, int right) {
//        if (left > right) return null;
//        int mid = (left + right) / 2;
//        TreeNode root = new TreeNode(nums[mid]);
//        root.left = merge(nums, left, mid - 1);
//        root.right = merge(nums, mid + 1, right);
//        return root;
//    }
//}