//public class exercise_2023_5_18 {
//}


//LeetCode 2413. 最小偶倍数
//class Solution {
//    public int smallestEvenMultiple(int n) {
//        int a = 2;
//        int b = n;
//        int c = a % b;
//        //最小公倍数=两数之积/最大公约数
//        while (c != 0) {
//            a = b;
//            b = c;
//            c = a % b;
//        }
//        return 2 * n / b;
//    }
//}