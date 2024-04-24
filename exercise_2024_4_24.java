
// 练习
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
//            int x = in.nextInt();
//            int y = in.nextInt();
//            // (x1 - x)^2 + (y1 - y) ^ 2 = 9
//            // x1 = x; y1 = 3 + y;
//            // x1 = 3 + x; y1 = y;
//            int[][] arr = new int[n][m];
//            boolean[][] flg = new boolean[n][m];
//            int ret = dfs(arr, 0, 0, x, y, flg, n, m, 0);
//            System.out.println(ret);
//        }
//    }
//
//
//    public static int dfs(int[][] arr, int i, int j, int x, int y, boolean[][] flg,
//                          int n, int m, Integer count) {
//        if (i < 0 || i >= n || j < 0 || j >= m || flg[i][j] == true || (i == x &&
//                j == y + 3) || (i == x + 3 && j == y)) {
//            return 0;
//        }
//        flg[i][j] = true;
//        if (i == n - 1 && j == m - 1) {
//            count++;
//        } else {
//            count += dfs(arr, i + 1, j, x, y, flg, n, m, count);
//            count += dfs(arr, i, j + 1, x, y, flg, n, m, count);
//        }
//        flg[i][j] = false;
//        return count;
//    }
//}