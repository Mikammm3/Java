


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
//    public static void print(int n) {
//        int count = getCount(1, n);
//        System.out.println(count);
//    }
//
//
//    public static int getCount(int rabbit, int n) {
//        if (n < 3) {
//            return rabbit;
//        } else {
//            return rabbit + getCount(1, n - 2) + 1;
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
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            String s1 = in.next();
//            String s2 = in.next();
//            System.out.println(false);
//            //print(s1, s2);
//        }
//    }
//
//
//    public static void print(String s1, String s2) {
//        char[] arr1 = s1.toUpperCase().toCharArray();
//        char[] arr2 = s2.toUpperCase().toCharArray();
//        int len1 = arr1.length;
//        int len2 = arr2.length;
//        int i = 0;
//        int j = 0;
//        while (j < len2) {
//            while (i < len1 && j < len2 && arr1[i] == arr2[j]) {
//                i++;
//                j++;
//            }
//            if (i >= len1 && j < len2) {
//                System.out.println(false);
//                return;
//            } else if (j >= len2) {
//                System.out.println(true);
//                return;
//            } else {
//                char ch1 = arr1[i];
//                char ch2 = arr2[j];
//                if ((ch2 >= '0' && ch2 <= '9') || (ch2 >= 'A' && ch2 <= 'Z')) {
//                    if (ch1 == '?') {
//                        i++;
//                        j++;
//                    } else if (ch1 == '*') {
//                        i++;
//                        if (arr1[i] == arr2[j] && i + 1 < len1 && j + 1 < len2 &&
//                                arr1[i + 1] == arr2[j + 1]) {
//
//                        } else {
//                            char tmp = ch2;
//                            while (j < len2 && arr2[j] == tmp) {
//                                j++;
//                            }
//                            if (j >= len2) {
//                                System.out.println(true);
//                                return;
//                            }
//                        }
//                    }
//                } else {
//                    System.out.println(false);
//                    return;
//                }
//            }
//        }
//        System.out.println(true);
//    }
//}