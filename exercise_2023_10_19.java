


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            print(n);
//        }
//    }
//
//
//    //0 0 0 1 0 0 0
//    //0 0 1 1 1 0 0
//    //0 1 2 3 2 1 0
//    public static void print(int n) {
//        int[][] arr = new int[n][2 * n + 1];
//        arr[0][n] = 1;
//        int tmp = n;
//        for (int i = 1; i < arr.length; i++) {
//            int j = 0;
//            while (j < tmp - 1) {
//                j++;
//            }
//            int count = 0;
//            for (; j <= n + i; j++) {
//                int lu = 0;
//                int u = 0;
//                int ru = 0;
//
//                lu = arr[i - 1][j - 1];
//                u = arr[i - 1][j];
//                ru = arr[i - 1][j + 1];
//
//                arr[i][j] = lu + u + ru;
//                count++;
//                if (i == n - 1 && arr[i][j] % 2 == 0 && arr[i][j] != 0) {
//                    System.out.println(count);
//                    return;
//                }
//            }
//            tmp--;
//        }
//        System.out.println(-1);
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        String str = in.nextLine();
//        String c = in.next();
//        print(str.toUpperCase(), c.toUpperCase().charAt(0));
//    }
//
//
//    public static void print(String str, char c) {
//        int count = 0;
//        for (char x : str.toCharArray()) {
//            if (x == c) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}