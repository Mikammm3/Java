


//LeetCode 20. 有效的括号
//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            //左括号
//            if (ch == '(' || ch == '[' || ch == '{') {
//                stack.push(ch);
//            } else {
//                //右括号
//                if (!stack.empty()) {
//                    char top = stack.peek();
//                    if (top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']') {
//                        stack.pop();
//                    } else {
//                        return false;
//                    }
//                } else {
//                    //栈为空，没有左括号
//                    return false;
//                }
//            }
//        }
//        if (!stack.empty()) {
//            return false;
//        }
//        return true;
//    }
//}