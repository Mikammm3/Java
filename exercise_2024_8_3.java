

// 牛客网 最长上升子序列
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
//
//            print(n, arr);
//        }
//    }
//
//
//    public static void print(int n, int[] arr) {
//        // dp[i] 就是数组 arr 中以 i 下标结尾的最长上升子序列的长度
//        int[] dp = new int[n];
//        // 初始化
//        for (int i = 0; i < arr.length; i++) {
//            dp[i] = 1;
//        }
//
//
//        for (int i = 1; i < dp.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] < arr[i]) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//            }
//        }
//        int max = 1;
//        for (int i = 0; i < dp.length; i++) {
//            if (dp[i] > max) {
//                max = dp[i];
//            }
//        }
//        System.out.println(max);
//    }
//}




