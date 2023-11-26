
// 牛客网 DP34 【模板】前缀和
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int q = in.nextInt();
//            long[] arr = new long[n + 1];
//            long[] dp = new long[n + 1];
//            for (int i = 1; i <= n; i++) {
//                arr[i] = in.nextInt();
//                dp[i] = dp[i - 1] + arr[i];
//            }
//            for (int i = 0; i < q; i++) {
//                int left = in.nextInt();
//                int right = in.nextInt();
//                long ret = dp[right] - dp[left - 1];
//                System.out.println(ret);
//            }
//        }
//    }
//}


// 牛客网 DP35 【模板】二维前缀和
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int m = in.nextInt();
//            int q = in.nextInt();
//            int[][] arr = new int[n + 1][m + 1];
//            long[][] dp = new long[n + 1][m + 1];
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= m; j++) {
//                    arr[i][j] = in.nextInt();
//                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] + arr[i][j] - dp[i - 1][j - 1];
//                }
//            }
//
//            for (int i = 0; i < q; i++) {
//                int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
//                System.out.println(dp[x2][y2] - dp[x1 - 1][y2] - dp[x2][y1 - 1] + dp[x1 - 1][y1 - 1]);
//            }
//        }
//    }
//}