


// LeetCode 75. 颜色分类
//class Solution {
//    public void sortColors(int[] nums) {
//        if (nums.length == 1) return;
//        for (int i = 0, left = -1, right = nums.length; i < right; ) {
//            if (nums[i] == 0) {
//                left++;
//                int tmp = nums[left];
//                nums[left] = nums[i];
//                nums[i++] = tmp;
//            } else if (nums[i] == 1) {
//                i++;
//            } else {
//                right--;
//                int tmp = nums[right];
//                nums[right] = nums[i];
//                nums[i] = tmp;
//            }
//        }
//    }
//}