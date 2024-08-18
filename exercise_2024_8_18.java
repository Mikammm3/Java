
// leetcode LCR 139. 训练计划 I
//class Solution {
//    public int[] trainingPlan(int[] actions) {
//        // 这个简单
//        int left = 0;
//        int right = actions.length - 1;
//        while (left < right) {
//            // left 往后走找偶数
//            while (left < right && actions[left] % 2 == 1) {
//                left++;
//            }
//
//            // right 往前找奇数
//            while (left < right && actions[right] % 2 == 0) {
//                right--;
//            }
//            // 此时 left 一定是偶数， right 一定是奇数，交换
//            int tmp = actions[left];
//            actions[left] = actions[right];
//            actions[right] = tmp;
//            left++;
//            right--;
//        }
//        return actions;
//    }
//}


// leetcode LCR 158. 库存管理 II
//class Solution {
//    public int inventoryManagement(int[] stock) {
//        Arrays.sort(stock);
//        return stock[stock.length / 2];
//    }
//}