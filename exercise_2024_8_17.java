
// leetcode LCR 132. 砍竹子 II
//class Solution {
//    public int cuttingBamboo(int n) {
//        if (n < 4) {
//            return n - 1;
//        } else if (n == 4) {
//            return n;
//        } else {
//            long ans = 1;
//            while (n > 4) {
//                ans *= 3;
//                ans %= 1000000007;
//                n -= 3;
//            }
//            return (int) (ans * n % 1000000007);
//        }
//    }
//}


// leetcode LCR 135. 报数
//class Solution {
//    public int[] countNumbers(int cnt) {
//        int len = (int) Math.pow(10, cnt);
//        int[] arr = new int[len - 1];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//        return arr;
//    }
//}