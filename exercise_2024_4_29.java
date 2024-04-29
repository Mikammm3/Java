//
//
//
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
//            String str = in.nextLine();
//            print(n, str);
//        }
//    }
//
//
//    public static void print(int n, String str) {
//        if (n == 1) {
//            System.out.println("yes");
//            System.out.println(str);
//            return;
//        }
//        char[] arr = str.toCharArray();
//        Arrays.sort(arr);
//        String t = new String(arr);
//        for (int i = 0; i < arr.length; i++) {
//            int j = i - 1;
//            int k = i + 1;
//            boolean flg = false;
//            if (j >= 0 && j < arr.length) {
//                if (arr[i] == arr[j]) {
//                    flg = true;
//                }
//            }
//            if (k >= 0 && k < arr.length) {
//                if (arr[i] == arr[k]) {
//                    flg = true;
//                }
//            }
//            if (flg && k >= 0 && k < arr.length) {
//                char tmp = arr[i];
//                arr[i] = arr[k];
//                arr[k] = tmp;
//            }
//        }
//        String tmp = new String(arr);
//        if (tmp.equals(t)) {
//            System.out.println("no");
//            return;
//        }
//        System.out.println("yes");
//        System.out.println(tmp);
//    }
//}
