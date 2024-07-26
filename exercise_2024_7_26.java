
// 收件人列表
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            in.nextLine();
//            String[] arr = new String[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = in.nextLine();
//            }
//            // System.out.println(Arrays.toString(arr));
//            print(n, arr);
//        }
//    }
//
//
//    public static void print(int n, String[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            String str = arr[i];
//            if (str.contains(" ") || str.contains(",")) {
//                System.out.print("\"" + str + "\"");
//            } else {
//                System.out.print(str);
//            }
//            if (i != n - 1) {
//                System.out.print(", ");
//            }
//        }
//
//        System.out.println();
//    }
//}









