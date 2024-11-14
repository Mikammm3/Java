
// leetcode 150. 逆波兰表达式求值
//class Solution {
//    public int evalRPN(String[] tokens) {
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < tokens.length; i++) {
//            if (tokens[i].equals("+")) {
//                int b = stack.pop();
//                int a = stack.pop();
//                stack.push(a + b);
//            } else if (tokens[i].equals("-")) {
//                int b = stack.pop();
//                int a = stack.pop();
//                stack.push(a - b);
//            } else if (tokens[i].equals("*")) {
//                int b = stack.pop();
//                int a = stack.pop();
//                stack.push(a * b);
//
//            } else if (tokens[i].equals("/")) {
//                int b = stack.pop();
//                int a = stack.pop();
//                stack.push(a / b);
//            } else {
//                stack.push(Integer.valueOf(tokens[i]));
//            }
//        }
//        return stack.pop();
//    }
//}