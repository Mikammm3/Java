

//LeetCode 69. x 的平方根
//class Solution {
//    public int mySqrt(int x) {
//        if (x == 0 || x == 1) {
//            return x;
//        }
//        int left = 1;
//        int right = x / 2;
//        while (left < right) {
//            int mid = left + (right - left + 1) / 2;
//            if (mid > x / mid) {
//                right = mid - 1;
//            } else {
//                left = mid;
//            }
//        }
//        return right;
//    }
//}