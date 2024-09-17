
// leetcode LCR 161. 连续天数的最高销售额
//class Solution {
//    public int maxSales(int[] sales) {
//        // dp[i] 表示以 i 下标结尾的天数的最大和
//        int[] dp = new int[sales.length];
//        dp[0] = sales[0];
//        for (int i = 1; i < dp.length; i++) {
//            dp[i] = Math.max(dp[i - 1] + sales[i], sales[i]);
//        }
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < dp.length; i++) {
//            if (dp[i] > max) {
//                max = dp[i];
//            }
//        }
//        return max;
//    }
//}


// leetcode LCR 165. 解密数字
//class Solution {
//    public int crackNumber(int ciphertext) {
//        String str = String.valueOf(ciphertext);
//        int[] dp = new int[str.length() + 1];
//        // dp[i] 表示以第 i 个字符结尾的解密方案数量
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i < dp.length; i++) {
//            // 如果 str[i-1] 存在, 则可以组合 str[i-1]str[i]
//            dp[i] = dp[i - 1];
//            String tmp = str.substring(i - 2, i);
//            if (tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0) {
//                dp[i] += dp[i - 2];
//            }
//
//        }
//        return dp[str.length()];
//    }
//}
//class Solution {
//    public int crackNumber(int ciphertext) {
//        String str = String.valueOf(ciphertext);
//        // int[] dp = new int[str.length() + 1];
//        // dp[i] 表示以第 i 个字符结尾的解密方案数量
//        int a = 1, b = 1, c = 1;
//        int len = str.length();
//        int i = 2;
//        while (i <= len) {
//            c = b;
//            // 如果 str[i - 2] 存在, 则可以组合 str[i - 2]str[i - 1]
//            String tmp = str.substring(i - 2, i);
//            if (tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0) {
//                c += a;
//            }
//            a = b;
//            b = c;
//            i++;
//        }
//        return c;
//    }
//}