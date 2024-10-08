
// leetcode 238. 除自身以外数组的乘积
//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] left = new int[n];
//        int[] right = new int[n];
//        left[0] = 1;
//        for (int i = 1; i < left.length; i++) {
//            left[i] = left[i - 1] * nums[i - 1];
//        }
//        right[n - 1] = 1;
//        for (int i = n - 2; i >= 0; i--) {
//            right[i] = nums[i + 1] * right[i + 1];
//        }
//        int[] ret = new int[n];
//        for (int i = 0; i < n; i++) {
//            ret[i] = left[i] * right[i];
//        }
//        return ret;
//    }
//}