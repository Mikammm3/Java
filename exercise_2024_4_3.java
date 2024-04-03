
// 牛客网 WY18 统计回文
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String a = in.nextLine();
//            String b = in.nextLine();
//            int count = getCount(a, b);
//            System.out.println(count);
//        }
//    }
//
//    public static int getCount(String a, String b) {
//        int count = 0, len = a.length();
//        // 最前面
//        if (isString(b + a)) {
//            count++;
//        }
//        // 最后面
//        if (isString(a + b)) {
//            count++;
//        }
//
//
//        // 在中间
//        for (int i = 1; i < len; i++) {
//            // 前部分
//            String tmp = a.substring(0, i);
//            tmp += b;
//            // 后部分
//            String cur = a.substring(i);
//            tmp += cur;
//            // 判断是否是回文字符串
//            if (isString(tmp)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // 判断是否为回文字符串
//    public static boolean isString(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//        while (left < right) {
//            if (str.charAt(left) == str.charAt(right)) {
//                left++;
//                right--;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//}


// 牛客网 DD1 连续最大和
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = in.nextInt();
//            }
//            long sum = getMaxSum(arr, n);
//            System.out.println(sum);
//        }
//    }
//
//    public static long getMaxSum(int[] arr, int n) {
//        long[] dp = new long[n + 1];
//        dp[0] = arr[0];
//        long maxSum = arr[0];
//        for (int i = 1; i < n; i++) {
//            dp[i] = dp[i - 1] + arr[i]  > arr[i] ?  dp[i - 1] + arr[i] : arr[i];
//            // 比较
//            if (dp[i] > maxSum) maxSum = dp[i];
//        }
//
//        return maxSum;
//    }
//}