


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int a = in.nextInt();
//            String str = "";
//            for (int i = 0; i < n; i++) {
//                int tmp = in.nextInt();
//                if (i != n - 1) {
//                    str += tmp + " ";
//                } else {
//                    str += tmp + "";
//                }
//            }
//            print(str, n, a);
//        }
//    }
//
//    public static void print(String str, int n, int a) {
//        int[] arr = new int[n];
//        int i = 0;
//        int len = str.length();
//        int count = 0;
//        int j = 0;
//        while (i < len) {
//            int num = 0;
//            while (i < len && str.charAt(i) != ' ') {
//                num = num * 10 + str.charAt(i) - '0';
//                i++;
//            }
//            if (i >= len) {
//                if (num <= a) {
//                    a += num;
//                } else {
//                    a += max(a, num);
//                }
//                count++;
//            } else {
//                if (num <= a) {
//                    a += num;
//                } else {
//                    a += max(a, num);
//                }
//                i++;
//                count++;
//            }
//
//        }
//        System.out.println(a);
//    }
//
//
//    public static int max(int a, int b) {
//        int c = a % b;
//        while (c != 0) {
//            a = b;
//            b = c;
//            c = a % b;
//        }
//        return b;
//    }
//}


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
//        if (str == null || str.length() == 0) {
//            return;
//        }
//        int[] hash = new int[26];
//        boolean flg = true;
//        for (int i = 0; i < str.length(); i++) {
//            hash[str.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (hash[str.charAt(i) - 'a'] == 1) {
//                System.out.println(str.charAt(i));
//                return;
//            }
//        }
//        System.out.println(-1);
//
//    }
//}