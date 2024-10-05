
// leetcode 55. 跳跃游戏
//class Solution {
//    public boolean canJump(int[] nums) {
//        boolean[] dp = new boolean[nums.length];
//        // dp[i] 表示是否能达到 i 下标
//        dp[0] = true;
//        // 3 2 1 0 4
//        // 0 1 2 3 4
//        // t t t t f
//        for (int i = 1; i < dp.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (dp[j] && nums[j] + j >= i) {
//                    dp[i] = true;
//                    break;
//                }
//            }
//        }
//        return dp[nums.length - 1];
//    }
//}
//class Solution {
//    public boolean canJump(int[] nums) {
//        if (nums.length == 1) return true;
//        // 从后往前遍历，用 step 记录能到达的 最近 的下标
//        int step = nums.length - 1;
//        for (int i = nums.length - 2; i >= 0; i--) {
//            if (nums[i] + i >= step) {
//                step = i;
//            }
//        }
//        // 如果 step 能从 n - 1 到 0，说明能到达
//        return step == 0;
//    }
//}