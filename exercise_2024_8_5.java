
// 牛客网 五子棋
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            int n = 20;
//            char[][] arr = new char[n][n];
//            for (int i = 0; i < n; i++) {
//                String tmp = in.next();
//                arr[i] = tmp.toCharArray();
//            }
//            print(arr, n);
//        }
//    }
//
//
//    public static void print(char[][] arr, int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                // 如果是棋子，就得看看有没有五子连珠
//                if (arr[i][j] != '.') {
//                    int count = getCount(arr, i, j, arr[i][j]);
//                    if (count >= 5) {
//                        System.out.println("Yes");
//                        return;
//                    }
//                }
//            }
//        }
//        System.out.println("No");
//    }
//
//
//    public static int getCount(char[][] arr, int x, int y, char sign) {
//        // 往横向，竖向，对角线方向走看看是否五子
//        int max = -1;
//        int cx = x;
//        int cy = y;
//        // 横向  x,y - 1
//        int count = 1;
//        while (cy >= 1 && arr[cx][cy - 1] == sign) {
//            count++;
//            cy--;
//        }
//        cy = y;  // x,y + 1
//        while (cy + 1 < 20 && arr[cx][cy + 1] == sign) {
//            count++;
//            cy++;
//        }
//        if (max < count) {
//            max = count;
//        }
//
//
//        cx = x;
//        cy = y;
//        count = 1;
//        // 竖向
//        while (cx >= 1 && arr[cx - 1][cy] == sign) {
//            count++;
//            cx--;
//        }
//        cx = x;
//        while (cx + 1 < 20 && arr[cx + 1][cy] == sign) {
//            count++;
//            cx++;
//        }
//        if (max < count) {
//            max = count;
//        }
//
//
//        cx = x;
//        cy = y;
//        count = 1;
//        // 对角线
//        while (cx >= 1 && cy >= 1 && arr[cx - 1][cy - 1] == sign) {
//            count++;
//            cx--;
//            cy--;
//        }
//        cx = x;
//        cy = y;
//        while (cx + 1 < 20 && cy + 1 < 20 && arr[cx + 1][cy + 1] == sign) {
//            count++;
//            cx++;
//            cy++;
//        }
//        if (max < count) {
//            max = count;
//        }
//
//
//        // 斜对角线
//        cx = x;
//        cy = y;
//        count = 1;
//        while (cx >= 1 && cy + 1 < 20 && arr[cx - 1][cy + 1] == sign) {
//            count++;
//            cx--;
//            cy++;
//        }
//        cx = x;
//        cy = y;
//        while (cx + 1 < 20 && cy >= 1 && arr[cx + 1][cy - 1] == sign) {
//            count++;
//            cx++;
//            cy--;
//        }
//        if (max < count) {
//            max = count;
//        }
//
//        return max;
//    }
//
//
//}


//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            int n = 20;
//            char[][] arr = new char[n][n];
//            for (int i = 0; i < n; i++) {
//                String tmp = in.next();
//                arr[i] = tmp.toCharArray();
//            }
//            print(arr, n);
//        }
//    }
//
//
//    public static void print(char[][] arr, int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                // 如果是棋子，就得看看有没有五子连珠
//                if (arr[i][j] != '.') {
//                    int count = getCount(arr, i, j, arr[i][j]);
//                    if (count >= 5) {
//                        System.out.println("Yes");
//                        return;
//                    }
//                }
//            }
//        }
//        System.out.println("No");
//    }
//
//
//    public static int getCount(char[][] arr, int x, int y, char sign) {
//        // 往横向，竖向，对角线方向走看看是否五子
//        int max = -1;
//
//        // 横向  (x,y-1)   (x,y+1)
//        int count = getTheDirectionCount(arr, x, y, sign, 0, -1) + getTheDirectionCount(arr, x, y, sign, 0, 1) + 1;
//        if (max < count) {
//            max = count;
//        }
//
//        // 竖向 (x-1,y)   (x+1,y)
//        count = getTheDirectionCount(arr, x, y, sign, -1, 0) + getTheDirectionCount(arr, x, y, sign, 1, 0) + 1;
//        if (max < count) {
//            max = count;
//        }
//
//        // 对角线  (x-1,y-1)   (x+1,y+1)
//        count = getTheDirectionCount(arr, x, y, sign, -1, -1) + getTheDirectionCount(arr, x, y, sign, 1, 1) + 1;
//        if (max < count) {
//            max = count;
//        }
//
//        // 斜对角线  (x-1,y+1)  (x+1,y-1)
//        count = getTheDirectionCount(arr, x, y, sign, -1, 1) + getTheDirectionCount(arr, x, y, sign, 1, -1) + 1;
//        if (max < count) {
//            max = count;
//        }
//
//        return max;
//    }
//
//    public static int getTheDirectionCount(char[][] arr, int x, int y, char sign, int i, int j) {
//        int count = 0;
//        while (x + i < 20 && x + i >= 0 && y + j < 20 && y + j >= 0 && arr[x + i][y + j] == sign) {
//            count++;
//            x += i;
//            y += j;
//        }
//        return count;
//    }
//
//}

