


//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int a = in.nextInt();
//            String s = a + in.nextLine();
//            int i = 0;
//            Stack<Character> stack1 = new Stack<>();// 数字
//            Stack<Character> stack2 = new Stack<>();// 运算符号
//            Stack<Character> stack3 = new Stack<>();// 运算
//
//            for (char c : s.toCharArray()) {
//                if (c < '0' || c > '9') {
//                    // 运算
//                    stack2.push(c);
//                } else stack1.push(c);
//                stack3.push(c);
//            }
//            while (!stack3.empty()) {
//                char top = stack3.pop();
//                if (top < '0' || top > '9') {
//                    // 运算
//                    char aa = stack1.pop();
//                    char bb = stack1.pop();
//                    if (top == '+') {
//                        int cc = (aa - '0') + (bb - '0');
//                    }
//                }
//            }
//
//            // System.out.println(s);
//
//        }
//    }
//}