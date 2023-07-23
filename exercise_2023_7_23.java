

//牛客网 NC32 求平方根
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param x int整型
//     * @return int整型
//     */
//    public int sqrt(int x) {
//        //二分法
//        long left = 1;
//        long right = x;
//        long mid = (left + right) / 2;
//        while (left != mid) {
//            if (mid * mid == x) {
//                break;
//            } else if (mid * mid < x) {
//                left = mid;
//            } else {
//                right = mid;
//            }
//            mid = (left + right) / 2;
//        }
//        return (int) mid;
//    }
//}