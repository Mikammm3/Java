

// 牛客网 蘑菇阵
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int m = in.nextInt();
//            int k = in.nextInt();
//
//            // 记录蘑菇位置
//            boolean[][] flg = new boolean[n + 1][m + 1];
//            for (int i = 0; i < k; i++) {
//                int x = in.nextInt();
//                int y = in.nextInt();
//                flg[x][y] = true;
//            }
//
//            // dp[i][j] 表示从 (1,1) 走到 (i,j) 的不遇到蘑菇概率
//            double[][] dp = new double[n + 1][m + 1];
//            dp[1][1] = 1.0;
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= m; j++) {
//                    if (i == 1 && j == 1) continue;
//                    // 是蘑菇
//                    if (flg[i][j]) {
//                        dp[i][j] = 0;
//                    } else {
//                        // 从上边来，如果不是边界，则往下走的概率要乘 0.5
//                        double up = dp[i - 1][j] * (j == m ? 1 : 0.5);
//                        // 从左边来，如果不是边界，则往右走的概率要乘 0.5
//                        double left = dp[i][j - 1] * (i == n ? 1 : 0.5);
//                        dp[i][j] = up + left;
//                        ;
//                    }
//                }
//            }
//
//            System.out.printf("%.02f\n", dp[n][m]);
//        }
//    }
//}