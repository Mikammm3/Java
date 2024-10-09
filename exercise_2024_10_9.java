
// leetcode 134. 加油站
//class Solution {
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//        int len = gas.length;
//        int rest = 0;
//        int min = Integer.MAX_VALUE;// gas - cost 最小差值
//        int minIndex = 0;// 最小差值下标
//
//        for (int i = 0; i < len; i++) {
//            rest += gas[i] - cost[i];
//            if (rest < min) {
//                min = rest;
//                minIndex = i;
//            }
//        }
//
//        return rest < 0 ? -1 : (minIndex + 1) % len;
//    }
//}