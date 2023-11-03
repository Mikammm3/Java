


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String s = in.nextLine();
//            print(s);
//        }
//    }
//
//    public static void print(String str) {
//        String arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch >= 'A' && ch <= 'Z') {
//                int index = arr.indexOf(ch);
//                int newIndex = (index - 5);
//                if (newIndex < 0) {
//                    newIndex += 26;
//                }
//                System.out.print(arr.charAt(newIndex));
//            } else {
//                System.out.print(ch);
//            }
//        }
//        System.out.println();
//
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
//            if (sushu(n)) {
//                System.out.println(2);
//                continue;
//            }
//            print(n);
//        }
//    }
//
//    public static void print(int n) {
//        int count = 0;
//        for (int i = 2; i <= n; i++) {
//            if (n % i == 0) {
//                while (n % i == 0) {
//                    n /= i;
//                }
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//
//    public static boolean sushu(int n) {
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}