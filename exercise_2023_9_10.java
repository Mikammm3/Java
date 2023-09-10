
// 牛客网 JZ14 剪绳子
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param n int整型
//     * @return int整型
//     */
//    public int cutRope(int n) {
//        // 特殊情况
//        if (n == 2 || n == 3) {
//            return n - 1;
//        }
//        //其他情况，当每段绳子等于3时，得到的乘积最大
//        int res = 1;
//        while (n > 4) {
//            n = n - 3;
//            res *= 3;
//        }
//        return res * n;
//    }
//}