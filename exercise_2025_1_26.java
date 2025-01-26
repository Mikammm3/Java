

// leetcode 139. 单词拆分
//class Solution {
//    public boolean wordBreak(String s, List<String> wordDict) {
//        boolean[] dp = new boolean[s.length() + 1];
//        Set<String> set = new HashSet<>();
//        for (String word : wordDict) {
//            set.add(word);
//        }
//        // 背包问题
//        dp[0] = true;
//        // dp[i] 表示以第 i 字符结尾的字符串可以被拆分
//        for (int i = 1; i < dp.length; i++) {
//            for (int j = 0; j < wordDict.size(); j++) {
//                String str = wordDict.get(j);
//                int index = i - str.length();
//                if (index < 0) continue;
//                String word = s.substring(index, i);
//                if (dp[index] && set.contains(word)) {
//                    dp[i] = true;
//                }
//            }
//        }
//
//        return dp[s.length()];
//    }
//}