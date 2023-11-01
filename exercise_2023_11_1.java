

//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int[] val = new int[n];
//            for (int i = 0; i < n; i++) {
//                val[i] = in.nextInt();
//            }
//            int l = in.nextInt();
//            int r = in.nextInt();
//
//            print(n, val, l, r);
//        }
//    }
//
//
//    public static void print(int n, int[] arr, int left, int right) {
//        int indexStart = left - 1;
//        int indexEnd = right - 1;
//        for (int i = 0; i < indexStart; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for (int i = indexEnd; i >= indexStart; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        for (int i = indexEnd + 1; i < n; i++) {
//            System.out.print(arr[i] + " ");
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
//            if (n == 0) {
//                break;
//            }
//            print(n);
//        }
//    }
//
//    public static void print(int n) {
//        if (n == 1) {
//            System.out.println("1 1");
//            return;
//        }
//        for (int i = 2; i <= 1000000000; i++) {
//            int sum = 0;// 分出去的数量
//            int all = i;// 总桃子
//            int laohouzi = 0;// 老猴子所得
//            boolean flg = true;
//            int j = 0;
//            while (j < n) {
//                int tmp = (all - 1);
//                if (tmp % 5 == 0) {
//                    sum += tmp / 5;
//                    laohouzi++;
//                    all = all - 1 - (all - 1) / 5;
//                    j++;
//                } else {
//                    flg = false;
//                    break;
//                }
//            }
//            if (flg && j >= n) {
//                System.out.println(i + " " + (laohouzi + all));
//                return;
//            }
//        }
//    }
//}