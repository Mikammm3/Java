

// leetcode LCR 137. 模糊搜索验证
//class Solution {
//    public boolean articleMatch(String a, String b) {
//        // 用动态规划来做，dp[i][j] 代表在 a 中以 i 个字符结尾的字符串与在 b 中第 j 个字符结尾的字符串是否匹配
//        int len1 = a.length();
//        int len2 = b.length();
//        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
//        // 初始化
//        dp[0][0] = true;
//        char[] arr1 = a.toCharArray();
//        char[] arr2 = b.toCharArray();
//        for (int i = 0; i <= len1; i++) {
//            for (int j = 1; j <= len2; j++) {
//                if (arr2[j - 1] == '*') {
//                    dp[i][j] = dp[i][j - 2];
//                    if (i > 0) {
//                        if (charMatch(arr1[i - 1], arr2[j - 2])) {
//                            dp[i][j] = dp[i][j] || dp[i - 1][j];
//                        }
//                    }
//                } else {
//                    if (i > 0 && charMatch(arr1[i - 1], arr2[j - 1])) {
//                        dp[i][j] = dp[i - 1][j - 1];
//                    }
//                }
//
//            }
//        }
//        return dp[len1][len2];
//    }
//
//    public boolean charMatch(char a, char b) {
//        if (a == '*' || b == '*' || a == '.' || b == '.') return true;
//        return a == b;
//    }
//}


// leetcode LCR 127. 跳跃训练
//class Solution {
//    public int trainWays(int num) {
//        if (num < 2) return 1;
//        int[] dp = new int[num + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i <= num; i++) {
//            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
//        }
//        return dp[num];
//    }
//}