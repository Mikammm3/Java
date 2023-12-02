

// LeetCode 371. 两整数之和
//class Solution {
//    public int getSum(int a, int b) {
//
//        while (b != 0) {
//            int x = a ^ b;
//            int carry = (a & b) << 1;// 进位
//            a = x;
//            b = carry;
//        }
//        return a;
//    }
//}


// LeetCode 137. 只出现一次的数字 II
//class Solution {
//    public int singleNumber(int[] nums) {
//        int ret = 0;
//        for (int i = 0; i < 32; i++) {
//            int sum = 0;
//            for (int j = 0; j < nums.length; j++) {
//                sum += ((nums[j] >> i) & 1);
//            }
//            sum %= 3;
//            if (sum == 1) {
//                ret |= (1 << i);
//            }
//        }
//        return ret;
//    }
//}