

//import java.util.*;
//
//public class Bonus {
//    public int getMost(int[][] board) {
//        boolean[][] flg = new boolean[6][6];// false
//        return dfs(board, 0, 0, flg);
//
//    }
//
//    public int dfs(int[][] board, int i, int j, boolean[][] flg) {
//        if (i >= 6 || j >= 6) {
//            return 0;
//        } else if (flg[i][j]) {
//            return 0;
//        } else {
//            flg[i][j] = true;
//            int val = board[i][j];
//            int d = dfs(board, i + 1, j, flg);
//            int r = dfs(board, i, j + 1, flg);
//            flg[i][j] = false;
//            return val + (d > r ? d : r);
//        }
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int m = in.nextInt();
//            int[][] arr = new int[n][m];
//            boolean[][] flg = new boolean[n][m];
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    arr[i][j] = in.nextInt();
//                    if (arr[i][j] == 1) {
//                        flg[i][j] = true;
//                    }
//                }
//            }
//            dfs(arr, 0, 0, flg);
//
//        }
//    }
//
//
//    public static boolean dfs(int[][] board, int i, int j, boolean[][] flg) {
//        if (i >= board.length || j >= board[0].length) {
//            return false;
//        } else if (flg[i][j] || board[i][j] == 1) {
//            return false;
//        } else {
//            flg[i][j] = true;
//            System.out.printf("(%d,%d)\n", i, j);
//            int val = board[i][j];
//            boolean d = dfs(board, i + 1, j, flg);
//            boolean r = dfs(board, i, j + 1, flg);
//            flg[i][j] = false;
//            return d ? d : r;
//        }
//    }
//}