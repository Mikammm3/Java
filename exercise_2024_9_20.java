
// leetcode LCR 130. 衣橱整理
//class Solution {
//    public int wardrobeFinishing(int m, int n, int cnt) {
//        boolean[][] flg = new boolean[m][n];
//        return dfs(m, n, 0, 0, flg, cnt);
//
//    }
//
//    public int dfs(int m, int n, int i, int j, boolean[][] flg, int cnt) {
//        if (i < 0 || i >= m || j < 0 || j >= n || flg[i][j] || (numSum(i) + numSum(j) > cnt)) {
//            return 0;
//        }
//        flg[i][j] = true;
//        return dfs(m, n, i, j + 1, flg, cnt) + dfs(m, n, i + 1, j, flg, cnt) + 1;
//    }
//
//
//    public int numSum(int num) {
//        int sum = 0;
//        while (num != 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//        return sum;
//    }
//}


// leetcode LCR 146. 螺旋遍历二维数组
//class Solution {
//    public int[] spiralArray(int[][] array) {
//        if (array.length == 0)
//            return new int[0];
//        int x1 = 0, y1 = 0;
//        int x2 = array.length - 1, y2 = array[0].length - 1;
//        int k = 0;
//        int[] ret = new int[(x2 + 1) * (y2 + 1)];
//
//        while (x1 <= x2 && y1 <= y2) {
//            // 第一行
//            for (int i = y1; y1 <= y2; i++) {
//                ret[k++] = array[x1][i];
//            }
//            // 最后一列
//            for (int i = x1 + 1; i <= x2; i++) {
//                ret[k++] = array[i][y2];
//            }
//            // 最后一行
//            if (x1 < x2) {
//                for (int i = y2 - 1; i >= y1; i--) {
//                    ret[k++] = array[x2][i];
//                }
//            }
//            // 第一列
//            if (y1 < y2) {
//                for (int i = x2 - 1; i > x1; i--) {
//                    ret[k++] = array[i][y1];
//                }
//            }
//
//            x1++;
//            y1++;
//            x2--;
//            y2--;
//        }
//        return ret;
//
//    }
//}