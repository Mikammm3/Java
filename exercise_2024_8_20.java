

// leetcode LCR 168. 丑数
//class Solution {
//
//    public boolean isUgly(long n) {
//        int i = 2;
//        while (n > 1) {
//            if (n % i == 0) {
//                int tmp = i;
//                if (tmp != 2 && tmp != 5 && tmp != 3) {
//                    return false;
//                }
//                n /= i;
//            } else {
//                i++;
//            }
//        }
//        return true;
//    }
//
//    public int nthUglyNumber(int n) {
//        long[] arr = new long[n];
//        for (int i = 0; i < n; i++) {
//            if (i < 6) {
//                arr[i] = i + 1;
//            } else {
//                long j = arr[i - 1] + 1;
//                while (!isUgly(j)) {
//                    j++;
//                }
//                arr[i] = j;
//            }
//        }
//        return (int) arr[n - 1];
//    }
//
//}
//class Solution {
//    public int nthUglyNumber(int n) {
//        int[] dp = new int[n + 1];
//        dp[1] = 1;
//        // p2 表示还没使用乘 2 机会的数字所对应的下标
//        int p2 = 1, p3 = 1, p5 = 1;
//        for (int i = 2; i <= n; i++) {
//            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
//            dp[i] = Math.min(num2, num3);
//            dp[i] = Math.min(dp[i], num5);
//            if (dp[i] == num2) {
//                // 当前下标的数字已经使用过乘 2 机会了，那么 p2 需要往后走
//                p2++;
//            }
//            if (dp[i] == num3) {
//                p3++;
//            }
//            if (dp[i] == num5) {
//                p5++;
//            }
//        }
//        return dp[n];
//    }
//}


// leetcode LCR 164. 破解闯关密码
//class Solution {
//    public String crackPassword(int[] password) {
//        // 冒泡排序
//        for (int i = 0; i < password.length - 1; i++) {
//            boolean flg = true;
//            for (int j = 0; j < password.length - 1 - i; j++) {
//                // 8 和 7 --> 87 和 78
//                String s1 = password[j] + "" + password[j + 1];
//                String s2 = password[j + 1] + "" + password[j];
//                if (s1.compareTo(s2) > 0) {
//                    int tmp = password[j];
//                    password[j] = password[j + 1];
//                    password[j + 1] = tmp;
//                    flg = false;
//                }
//            }
//            if (flg) break;
//        }
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < password.length; i++) {
//            s.append(password[i]);
//        }
//        return s.toString();
//    }
//}