
// leetcode 739. 每日温度
//class Solution {
//    public int[] dailyTemperatures(int[] temperatures) {
//        // 单调栈
//        int[] ret = new int[temperatures.length];
//        Stack<Integer> stack = new Stack<>();
//        // 降序
//        // 73 74
//        for (int i = 0; i < temperatures.length; i++) {
//            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
//                int index = stack.pop();
//                ret[index] = i - index;
//            }
//            stack.push(i);
//        }
//
//        return ret;
//    }
//}