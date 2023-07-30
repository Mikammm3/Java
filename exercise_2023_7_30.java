

//LeetCode 263. 丑数
//class Solution {
//    public boolean isUgly(int n) {
//        if (n <= 0) {
//            return false;
//        }
//        //要判断是不是丑数，只要对n反复除以2，3，5，直到n不再包含2，3，5
//        //如果剩下的数等于1，则说明不包含其他质因数，如果不是1，那就包含其他质因数
//        int[] arr = {2, 3, 5};
//        for (int factor : arr) {
//            while (n % factor == 0) {
//                n /= factor;
//            }
//        }
//        return n == 1;
//    }
//}

