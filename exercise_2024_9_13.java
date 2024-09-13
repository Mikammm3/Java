
// leetcode LCR 133. 位 1 的个数
//public class Solution {
//    // you need to treat n as an unsigned value
//    public int hammingWeight(int n) {
//        int count = 0;
//        while (n != 0) {
//            n &= (n - 1);
//            count++;
//        }
//
//        return count;
//
//    }
//}


// leetcode LCR 134. Pow(x, n)
//class Solution {
//    public double myPow(double x, int n) {
//        // 特殊情况，当 x 为正负 1 时，或者 n 为 0 时
//        if (n == 0 || x == 1) return 1.0;
//        if (x == -1) return (n % 2 == 0 ? 1.0 : -1.0);
//        if (n == Integer.MIN_VALUE) return 0.0;
//        // 分 n > 0
//        if (n > 0) {
//            double ret = 1.0;
//            for (int i = 0; i < n; i++) {
//                ret *= x;
//            }
//            return ret;
//        } else {
//            // n < 0
//            double ret = 1.0;
//            n = -n;
//            for (int i = 0; i < n; i++) {
//                ret *= x;
//            }
//            return 1.0 / ret;
//        }
//
//    }
//}
//class Solution {
//    public double myPow(double x, int n) {
//        if (x == 0.0) return 0.0;
//        // 用快速幂
//        // 2^9 = (2)* 4^4 = (2)* 16^2 = (2)* 256^1 = (2*256)* (256*256)^0 = 512
//        double res = 1.0;
//        boolean flg = false;
//        // n 可能会很大，将 n 赋给 tmp 防止越界(-2147483648)
//        long tmp = n;
//        if (tmp < 0) {
//            tmp = -tmp;
//            flg = true;
//        }
//        while (tmp != 0) {
//            if (tmp % 2 == 1) {
//                res *= x;
//            }
//            x = x * x;
//            tmp /= 2;
//
//        }
//        if (flg) {
//            return 1.0 / res;
//        }
//        return res;
//    }
//}
