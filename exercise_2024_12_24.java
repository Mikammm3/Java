
// leetcode 124. 二叉树中的最大路径和
//class Solution {
//    public int maxPathSum(TreeNode root) {
//        getMaxSum(root);
//        return max;
//    }
//
//    int max = Integer.MIN_VALUE;
//
//    // 求当前节点为根节点这条路径的和，的最大值
//    public int getMaxSum(TreeNode root) {
//        if (root == null)
//            return 0;
//        // root 到叶子节点的路径最大值为 root.val + max(左子树路径最大值，右子树路径最大值)
//        // 只有 路径值 > 0 的时候才能相加，不然不能加
//        int rootSum = root.val;
//        int leftSum = Math.max(getMaxSum(root.left), 0);
//        int rightSum = Math.max(getMaxSum(root.right), 0);
//        // 总路径 = 根左 + 根 + 根右
//        max = Math.max(rootSum + leftSum + rightSum, max);
//        return rootSum + Math.max(leftSum, rightSum);
//    }
//}


// leetcode 200. 岛屿数量
//class Solution {
//    public int numIslands(char[][] grid) {
//        int n = grid.length;
//        int m = grid[0].length;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (grid[i][j] == '1') {
//                    count++;
//                    // 遇到了土地，就把这块土地附近的土地都标记为点
//                    dfs(grid, i, j, n, m);
//                }
//            }
//        }
//        return count;
//    }
//
//    public void dfs(char[][] grid, int i, int j, int n, int m) {
//        if (i < 0 || i >= n || j < 0 || j >= m) {
//            return;
//        }
//        if (grid[i][j] == '1') {
//            grid[i][j] = '.';
//            // 上下左右
//            dfs(grid, i - 1, j, n, m);
//            dfs(grid, i + 1, j, n, m);
//            dfs(grid, i, j - 1, n, m);
//            dfs(grid, i, j + 1, n, m);
//        }
//    }
//}