

// leetcode 189. 轮转数组
//class Solution {
//    public void rotate(int[] nums, int k) {
//        // 7 6 5 4 3 2 1
//        // 5 6 7 4 3 2 1
//        // 5 6 7 1 2 3 4
//        k %= nums.length;
//        reverse(0, nums.length - 1, nums);
//        reverse(0, k - 1, nums);
//        reverse(k, nums.length - 1, nums);
//    }
//
//    public void reverse(int start, int end, int[] arr) {
//        while (start < end) {
//            int tmp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = tmp;
//            start++;
//            end--;
//        }
//    }
//}