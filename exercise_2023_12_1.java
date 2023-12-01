


// LeetCode 461. 汉明距离
//class Solution {
//    public int hammingDistance(int x, int y) {
//        int tmp = x ^ y;
//        int ret = 0;
//        while (tmp > 0) {
//            tmp &= (tmp - 1);
//            ret++;
//        }
//        return ret;
//    }
//}


// LeetCode 338. 比特位计数
//class Solution {
//    public int[] countBits(int n) {
//        int[] ret = new int[n + 1];
//        for (int i = 0; i <= n; i++) {
//            int count = 0, tmp = i;
//            while (tmp > 0) {
//                tmp &= (tmp - 1);
//                count++;
//            }
//            ret[i] = count;
//        }
//        return ret;
//    }
//}


// LeetCode 191. 位1的个数
//public class Solution {
//    // you need to treat n as an unsigned value
//    public int hammingWeight(int n) {
//        int ret = 0;
//        while (n != 0) {
//            n &= (n - 1);
//            ret++;
//        }
//        return ret;
//    }
//}


// LeetCode 136. 只出现一次的数字
//class Solution {
//    public int singleNumber(int[] nums) {
//        int ret = 0;
//        for (int x : nums) {
//            ret ^= x;
//        }
//        return ret;
//    }
//}


// LeetCode 260. 只出现一次的数字 III
//class Solution {
//    public int[] singleNumber(int[] nums) {
//        int[] ret = new int[2];
//        int tmp = 0;
//        // 010
//        for (int x : nums) tmp ^= x;
//        int pos = tmp & (-tmp);
//        for (int x : nums) {
//            int t = x & pos;
//            if (t == 0) {
//                ret[0] ^= x;
//            } else {
//                ret[1] ^= x;
//            }
//        }
//        return ret;
//    }
//}


// LeetCode 面试题 01.01. 判定字符是否唯一
//class Solution {
//    public boolean isUnique(String astr) {
//        if (astr.length() > 26) return false;
//        int bit = 0;
//        for (char c : astr.toCharArray()) {
//            int x = c - 'a';
//            if (((bit >> x) & 1) == 1) return false;
//            else {
//                int tmp = 1;
//                bit |= ((tmp << x));
//            }
//        }
//        return true;
//    }
//}


// LeetCode 268. 丢失的数字
//class Solution {
//    public int missingNumber(int[] nums) {
//        // 1. 哈希表
//        // int n = nums.length;
//        // int[] hash = new int[n + 1];
//        // for(int x : nums) hash[x]++;
//        // for(int i = 0; i < n + 1; i++){
//        //     if(hash[i] == 0) return i;
//        // }
//        // return n + 1;
//
//        // 2. 高斯求和
//        // int n = nums.length;
//        // int sum = n * (n + 1) / 2;
//        // for(int x : nums) sum -= x;
//        // return sum;
//
//        // 3. 异或
//        int ret = 0, n = nums.length;
//        for (int i = 0; i < n + 1; i++) {
//            ret ^= i;
//            if (i < n) ret ^= nums[i];
//        }
//        return ret;
//    }
//}