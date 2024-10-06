
// leetcode 45. 跳跃游戏 II
//class Solution {
//    public int jump(int[] nums) {
//        // dp[i] 表示到达以 i 结尾的最小跳跃次数
//        int[] dp = new int[nums.length];
//        dp[0] = 0;
//        for (int i = 1; i < dp.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[j] + j >= i && dp[i] != 0) {
//                    dp[i] = Math.min(dp[j] + 1, dp[i]);
//                } else if (nums[j] + j >= i) {
//                    dp[i] = dp[j] + 1;
//                }
//            }
//        }
//        return dp[nums.length - 1];
//    }
//}
//class Solution {
//    public int jump(int[] nums) {
//        int end = 0;// 记录当前能跳的边界
//        int maxPos = 0;// 记录能跳到最远的地方
//        int step = 0;
//        // 因为 i 从 0 开始，step 就会加一，所以最后的位置就不用加一了
//        for (int i = 0; i < nums.length - 1; i++) {
//            maxPos = Math.max(maxPos, nums[i] + i);
//            if (i == end) {
//                // 说明已经到了边界，则需要更新
//                step++;
//                end = maxPos;
//            }
//        }
//        return step;
//    }
//}