

// 牛客网 合唱团
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = in.nextInt();
//            }
//            int k = in.nextInt();
//            int d = in.nextInt();
//            print(arr, k, d, n);
//        }
//    }
//
//
//    public static void print(int[] arr, int k, int d, int n) {
//        // 用动态规划来做
//        // dpMax[i][j] 就是取 j 个学生，并且最后一个学生是 arr[i - 1] 的乘积最大值
//        // dpMin[i][j] 就是取 j 个学生，并且最后一个学生是 arr[i - 1] 的乘积最小值
//        long[][] maxValue = new long[n + 1][k + 1];
//        long[][] minValue = new long[n + 1][k + 1];
//        // 初始化，如果 j == 1，则 dp[i][1] = 1
//        for (int i = 1; i <= n; i++) {
//            maxValue[i][1] = arr[i - 1];
//            minValue[i][1] = arr[i - 1];
//        }
//        // 用来记录最终结果
//        long ans = 0;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= k; j++) {
//                // i - d <= z <= i - 1
//                for (int z = (i - d > 0 ? i - d : 0); z <= i - 1; z++) {
//                    // 最大值可能是 最大正数*正数  最小负数*负数，自己本身
//                    maxValue[i][j] = Math.max(maxValue[z][j - 1] * arr[i - 1], maxValue[i][j]);
//                    maxValue[i][j] = Math.max(maxValue[i][j], minValue[z][j - 1] * arr[i - 1]);
//                    // 最小值可能是 最大正数*负数 最小正数*正数，自己本身
//                    minValue[i][j] = Math.min(minValue[z][j - 1] * arr[i - 1], minValue[i][j]);
//                    minValue[i][j] = Math.min(minValue[i][j], maxValue[z][j - 1] * arr[i - 1]);
//                }
//                if (j == k) {
//                    ans = Math.max(maxValue[i][j], ans);
//                }
//            }
//        }
//
//        System.out.println(ans);
//    }
//}