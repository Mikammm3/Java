

//LeetCode 26. 删除有序数组中的重复项
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] == nums[j]) {
//                    for (int k = j; k < n - 1; k++) {
//                        nums[k] = nums[k + 1];
//                    }
//                    n--;
//                    j--;
//                }
//            }
//        }
//        return n;
//    }
//}
