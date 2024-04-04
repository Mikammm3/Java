
// 牛客网 WY20 两种排序方法
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            String[] arr = new String[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = in.next();
//            }
//            print(arr, n);
//        }
//    }
//
//    public static void print(String[] arr, int n) {
//        // 长度
//        boolean flg1 = true;
//        // 字典序
//        boolean flg2 = true;
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i].length() >= arr[i + 1].length()) {
//                flg1 = false;
//            }
//            if (arr[i].compareTo(arr[i + 1]) >= 0) {
//                flg2 = false;
//            }
//        }
//        if (flg1 && flg2) {
//            System.out.println("both");
//        } else if (flg1) {
//            System.out.println("lengths");
//        } else if (flg2) {
//            System.out.println("lexicographically");
//        } else {
//            System.out.println("none");
//        }
//    }
//}