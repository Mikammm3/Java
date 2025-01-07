
// leetcode 102. 二叉树的层序遍历
//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> ret = new ArrayList<>();
//        if (root == null) return ret;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            List<Integer> arr = new ArrayList<>();
//            int size = queue.size();
//            while (size != 0) {
//                TreeNode node = queue.poll();
//                arr.add(node.val);
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//                size--;
//            }
//            ret.add(arr);
//        }
//        return ret;
//    }
//}


// leetcode 108. 将有序数组转换为二叉搜索树
//class Solution {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        return sortedArrayToBST(nums, 0, nums.length - 1);
//    }
//
//    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
//        if (left > right) return null;
//        int mid = (left + right) / 2;
//        TreeNode root = new TreeNode(nums[mid]);
//        root.left = sortedArrayToBST(nums, left, mid - 1);
//        root.right = sortedArrayToBST(nums, mid + 1, right);
//        return root;
//    }
//}


// leetcode 98. 验证二叉搜索树
//class Solution {
//    TreeNode lastNode;
//
//    public boolean isValidBST(TreeNode root) {
//        // 二叉搜索树中序遍历是有序的
//        if (root == null) return true;
//        boolean leftTree = isValidBST(root.left);
//        if (lastNode != null) {
//            if (root.val <= lastNode.val) {
//                return false;
//            }
//        }
//        lastNode = root;
//
//        boolean rightTree = isValidBST(root.right);
//        return leftTree && rightTree;
//    }
//}


// leetcode 230. 二叉搜索树中第 K 小的元素
//class Solution {
//    int cnt = 0;
//    int ret = 0;
//
//    public int kthSmallest(TreeNode root, int k) {
//        if (root == null) return -1;
//        inorder(root, k);
//        return ret;
//    }
//
//    public void inorder(TreeNode root, int k) {
//        if (root == null) return;
//        inorder(root.left, k);
//        cnt++;
//        if (cnt == k) ret = root.val;
//        inorder(root.right, k);
//    }
//}


// leetcode 199. 二叉树的右视图
//class Solution {
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> ret = new ArrayList<>();
//        if(root == null) return ret;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//            while(size != 0) {
//                TreeNode node = queue.poll();
//                if(node.left != null) {
//                    queue.offer(node.left);
//                }
//                if(node.right != null) {
//                    queue.offer(node.right);
//                }
//                if(size == 1) {
//                    ret.add(node.val);
//                }
//                size--;
//            }
//        }
//
//        return ret;
//    }
//}


// leetcode 114. 二叉树展开为链表
//class Solution {
//    TreeNode lastNode;
//
//    public void flatten(TreeNode root) {
//        if (root == null) return;
//        prevOrder(root);
//    }
//
//    public TreeNode prevOrder(TreeNode root) {
//        if (root == null) return null;
//        TreeNode left = root.left;
//        TreeNode right = root.right;
//        root.left = null;
//        root.right = prevOrder(left);
//        if (root.right != null) {
//            // 让左子树链表的最后一个节点连接上右子树链表
//            lastNode.right = prevOrder(right);
//        } else {
//            // 此时说明是左子树链表的最后一个节点(右节点)
//            lastNode = root;
//            root.right = prevOrder(right);
//        }
//
//        return root;
//    }
//}

// leetcode 105. 从前序与中序遍历序列构造二叉树
//class Solution {
//    int prevIndex;
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        return buildTree(preorder, inorder, 0, preorder.length - 1);
//    }
//
//    public TreeNode buildTree(int[] preorder, int[] inorder, int left, int right) {
//        if (left > right) return null;
//        TreeNode root = new TreeNode(preorder[prevIndex]);
//        int rootIndex = getRootIndex(inorder, left, right, root.val);
//        prevIndex++;
//        if (rootIndex == -1) {
//            return null;
//        }
//        root.left = buildTree(preorder, inorder, left, rootIndex - 1);
//        root.right = buildTree(preorder, inorder, rootIndex + 1, right);
//        return root;
//    }
//
//
//    public int getRootIndex(int[] inorder, int left, int right, int target) {
//        for (int i = left; i <= right; i++) {
//            if (inorder[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}


// leetcode 437. 路径总和 III
//class Solution {
//    // int count;
//    public int pathSum(TreeNode root, int targetSum) {
//        if (root == null) return 0;
//        return getPathSum(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
//    }
//
//    public int getPathSum(TreeNode root, long targetSum) {
//        if (root == null) return 0;
//        int count = 0;
//        long val = root.val;
//        if (targetSum == val) {
//            count++;
//        }
//        count += getPathSum(root.left, targetSum - val);
//        count += getPathSum(root.right, targetSum - val);
//        return count;
//    }
//}


// leetcode 236. 二叉树的最近公共祖先
//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null) return null;
//        if (root == p || root == q) return root;
//        TreeNode leftTree = lowestCommonAncestor(root.left, p, q);
//        TreeNode rightTree = lowestCommonAncestor(root.right, p, q);
//        if (leftTree != null && rightTree != null) {
//            return root;
//        } else if (leftTree != null) {
//            return leftTree;
//        } else {
//            return rightTree;
//        }
//    }
//}


// leetcode 124. 二叉树中的最大路径和
//class Solution {
//
//    int maxSum = Integer.MIN_VALUE;
//
//    public int maxPathSum(TreeNode root) {
//        if (root == null) return 0;
//        getMaxSum(root);
//        return maxSum;
//    }
//
//    public int getMaxSum(TreeNode root) {
//        if (root == null) return 0;
//        int val = root.val;
//        int leftTree = Math.max(0, getMaxSum(root.left));
//        int rightTree = Math.max(0, getMaxSum(root.right));
//        maxSum = Math.max(maxSum, val + leftTree + rightTree);
//        return Math.max(leftTree, rightTree) + val;
//    }
//}