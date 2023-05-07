//public class exercise_2023_5_7 {
//
//}


//LeetCode 461. 汉明距离
//class Solution {
//    public int hammingDistance(int x, int y) {
//        int sum = 0;
//        int i = 0;
//        while (x != 0 || y != 0) {
//            if (((x & 1) ^ (y & 1)) == 1) {
//                sum++;
//            }
//            x /= 2;
//            y /= 2;
//        }
//        return sum;
//
//    }
//}