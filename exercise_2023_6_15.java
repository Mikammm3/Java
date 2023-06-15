

//LeetCode 70. 爬楼梯
//class Solution {
//    public int climbStairs(int n) {
//        int a = 1;
//        int b = 1;
//        int c = 1;
//        while (n >= 2) {
//            c = a + b;
//            a = b;
//            b = c;
//            n--;
//        }
//        return c;
//    }
//}