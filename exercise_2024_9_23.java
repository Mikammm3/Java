

//class Solution {
//    public int digitOneInNumber(int num) {
//        int digit = 1, count = 0;
//        int high = num / 10, cur = num % 10, low = 0;
//        while (high != 0 || cur != 0) {
//            if (cur == 0) {
//                // 当前是个位
//                count += high * digit;
//            } else if (cur == 1) {
//                count += high * digit + low + 1;
//            } else {
//                count += (high + 1) * digit;
//            }
//            low += cur * digit;
//            cur = high % 10;
//            high /= 10;
//            digit *= 10;
//        }
//        return count;
//    }
//}
