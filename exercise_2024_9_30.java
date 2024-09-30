
// leetcode 80. 删除有序数组中的重复项 II
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        if (nums.length <= 2) return nums.length;
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (j < 2 || nums[i] != nums[j - 2]) {
//                nums[j++] = nums[i];
//            }
//        }
//        return j;
//    }
//}