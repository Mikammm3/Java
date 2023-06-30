
//牛客网 JZ16 数值的整数次方
//import java.util.*;
//
//public class Solution {
//    public static double Power(double base, int exponent) {
//        if (base == 0) {
//            return 0.0;
//        }
//        if (exponent == 0) {
//            return 1.0;
//        } else if (exponent > 0) {
//            double ret = 1.0;
//            for (int i = 0; i < exponent; i++) {
//                ret *= base;
//            }
//            return ret;
//        } else {
//            double ret = 1.0;
//            for (int i = 0; i < -exponent; i++) {
//                ret *= base;
//            }
//            return 1.0 / ret;
//        }
//    }
//}