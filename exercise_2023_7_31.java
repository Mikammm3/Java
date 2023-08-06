

//LeetCode 35. 搜索插入位置
//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        //普通二分查找
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] > target) {
//                right = mid - 1;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return left;
//    }
//}