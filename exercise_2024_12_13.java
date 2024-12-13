
// leetcode 54. 螺旋矩阵
//class Solution {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> ret = new ArrayList<>();
//        int x1 = 0, y1 = 0;
//        int x2 = matrix.length - 1, y2 = matrix[0].length - 1;// 2, 3
//        while (x1 <= x2 && y1 <= y2) {
//            for (int i = y1; i <= y2; i++) {
//                ret.add(matrix[x1][i]);
//            }
//            for (int i = x1 + 1; i <= x2; i++) {
//                ret.add(matrix[i][y2]);
//            }
//            if (x1 < x2) {
//                for (int i = y2 - 1; i >= y1; i--) {
//                    ret.add(matrix[x2][i]);
//                }
//            }
//            if (y1 < y2) {
//                for (int i = x2 - 1; i > x1; i--) {
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

// leetcode 48. 旋转图像
//class Solution {
//    public void rotate(int[][] matrix) {
//        int n = matrix.length;
//        // 先直接将行和列翻转即可 01 翻转成 10，从对角线开始翻转，也就是 i == j
//        // 然后再对每一行翻转
//        for (int i = 0; i < n; i++) {
//            // 从 i 开始，防止重复交换
//            for (int j = i; j < n; j++) {
//                int tmp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = tmp;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            int left = 0, right = n - 1;
//            while (left < right) {
//                int tmp = matrix[i][left];
//                matrix[i][left] = matrix[i][right];
//                matrix[i][right] = tmp;
//                left++;
//                right--;
//            }
//        }
//
//    }
//}