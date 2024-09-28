

// leetcode 27. 移除元素
//class Solution {
//    public int removeElement(int[] nums, int val) {
//        // 用 left 来表示在数组中从 [0,left] 最后一个不是 val 的位置
//        int left = 0, right = nums.length;
//        while (left < right) {
//            if (nums[left] == val) {
//                nums[left] = nums[--right];
//            } else {
//                // 说明此时 nums[left] != val
//                left++;
//            }
//
//        }
//        return left;
//    }
//}