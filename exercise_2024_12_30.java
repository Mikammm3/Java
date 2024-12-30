
// leetcode 70. 爬楼梯
//class Solution {
//    public int climbStairs(int n) {
//        if (n == 1 || n == 2) return n;
//        int a = 1;
//        int b = 2;
//        int c = 0;
//        while (n >= 3) {
//            c = a + b;
//            a = b;
//            b = c;
//            n--;
//        }
//        return b;
//    }
//}


// leetcode 118. 杨辉三角
//class Solution {
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> ret = new ArrayList<>();
//        // 1
//        // 1 1
//        // 1 2 1
//        // 1 3 3 1
//        int[][] arr = new int[numRows][numRows];
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (j == 0 || j == i) {
//                    arr[i][j] = 1;
//                } else {
//                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
//                }
//            }
//        }
//        for (int i = 0; i < numRows; i++) {
//            List<Integer> tmp = new ArrayList<>();
//            for (int j = 0; j <= i; j++) {
//                tmp.add(arr[i][j]);
//            }
//            ret.add(tmp);
//        }
//        return ret;
//    }
//}