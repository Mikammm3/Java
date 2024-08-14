
// 牛客网 顺时针打印矩阵
//import java.util.*;
//
//public class Solution {
//    public ArrayList<Integer> printMatrix(int[][] matrix) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        int x1 = 0, y1 = 0, x2 = matrix.length - 1, y2 = matrix[0].length - 1;
//        while (x1 <= x2 && y1 <= y2) {
//            // 第一行
//            for (int i = y1; i <= y2; i++) {
//                ans.add(matrix[x1][i]);
//            }
//            // 最后一列
//            for (int i = x1 + 1; i <= x2; i++) {
//                ans.add(matrix[i][y2]);
//            }
//            // 最后一行
//            if (x1 < x2) {
//                for (int i = y2 - 1; i >= y1; i--) {
//                    ans.add(matrix[x2][i]);
//                }
//            }
//            // 第一列
//            if (y1 < y2) {
//                for (int i = x2 - 1; i >= x1 + 1; i--) {
//                    ans.add(matrix[i][y1]);
//                }
//            }
//            x1++;
//            y1++;
//            x2--;
//            y2--;
//        }
//        return ans;
//    }
//}