

//LeetCode 1486. 数组异或操作
//class Solution {
//    public int xorOperation(int n, int start) {
//        if (n == 0) {
//            return 0;
//        }
//        int[] arr = new int[n];
//        int ret = 0;
//        for (int i = 0; i < n; i++) {
//            arr[i] = start + 2 * i;
//            ret ^= arr[i];
//        }
//        return ret;
//    }
//}