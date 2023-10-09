

// 牛客网 BM19 寻找峰值
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param nums int整型一维数组
//     * @return int整型
//     */
//    public int findPeakElement(int[] nums) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right) {
//            int mid = (left + right) / 2;
//            if (nums[mid] > nums[mid + 1]) {
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return right;
//    }
//}