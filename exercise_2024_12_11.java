
// leetcode 189. 轮转数组
//class Solution {
//    public void rotate(int[] nums, int k) {
//        k %= nums.length;
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, nums.length - 1);
//
//    }
//
//    public void reverse(int[] arr, int left, int right) {
//        while (left < right) {
//            int tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//    }
//}

// leetcode 238. 除自身以外数组的乘积
//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//        // left[i] 表示在 i 左边的乘积
//        int[] left = new int[nums.length];
//        // right[i] 表示在 i 右边的乘积
//        int[] right = new int[nums.length];
//        left[0] = 1;
//        for (int i = 1; i < nums.length; i++) {
//            left[i] = left[i - 1] * nums[i - 1];
//        }
//        right[nums.length - 1] = 1;
//        for (int i = nums.length - 2; i >= 0; i--) {
//            right[i] = right[i + 1] * nums[i + 1];
//        }
//        int[] ret = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ret[i] = left[i] * right[i];
//        }
//        return ret;
//    }
//}