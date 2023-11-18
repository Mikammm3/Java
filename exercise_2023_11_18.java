

// LeetCode 283. 移动零
//class Solution {
//    public void moveZeroes(int[] nums) {
//        for (int dest = -1, cur = 0; cur < nums.length; cur++) {
//            if (nums[cur] != 0) {
//                int tmp = nums[dest + 1];
//                nums[dest + 1] = nums[cur];
//                nums[cur] = tmp;
//                dest++;
//            }
//        }
//    }
//}