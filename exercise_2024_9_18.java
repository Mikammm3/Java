
// leetcode LCR 166. 珠宝的最高价值
//class Solution {
//    public int jewelleryValue(int[][] frame) {
//        int row = frame.length;
//        int col = frame[0].length;
//        int[][] dp = new int[row][col];
//        dp[0][0] = frame[0][0];
//        // dp[i][j] 代表到 i，j 的最大珠宝值
//        // 1 3 1
//        // 1 5 1
//        // 4 2 1
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                dp[i][j] = frame[i][j];
//                if (i - 1 >= 0) {
//                    dp[i][j] = dp[i - 1][j] + frame[i][j];
//                }
//                if (j - 1 >= 0) {
//                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + frame[i][j]);
//                }
//
//            }
//        }
//        return dp[row - 1][col - 1];
//    }
//}


// leetcode 
//class Solution {
//    public double[] statisticsProbability(int num) {
//        // prev 表示 n - 1 个筛子点数
//        double[] prev = {1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d};
//        for (int i = 2; i <= num; i++) {
//            double[] cur = new double[5 * i + 1];
//            // [n, 6n] -> 5*n + 1
//            for (int j = 0; j < prev.length; j++) {
//                for (int k = 0; k < 6; k++) {
//                    cur[k + j] += prev[j] * 1 / 6;
//                }
//            }
//            prev = cur;
//        }
//        return prev;
//    }
//}