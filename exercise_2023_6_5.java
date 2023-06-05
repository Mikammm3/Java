
//牛客网 BM17 二分查找-I
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param nums   int整型一维数组
//     * @param target int整型
//     * @return int整型
//     */
//    public int search(int[] nums, int target) {
//        if (nums == null) {
//            return -1;
//        }
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (nums[mid] > target) {
//                right = mid - 1;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//
//        return -1;
//    }
//}