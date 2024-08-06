
// 牛客网 走迷宫
//import java.util.*;
//
//class Position {
//    public int x;
//    public int y;
//    public int count;// 表示从入口走到 (x, y) 所需要的步数
//
//    public Position(int x, int y, int count) {
//        this.x = x;
//        this.y = y;
//        this.count = count;
//    }
//}
//
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            int n = 10;
//            char[][] arr = new char[n][n];
//            // 标记遍历过的数组
//            boolean[][] flg = new boolean[n][n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = in.next().toCharArray();
//            }
//
//            System.out.println(bfs(arr, flg, n));
//        }
//    }
//
//    public static int bfs(char[][] arr, boolean[][] flg, int n) {
//        // 方向数组：下 右 左 上
//        int[][] dir = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
//        // 用队列来实现，将起点 (0,1) 入队
//        Queue<Position> queue = new LinkedList<>();
//        queue.offer(new Position(0, 1, 0));
//
//        // 广度优先遍历
//        while (!queue.isEmpty()) {
//            // 弹出坐标，然后标记坐标
//            // 并将与该坐标连接的其他坐标(下右左上)也添加进队列中
//            Position position = queue.poll();
//
//
//            // 标记该坐标
//            flg[position.x][position.y] = true;
//
//            if (position.x == 9 && position.y == 8) {
//                // 此时就说明找到了最短路径
//                return position.count;
//            }
//            // 添加下，右，左，上 四个下标
//            for (int i = 0; i < 4; i++) {
//                Position next = new Position(position.x + dir[i][0], position.y + dir[i][1], position.count + 1);
//
//                // 如果 next 坐标合法，并且没有遍历过，并且是通路，那么就将下标入队
//                if (next.x >= 0 && next.x < n && next.y >= 0 && next.y < n &&
//                        !flg[next.x][next.y] && arr[next.x][next.y] == '.')
//                    queue.offer(next);
//            }
//        }
//        return 0;
//    }
//}