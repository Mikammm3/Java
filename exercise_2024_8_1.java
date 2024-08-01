
// 牛客网 红与黑
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//
//    // 记录深搜黑色瓷砖数量
//    public static int count = 0;
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int m = in.nextInt();
//            int n = in.nextInt();
//
//            // 记录起始位置
//            int x = -1;
//            int y = -1;
//            char[][] arr = new char[m][n];
//            boolean[][] flg = new boolean[m][n];
//            for (int i = 0; i < m; i++) {
//                String str = in.next();
//                arr[i] = str.toCharArray();
//
//                if (str.contains("@")) {
//                    for (int j = 0; j < n; j++) {
//                        char c = arr[i][j];
//                        if (c == '@') {
//                            x = i;
//                            y = j;
//                        }
//                    }
//                }
//            }
//
//            // 防止 count 叠加多次测试用例的运行结果
//            count = 0;
//
//            dfs(arr, flg, x, y, m, n);
//            System.out.println(count);
//        }
//    }
//
//
//    public static void dfs(char[][] arr, boolean[][] flg, int i, int j, int m, int n) {
//        // 越界或格子已经走过或白色瓷砖
//        if (i < 0 || i >= m || j < 0 || j >= n || flg[i][j] || arr[i][j] == '#') {
//            return;
//        }
//        count++;
//        flg[i][j] = true;
//        // 再往四个方向走
//        dfs(arr, flg, i - 1, j, m, n);
//        dfs(arr, flg, i + 1, j, m, n);
//        dfs(arr, flg, i, j - 1, m, n);
//        dfs(arr, flg, i, j + 1, m, n);
//    }
//}