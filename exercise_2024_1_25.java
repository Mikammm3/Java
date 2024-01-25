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
//            for (int i = 0; i < n; i++) arr[i] = in.nextInt();
//            print(n, arr);
//        }
//    }
//
//    public static void print(int n, int[] arr) {
//        int ans = 0;
//        for (int i = 0; i < n; i++) {
//            int cur = 1;
//            int max = arr[i]; // 1
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] > max) {
//                    cur++;
//                    max = arr[j];
//                }
//            }
//            if (cur > ans) ans = cur;
//        }
//        System.out.println(ans);
//    }
//}