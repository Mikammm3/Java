
// 牛客网 OR57 手套
//import java.util.*;
//
//public class Gloves {
//    public int findMinimum(int n, int[] left, int[] right) {
//        int leftNum = 0;
//        int rightNum = 0;
//        int ret = 0;
//        int minLeft = Integer.MAX_VALUE;
//        int minRight = Integer.MAX_VALUE;
//        for (int i = 0; i < n; i++) {
//            if (left[i] * right[i] == 0) {
//                ret += left[i] + right[i];
//            } else {
//                leftNum += left[i];
//                rightNum += right[i];
//                if (left[i] < minLeft) minLeft = left[i];
//                if (right[i] < minRight) minRight = right[i];
//            }
//        }
//        leftNum = leftNum - minLeft + 1;
//        rightNum = rightNum - minRight + 1;
//
//        return Math.min(leftNum, rightNum) + ret + 1;
//    }
//
//}