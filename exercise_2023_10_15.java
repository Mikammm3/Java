


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String str = in.nextLine();
//            print(str);
//        }
//    }
//
//
//    public static void print(String str) {
//
//        char[] arr = str.toCharArray();
//        int len = arr.length;
//        int count = 0;
//        int i = 0;
//        while (i < len) {
//            if (arr[i] == '"') {
//                i++;
//                while (i < len && arr[i] != '"') {
//                    i++;
//                }
//                count++;
//                i += 2;
//                if (i >= len) {
//                    break;
//                }
//            } else {
//                while (i < len && arr[i] != ' ') {
//                    i++;
//                }
//                count++;
//                i++;
//                if (i >= len) {
//                    break;
//                }
//            }
//        }
//        i = 0;
//        System.out.println(count);
//        while (i < len) {
//            if (arr[i] == '"') {
//                i++;// 跳过这个 "
//                while (i < len && arr[i] != '"') {
//                    System.out.print(arr[i]);
//                    i++;
//                }
//                i += 2;
//                if (i >= len) {
//                    break;
//                }
//                System.out.println();
//            } else {
//                while (i < len && arr[i] != ' ') {
//                    System.out.print(arr[i]);
//                    i++;
//                }
//                i++;
//                if (i >= len) {
//                    break;
//                }
//                System.out.println();
//            }
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
//            print(n, m);
//        }
//    }
//
//    public static void print(int n, int m) {
//        // int n = jump(n, m);
//        if (n == m) {
//            System.out.println(0);
//        } else if (n > m) {
//            System.out.println(-1);
//        } else {
//
//            int min = jump(n, m);
//
//            // int min = 100000;
//            // for (int i = 2; i < n; i++) {
//            //     if (n % i == 0) {
//            //         // 写一个方法，从 n 到 m 要用多少步的方法
//            //         int flg = jump(n + i, m);
//            //         int count = flg + 1;
//            //         if (flg >= 0 && count < min) {
//            //             min = count;
//            //         }
//
//            //     }
//            // }
//            System.out.println(min + 1);
//        }
//    }
//
//    // 24 24     4
//    public static int jump(int n, int m) {
//        if (n == m) {
//            return 0;
//        }
//        if (n > m) {
//            return -1;
//        } else {
//            int cha = m - n;//10
//            int i = n - 1;//10
//            while (i > 1 && cha % i != 0) {
//                i--;
//            }
//            return jump(n + i, m) + 1;//2
//        }
//    }
//}