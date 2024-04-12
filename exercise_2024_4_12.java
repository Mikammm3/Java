
// 牛客网 HJ65 查找两个字符串a,b中的最长公共子串
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
//            String ret = "";
//            if (a.length() > b.length()) {
//                ret = getStr(b, a);
//            } else {
//                ret = getStr(a, b);
//            }
//            System.out.println(ret);
//
//        }
//    }
//
//    // 假设 a 是短串，b 为长串
//    public static String getStr(String a, String b) {
//        // 可以用动态规划来做
//        int la = a.length();
//        int lb = b.length();
//        // a 和 b 的最长公共子串长度
//        int maxLen = Integer.MIN_VALUE;
//        int ia = -1;
//        int ib = -1;
//        // 多初始化是为了避免越界
//        int[][] dp = new int[la + 1][lb + 1];
//        for (int i = 1; i <= la; i++) {
//            for (int j = 1; j <= lb; j++) {
//                char ca = a.charAt(i - 1);
//                char cb = b.charAt(j - 1);
//                // 如果 a 的 i 下标字符 和 b 的 j 下标字符相同，则更新
//                if (ca == cb) {
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                    // 更新 maxLen
//                    if (dp[i][j] > maxLen) {
//                        ia = i;
//                        ib = j;
//                        maxLen = dp[i][j];
//                    }
//                }
//            }
//        }
//
//        String ret = a.substring(ia - maxLen, ia);
//        return ret;
//    }
//}