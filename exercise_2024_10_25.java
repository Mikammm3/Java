
// leetcode 209. 长度最小的子数组
//class Solution {
//    public int minSubArrayLen(int target, int[] nums) {
//        int len = Integer.MAX_VALUE;
//        int sum = 0;
//        for (int left = 0, right = 0; right < nums.length; right++) {
//            sum += nums[right];
//            while (sum >= target) {
//                len = Math.min(len, right - left + 1);
//                sum -= nums[left];
//                left++;
//            }
//        }
//        return len == Integer.MAX_VALUE ? 0 : len;
//    }
//}