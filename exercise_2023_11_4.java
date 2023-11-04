

// 牛客网 HJ74 参数解析
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//
//        print(str);
//    }
//
//    public static void print(String str) {
//        // 由示例分析可知
//        // 参数个数 = 空格个数 + 1 (不算引号内的空格)
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '"') {
//                // 遇到引号就一直往后走直到遇到另一个引号为止
//                do {
//                    i++;
//                } while (str.charAt(i) != '"');
//            }
//            if (str.charAt(i) == ' ') {
//                count++;
//            }
//        }
//        System.out.println(count + 1);
//        int flg = 1;// 判断是否进入引号
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '"') {
//                flg ^= 1;// 当碰到第一个引号时，flag就是0，
//                // 碰到第二个引号时，flag就是1
//                // 因此，flag == 0 时，在引号内部，为1则在引号外部
//            }
//            // 当不为引号也不为空格时，都可以输出
//            if (str.charAt(i) != ' ' && str.charAt(i) != '"') {
//                System.out.print(str.charAt(i));
//            }
//            // 引号里面的空格需要输出
//            if (flg == 0 && str.charAt(i) == ' ') {
//                System.out.print(str.charAt(i));
//            }
//            // 遇到引号外面的空格，就得换行
//            if (flg == 1 && str.charAt(i) == ' ') {
//                System.out.println();
//            }
//
//        }
//
//    }
//}