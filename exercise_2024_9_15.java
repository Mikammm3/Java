
// leetcode LCR 190. 加密运算
//class Solution {
//    public int encryptionCalculate(int dataA, int dataB) {
//        if (dataA == 0) return dataB;
//        if (dataB == 0) return dataA;
//        // 两个数不进位相加的结果  a ^ b
//
//        while (dataB != 0) {
//            int carry = (dataA & dataB) << 1; // 计算进位
//            dataA = dataA ^ dataB;// 计算两数不进位相加和
//            dataB = carry;
//        }
//        return dataA;
//    }
//}


// leetcode LCR 126. 斐波那契数
//class Solution {
//    public int fib(int n) {
//        if (n == 0 || n == 1) return n;
//        int a = 0;
//        int b = 1;
//        int c = 0;
//
//        while (n >= 2) {
//            c = (a + b) % 1000000007;
//            a = b;
//            b = c;
//            n--;
//        }
//        return c;
//
//    }
//}