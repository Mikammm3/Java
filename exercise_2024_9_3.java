
// leetcode LCR 147. 最小栈
//class MinStack {
//    // 可以用一个栈当正常栈
//    // 一个栈当最小栈
//    Stack<Integer> s1 = new Stack<>();
//    Stack<Integer> s2 = new Stack<>();
//
//
//    /**
//     * initialize your data structure here.
//     */
//    public MinStack() {
//        s1 = new Stack<>();
//        s2 = new Stack<>();
//    }
//
//    public void push(int x) {
//        s1.push(x);
//        if (s2.empty()) {
//            s2.push(x);
//        } else {
//            int top = s2.peek();
//            if (x <= top) {
//                s2.push(x);
//            }
//        }
//    }
//
//    public void pop() {
//        if (s1.empty()) {
//            return;
//        }
//        int top = s1.pop();
//        if (!s2.empty() && s2.peek() == top) {
//            s2.pop();
//        }
//
//    }
//
//    public int top() {
//        if (s1.empty()) {
//            return -1;
//        }
//        return s1.peek();
//    }
//
//    public int getMin() {
//        if (s2.empty()) {
//            return -1;
//        }
//        return s2.peek();
//    }
//}
//
///**
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(x);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.getMin();
// */


// leetcode LCR 125. 图书整理 II
//class CQueue {
//    // 用栈来实现队列
//    Stack<Integer> s1 = new Stack<>();
//    Stack<Integer> s2 = new Stack<>();
//
//
//    public CQueue() {
//        s1 = new Stack<>();
//        s2 = new Stack<>();
//    }
//
//    public void appendTail(int value) {
//        s1.push(value);
//    }
//
//    public int deleteHead() {
//        if (s1.empty() && s2.empty()) {
//            return -1;
//        }
//        if (s2.empty()) {
//            while (!s1.empty()) {
//                s2.push(s1.pop());
//            }
//        }
//        return s2.pop();
//    }
//}