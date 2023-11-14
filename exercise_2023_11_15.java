
// 牛客网 OR57 手套
//import java.util.*;
//
//public class Gloves {
//    public int findMinimum(int n, int[] left, int[] right) {
//        int leftSum = 0;
//        int rightSum = 0;
//        int sum = 0;
//        int leftMin = Integer.MAX_VALUE;
//        int righttMin = Integer.MAX_VALUE;
//        for (int i = 0; i < n; i++) {
//            if (left[i] * right[i] == 0) {
//                sum += left[i] + right[i];
//            } else {
//                leftSum += left[i];
//                rightSum += right[i];
//                if (left[i] < leftMin) {
//                    leftMin = left[i];
//                }
//                if (right[i] < righttMin) {
//                    righttMin = right[i];
//                }
//            }
//        }
//        return 1 + sum + Math.min(leftSum - leftMin + 1, rightSum - righttMin + 1);
//    }
//}