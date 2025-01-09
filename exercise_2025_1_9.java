

// leetcode 994. 腐烂的橘子
//class Solution {
//
//    public int orangesRotting(int[][] grid) {
//        // 先遍历数组获取腐烂橘子个数 和 新鲜橘子个数
//        int freshCount = getFresh(grid);
//        int min = 0;
//        int m = grid.length, n = grid[0].length;
//        int oldFresh = 0;
//        while (freshCount > 0) {
//            if (oldFresh == freshCount)
//                return -1;
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (grid[i][j] == 2) {
//                        dfs(grid, i, j, m, n);
//                    }
//
//                }
//
//            }
//            int count = flash(grid);
//            oldFresh = freshCount;
//            freshCount -= count;
//            min++;
//
//        }
//        return min;
//    }
//
//    public void dfs(int[][] grid, int i, int j, int m, int n) {
//        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0)
//            return;
//        if (grid[i][j] == 2) {
//            isFresh(grid, i - 1, j, m, n);
//            isFresh(grid, i + 1, j, m, n);
//            isFresh(grid, i, j - 1, m, n);
//            isFresh(grid, i, j + 1, m, n);
//        }
//    }
//
//    public boolean isFresh(int[][] grid, int i, int j, int m, int n) {
//        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0 || grid[i][j] == 2)
//            return false;
//        grid[i][j] = -2;
//        return true;
//    }
//
//    public int flash(int[][] grid) {
//        int count = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == -2) {
//                    grid[i][j] = 2;
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    public int getFresh(int[][] grid) {
//        int count = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 1) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}