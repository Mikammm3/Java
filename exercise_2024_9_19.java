
// leetcode LCR 129. 字母迷宫
//class Solution {
//    public boolean wordPuzzle(char[][] grid, String target) {
//        int row = grid.length;
//        int col = grid[0].length;
//        char[] arr = target.toCharArray();
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                boolean[][] flg = new boolean[row][col];
//                if (dfs(grid, flg, i, j, row, col, arr, 0)) {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
//
//    public boolean dfs(char[][] arr, boolean[][] flg, int i, int j, int row, int col, char[] target, int k) {
//        if (i < 0 || i >= row || j < 0 || j >= col || flg[i][j] || arr[i][j] != target[k]) {
//            return false;
//        }
//        flg[i][j] = true;
//        if (k == target.length - 1) {
//            return true;
//        }
//        boolean ans = dfs(arr, flg, i - 1, j, row, col, target, k + 1)
//                || dfs(arr, flg, i + 1, j, row, col, target, k + 1)
//                || dfs(arr, flg, i, j - 1, row, col, target, k + 1)
//                || dfs(arr, flg, i, j + 1, row, col, target, k + 1);
//        flg[i][j] = false;
//        return ans;
//    }
//}


// leetcode 
//class Solution {
//    public int iceBreakingGame(int num, int target) {
//        // 用动态规划
//        // dp[i] = (dp[i - 1] + target) % num
//        // dp[i] 表示以 i 个成员约瑟夫环最后剩下的成员编号
//        int dp = 0;
//        for (int i = 2; i < num + 1; i++) {
//            dp = (dp + target) % i;
//        }
//        return dp;
//    }
//}