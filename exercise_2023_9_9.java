
//牛客网 JZ13 机器人的运动范围
//import java.util.*;
//
//public class Solution {
//    //计算每一位的数字之和
//    public int cal(int n) {
//        int sum = 0;
//        while (n != 0) {
//            sum += (n % 10);
//            n /= 10;
//        }
//        return sum;
//    }
//
//    //答案
//    public int res = 0;
//
//    public int movingCount(int threshold, int rows, int cols) {
//        if (threshold <= 0) {
//            return 1;
//        }
//        boolean[][] flg = new boolean[rows][cols];
//        dfs(threshold, 0, 0, rows, cols, flg);
//        return res;
//    }
//
//    public void dfs(int threshold, int i, int j, int rows, int cols,
//                    boolean[][] flg) {
//        //越界
//        if (i < 0 || i >= rows || j < 0 || j >= cols || flg[i][j] == true) {
//            return;
//        }
//        //大于
//        if (cal(i) + cal(j) > threshold) {
//            return;
//        }
//        res += 1;
//        flg[i][j] = true;
//        //上下左右四个方向走
//        dfs(threshold, i + 1, j, rows, cols, flg);
//        dfs(threshold, i - 1, j, rows, cols, flg);
//        dfs(threshold, i, j + 1, rows, cols, flg);
//        dfs(threshold, i, j - 1, rows, cols, flg);
//    }
//}