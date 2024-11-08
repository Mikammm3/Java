
// leetcode 54. 螺旋矩阵
//class Solution {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> ret = new ArrayList<>();
//        int x1 = 0, y1 = 0;
//        int x2 = matrix.length - 1, y2 = matrix[0].length - 1;
//        while (x1 <= x2 && y1 <= y2) {
//            for (int i = y1; i <= y2; i++) {
//                ret.add(matrix[x1][i]);
//            }
//            for (int i = x1 + 1; i <= x2; i++) {
//                ret.add(matrix[i][y2]);
//            }
//            if (x2 > x1) {
//                for (int i = y2 - 1; i >= y1; i--) {
//                    ret.add(matrix[x2][i]);
//                }
//            }
//            if (y2 > y1) {
//                for (int i = x2 - 1; i >= x1 + 1; i--) {
//                    ret.add(matrix[i][y1]);
//                }
//            }
//            x1++;
//            y1++;
//            x2--;
//            y2--;
//        }
//        return ret;
//    }
//}