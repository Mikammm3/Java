


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            String[] strs = new String[n];
//            for (int i = 0; i < n; i++) {
//                strs[i] = in.nextLine();
//            }
//            boolean flg1 = length(strs);
//            boolean flg2 = lexi(strs);
//            // System.out.println(flg1);
//            // System.out.println(flg2);
//            if (flg1 && flg2) {
//                System.out.println("both");
//            } else if (!flg1 && !flg2) {
//                System.out.println("none");
//            } else if (flg1) {
//                System.out.println("lexicographically");
//            } else {
//                System.out.println("lengths");
//            }
//        }
//    }
//
//    public static boolean length(String[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i].length() > arr[i + 1].length()) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static boolean lexi(String[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (!isSort(arr[i], arr[i + 1])) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean isSort(String s1, String s2) {
//        int i = 0;
//        int j = 0;
//        while (i < s1.length() && j < s2.length() && s1.charAt(i) == s2.charAt(j)) {
//            i++;
//            j++;
//        }
//        if (i == s1.length() || j == s2.length()) {
//            return true;
//        }
//        if (s1.charAt(i) < s2.charAt(j)) {
//            return true;
//        } else {
//            return false;
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
//            int a = in.nextInt();
//            int b = in.nextInt();
//            print(a, b);
//        }
//    }
//
//    public static void print(int a, int b) {
//        int x = a;
//        int y = b;
//        int c = a % b;
//        while (c != 0) {
//            a = b;
//            b = c;
//            c = a % b;
//        }
//        int n = x * y / b;
//        System.out.println(n);
//
//    }
//}