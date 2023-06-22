

//LeetCode 1295. 统计位数为偶数的数字
//class Solution {
//    public int findNumbers(int[] nums) {
//        int counts = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int tmp = nums[i];
//            int count = 0;
//            while (tmp != 0) {
//                count++;
//                tmp /= 10;
//            }
//            if (count % 2 == 0) {
//                counts++;
//            }
//        }
//        return counts;
//    }
//}