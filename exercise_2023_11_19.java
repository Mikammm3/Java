
// LeetCode 1089. 复写零
//class Solution {
//    public void duplicateZeros(int[] arr) {
//        int dest = -1;
//        int cur = 0;
//        while (dest < arr.length) {
//            if (arr[cur] != 0) {
//                dest++;
//            } else {
//                dest += 2;
//            }
//            if (dest >= arr.length - 1) {
//                break;
//            }
//            cur++;
//        }
//        // 此时 cur 就是复写的最后一个数
//        if (dest >= arr.length) {
//            // 防止越界,说明最后一个复写的数是0
//            arr[dest - 1] = 0;
//            dest -= 2;
//            cur--;
//        }
//        while (cur >= 0) {
//            if (arr[cur] != 0) {
//                arr[dest] = arr[cur];
//                dest--;
//            } else {
//                arr[dest--] = 0;// 复写两次0
//                arr[dest--] = 0;
//            }
//            cur--;
//        }
//
//    }
//}