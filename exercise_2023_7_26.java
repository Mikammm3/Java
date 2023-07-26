
//LeetCode 26. 删除有序数组中的重复项
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int j = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[j] != nums[i]) {
//                nums[++j] = nums[i];
//            }
//        }
//        return j + 1;
//    }
//}


//LeetCode 27. 移除元素
//class Solution {
//    public int removeElement(int[] nums, int val) {
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[j++] = nums[i];
//            }
//        }
//        return j;
//    }
//}