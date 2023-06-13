

//LeetCode 1431. 拥有最多糖果的孩子
//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int max = 0;
//        for (int i = 0; i < candies.length; i++) {
//            if (candies[i] > max) {
//                max = candies[i];
//            }
//        }
//        List<Boolean> ans = new ArrayList<>(candies.length);
//        for (int i = 0; i < candies.length; i++) {
//            if (candies[i] + extraCandies >= max) {
//                ans.add(true);
//            } else {
//                ans.add(false);
//            }
//        }
//        return ans;
//    }
//}