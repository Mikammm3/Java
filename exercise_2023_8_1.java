

//LeetCode 278. 第一个错误的版本
//public class Solution extends VersionControl {
//    public int firstBadVersion(int n) {
//        int left = 1;
//        int right = n;
//        while (left < right) {
//            //当一个版本为正确版本，则该版本之前的所有版本均为正确版本；
//            //当一个版本为错误版本，则该版本之后的所有版本均为错误版本。
//            int mid = left + (right - left) / 2;
//            if (isBadVersion(mid)) {
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return left;
//    }
//}