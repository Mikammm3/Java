
// LeetCode 50. Pow(x, n)
//class Solution {
//    public double myPow(double x, long n) {
//        if (n == 0) return 1;
//
//        if (n < 0) {
//            n = -n;
//            double tmp = myPow(x, n / 2);
//            if (n % 2 == 0) return 1.0 / (tmp * tmp);
//            else return 1.0 / (tmp * tmp * x);
//        } else {
//            double tmp = myPow(x, n / 2);
//            if (n % 2 == 0) return (tmp * tmp);
//            else return tmp * tmp * x;
//        }
//    }
//}