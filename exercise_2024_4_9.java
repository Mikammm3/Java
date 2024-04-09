
// 牛客网  参数解析
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
//    public static void print(String str) {
//        int i = 0;
//        int len = str.length();
//        // count 是用来记录参数个数的
//        int count = 0;
//        while (i < len) {
//            if (str.charAt(i) == '"') {
//                count++;
//                // 此时说明遇到了一个被""括起来的命令
//                i++;// 跳过 "
//                while (i < len && str.charAt(i) != '"') {
//                    i++;
//                }
//                i += 2; // 跳过"
//            } else {
//                while (i < len && str.charAt(i) != ' ') {
//                    i++;
//                }
//                count++;
//                i++;// 跳过空格
//            }
//        }
//
//
//        System.out.println(count);
//        i = 0;
//        while (i < len) {
//            if (str.charAt(i) == '"') {
//                // 此时说明遇到了一个被""括起来的命令
//                i++;// 跳过 "
//                while (i < len && str.charAt(i) != '"') {
//                    System.out.print(str.charAt(i));
//                    i++;
//                }
//                i += 2; // 跳过"
//                System.out.println();
//            } else {
//                while (i < len && str.charAt(i) != ' ') {
//                    System.out.print(str.charAt(i));
//                    i++;
//                }
//                i++;// 跳过空格
//                System.out.println();
//            }
//        }
//    }
//}