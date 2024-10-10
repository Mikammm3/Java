
// leetcode 135. 分发糖果
//class Solution {
//    public int candy(int[] ratings) {
//        int n = ratings.length;
//        int[] left = new int[n];
//        int[] right = new int[n];
//        Arrays.fill(left, 1);
//        Arrays.fill(right, 1);
//        for (int i = 1; i < n; i++) {
//            if (ratings[i] > ratings[i - 1]) {
//                left[i] = left[i - 1] + 1;
//            }
//        }
//        int count = left[n - 1];
//        for (int i = n - 2; i >= 0; i--) {
//            if (ratings[i] > ratings[i + 1]) {
//                right[i] = right[i + 1] + 1;
//            }
//            count += Math.max(left[i], right[i]);
//        }
//        return count;
//    }
//}