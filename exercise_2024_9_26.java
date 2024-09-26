


//class Solution {
//    public int findKthNumber(int k) {
//        // 几位数
//        int digit = 1;
//        // 从哪里开始
//        long start = 1;
//        // digit 位数一共有几个
//        long count = 9;
//        // 获取第 k 位数 是几位数
//        while (k > count) {
//            k -= count;
//            digit++;
//            start *= 10;
//            count = 9 * start * digit;
//        }
//        long num = start + (k - 1) / digit;
//        return Long.toString(num).charAt((k - 1) % digit) - '0';
//    }
//}