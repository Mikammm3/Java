

//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int step = cul(n);
//            System.out.println(step);
//        }
//    }
//
//    public static int cul(int n) {
//        if (n == 0 || n == 1) {
//            return 0;
//        }
//        int a = 0;
//        int b = 1;
//        int c = 1;
//        int tmp = 0;
//        while (c < n) {
//            c = a + b;
//            if (c < n) {
//                tmp = n - c;
//            }
//            a = b;
//            b = c;
//        }
//        if (tmp >= 0 && (c - n) > tmp) {
//            return tmp;
//        }
//        return c - n;
//    }
//}


//import java.util.*;
//
//public class Parenthesis {
//    public boolean chkParenthesis(String A, int n) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < A.length(); i++) {
//            char ch = A.charAt(i);
//            if (ch == '(' || ch == '[' || ch == '{') {
//                stack.push(ch);
//            } else if (ch == ')' || ch == ']' || ch == '}') {
//                if (!stack.isEmpty() && ((ch == ')' && stack.peek() == '(') ||
//                        (ch == ']' && stack.peek() == '[') ||
//                        (ch == '}' && stack.peek() == '{'))) {
//                    stack.pop();
//                    n -= 2;
//                } else {
//                    return false;
//                }
//            } else {
//                return false;
//            }
//        }
//        if (n <= 0) {
//            return true;
//        }
//        return false;
//    }
//}