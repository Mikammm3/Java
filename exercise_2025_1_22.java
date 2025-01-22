

// leetcode 70. 爬楼梯
//class Solution {
//    public int climbStairs(int n) {
//        if (n == 1 || n == 2) return n;
//        int a = 1;
//        int b = 2;
//        int c = a + b;
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
//        for (int i = 0; i < numRows; i++) {
//            List<Integer> arr = new ArrayList<>();
//            for (int j = 0; j <= i; j++) {
//                if (j == 0 || i == j) {
//                    arr.add(1);
//                } else {
//
//                    int ans = ret.get(i - 1).get(j) + ret.get(i - 1).get(j - 1);
//                    arr.add(ans);
//                }
//            }
//            ret.add(arr);
//        }
//
//        return ret;
//    }
//}