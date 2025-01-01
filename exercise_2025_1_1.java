
// leetcode 322. 零钱兑换
//class Solution {
//    public int coinChange(int[] coins, int amount) {
//        // 这道题可以用动态规划，就是背包问题
//        // 硬币就是物品，amount 就是背包
//        // 则 dp[j] 表示装满 j 背包所需要的最小硬币个数
//        // dp[j] = min(dp[j], dp[j - coins[i]] + 1)
//        int[] dp = new int[amount + 1];
//        Arrays.fill(dp, 1000000);
//        dp[0] = 0;
//        for (int i = 0; i < coins.length; i++) {
//            for (int j = coins[i]; j <= amount; j++) {
//                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
//            }
//        }
//        return dp[amount] == 1000000 ? -1 : dp[amount];
//    }
//}


// leetcode 139. 单词拆分
//class Solution {
//    public boolean wordBreak(String s, List<String> wordDict) {
//        // 还是背包问题，求单词是否能装满字符串，对单词的顺序有要求
//        // dp[i] 是否能装满长度为 i 字符串，与单词顺序有关，所以是排列，需要先遍历背包
//        // dp[i] 则看 dp[i - j] &&  [i,j] 的字符串在 word 数组内
//        // dp[i] = true;
//        boolean[] dp = new boolean[s.length() + 1];
//        dp[0] = true;
//        Set<String> set = new HashSet<>();
//        for (String str : wordDict) {
//            set.add(str);
//        }
//        for (int i = 1; i <= s.length(); i++) {
//            // j < i 是为了防止数组越界，要截取 j-i 长度的字符串
//            for (int j = 0; j < i; j++) {
//                String tmp = s.substring(j, i);
//                if (dp[j] && set.contains(tmp)) {
//                    dp[i] = true;
//                }
//            }
//        }
//        return dp[s.length()];
//    }
//}