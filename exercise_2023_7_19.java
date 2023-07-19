java.util.*;

//LeetCode 136. 只出现一次的数字
//class Solution {
//    public int singleNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            int ret = nums[i];
//            if (!set.contains(ret)) {
//                set.add(ret);
//            } else {
//                set.remove(ret);
//            }
//        }
//        Integer[] arr = set.toArray(new Integer[0]);
//        return arr[0];
//    }
//}


//LeetCode 771. 宝石与石头
//class Solution {
//    public int numJewelsInStones(String jewels, String stones) {
//        Set<Character> set = new HashSet<>();
//        for (int i = 0; i < jewels.length(); i++) {
//            char ch = jewels.charAt(i);
//            set.add(ch);
//        }
//        int count = 0;
//        for (int i = 0; i < stones.length(); i++) {
//            char ch = stones.charAt(i);
//            if (set.contains(ch)) {
//                count++;
//            }
//        }
//        return count;
//    }
//}

