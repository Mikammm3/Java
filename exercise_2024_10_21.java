
// leetcode 两数之和 II - 输入有序数组
//class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//        int left = 0, right = numbers.length - 1;
//        while (left < right) {
//            int sum = numbers[left] + numbers[right];
//            if (sum > target) {
//                right--;
//            } else if (sum < target) {
//                left++;
//            } else {
//                return new int[]{left + 1, right + 1};
//            }
//        }
//        return new int[]{-1, -1};
//    }
//}