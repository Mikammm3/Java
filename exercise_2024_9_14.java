
// leetcode LCR 177. 撞色搭配
//class Solution {
//    public int[] sockCollocation(int[] sockets) {
//        int tmp = 0;
//        for (int i = 0; i < sockets.length; i++) {
//            tmp ^= sockets[i];
//        }
//        // 分组异或
//        int index = 0;
//        while (tmp != 0) {
//            if (tmp % 2 == 1) {
//                break;
//            }
//            tmp >>= 1;
//            index++;
//        }
//
//        int num1 = 0;
//        int num2 = 0;
//        for (int i = 0; i < sockets.length; i++) {
//            if (((sockets[i] >> index) & 1) == 1) {
//                num1 ^= sockets[i];
//            } else {
//                num2 ^= sockets[i];
//            }
//        }
//        return new int[]{num1, num2};
//    }
//}


// leetcode
//class Solution {
//    public int trainingPlan(int[] actions) {
//        Map<Integer, Integer> hash = new HashMap<>();
//        for (int i = 0; i < actions.length; i++) {
//            int value = hash.getOrDefault(actions[i], 0);
//            hash.put(actions[i], value + 1);
//        }
//        for (int i = 0; i < actions.length; i++) {
//            int value = hash.getOrDefault(actions[i], 0);
//            if (value == 1) {
//                return actions[i];
//            }
//        }
//        return -1;
//    }
//}