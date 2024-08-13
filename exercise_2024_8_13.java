

// 牛客网 左右最值最大差
//import java.util.*;
//
//public class MaxGap {
//    public int findMaxGap(int[] A, int n) {
//
//        // 求的是左边最大值与右边最大值的差的绝对值，最大是多少
//        // 则说明可以是 leftMax - rightMax
//        // 也可以是 rightMax - leftMax
//        // 而左右两边的最大值一定有一个是整个数组的最大值
//        // 而题目又说它们的差必须最大，则说明被减数一定要小
//        // 左边最小的最大值一定是比 A[0] 要大，或者相等
//        // 右边最小的最大值一定是比 A[n - 1] 要大，或者相等
//        // 所以最小的最大值一定在 A[0] 和 A[n - 1] 中选
//        // 所以最后就是遍历数组，找出数组最大值
//        // 再用数组最大值 - min(A[0], A[n - 1]) 即可
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < A.length; i++) {
//            int tmp = A[i];
//            if (tmp > max) {
//                max = tmp;
//            }
//        }
//        return max - Math.min(A[0], A[n - 1]);
//    }
//}