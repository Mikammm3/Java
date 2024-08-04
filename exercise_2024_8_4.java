
// 牛客网 Emacs计算器
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
//            int ans = emacs(n, str);
//            System.out.println(ans);
//        }
//    }
//
//
//    public static Integer emacs(int n, String str) {
//        Stack<Integer> stack = new Stack<>();
//        String option = "+-*/";
//        String[] num = str.split(" ");
//        for (int i = 0; i < num.length; i++) {
//            String s = num[i];
//            if (option.contains(s)) {
//                // 如果是操作符，则出栈出两次得到 num2 和 num1，然后计算出结果，再把结果入栈
//                int num2 = stack.pop();
//                int num1 = stack.pop();
//                int ret = 0;
//                switch (s) {
//                    case "+":
//                        ret = num1 + num2;
//                        break;
//                    case "-":
//                        ret = num1 - num2;
//                        break;
//                    case "*":
//                        ret = num1 * num2;
//                        break;
//                    case "/":
//                        ret = num1 / num2;
//                        break;
//                }
//                stack.push(ret);
//
//            } else {
//                // 是数字就入栈
//                stack.push(Integer.valueOf(s));
//            }
//        }
//        return stack.pop();
//    }
//
//}