
// 牛客网 OR59 字符串中找出连续最长的数字串
//import java.util.*;
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
//        // 可以定义两个字符串
//        String cur = "";// 这个用来存现在的数字串
//        String ret = "";// 这个用来返回最长的数字串
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            // 遇到数字就拼接上cur
//            // 遇到字母就比较 cur.len 和 ret.len
//            // 然后 cur 再置空
//            if (ch >= '0' && ch <= '9') {
//                cur += ch + "";
//            } else {
//                if (cur.length() > ret.length()) {
//                    ret = cur;
//                }
//                cur = "";
//            }
//        }
//        // 如果最长数字串是在最后一个，则需要再判断一次
//        if (cur.length() > ret.length()) {
//            ret = cur;
//        }
//        System.out.println(ret);
//    }
//}