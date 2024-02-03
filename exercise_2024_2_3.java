


//import java.util.*;
//
//public class MaxGap {
//    public int findMaxGap(int[] A, int n) {
//        int k = n - 2;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < k; i++) {
//            int l = i;// 左部分最后一个
//            int r = l + 1;// 右部分第一个
//            int lm = A[l];
//            int rm = A[r];
//            for (int j = 0; j < l; j++) {
//                if (A[j] > lm) lm = A[j];
//            }
//            for (int z = r; z < n; z++) {
//                if (A[z] > lm) rm = A[z];
//            }
//            int cur = Math.abs((lm - rm));
//            if (cur > max) max = cur;
//        }
//
//        return max;
//    }
//}


//import java.util.*;
//
//public class Printer {
//    public int[] clockwisePrint(int[][] mat, int n, int m) {
//        int[] ret = new int[n * m];
//        int k = 0, i = 0, j = 0;
//        boolean flg = true; // 代表顺着打印，false代表逆着打印
//        int count = 0;
//        while (count < n * m) {
//            if (flg) {
//                // 顺
//                for (int a = 0; a < m; a++) {
//                    ret[k++] = mat[i][a];
//                    count++;
//                }
//                i++;
//                flg = !flg;
//            } else {
//                for (int a = m - 1; a >= 0; a--) {
//                    ret[k++] = mat[i][a];
//                    count++;
//                }
//                i++;
//                flg = !flg;
//            }
//        }
//        // System.out.println(ret.toString());
//        return ret;
//    }
//}