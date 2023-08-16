

//LeetCode 232. 用栈实现队列
//class MyQueue {
//    private Stack<Integer> stack1;
//    private Stack<Integer> stack2;
//
//    public MyQueue() {
//        stack1 = new Stack<>();//s1用来做输入栈
//        stack2 = new Stack<>();//s2用来做输出栈
//    }
//
//    public void push(int x) {
//        stack1.push(x);
//    }
//
//    public int pop() {
//        if (empty()) {
//            return -1;
//        }
//        if (stack2.empty()) {
//            int size = stack1.size();
//            while (size != 0) {
//                int tmp = stack1.pop();
//                stack2.push(tmp);
//                size--;
//            }
//            return stack2.pop();//是top元素
//        }
//        return stack2.pop();//如果s2不为空，说明之前已经按顺序弹出元素了
//    }
//
//    public int peek() {
//        if (empty()) {
//            return -1;
//        }
//        if (stack2.empty()) {
//            int size = stack1.size();
//            while (size != 0) {
//                int tmp = stack1.pop();
//                stack2.push(tmp);
//                size--;
//            }
//            return stack2.peek();//是top元素
//        }
//        return stack2.peek();
//    }
//
//    public boolean empty() {
//        if (stack1.empty() && stack2.empty()) {
//            return true;
//        }
//        return false;
//    }
//}