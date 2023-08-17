

//LeetCode 155. 最小栈
//class MinStack {
//    Stack<Integer> stack;
//    Stack<Integer> minStack;
//
//    public MinStack() {
//        stack = new Stack<>();
//        minStack = new Stack<>();
//    }
//
//    public void push(int val) {
//        stack.push(val);
//        if (minStack.empty()) {
//            minStack.push(val);
//        } else {
//            int tmp = minStack.peek();
//            if (val <= tmp) {
//                minStack.push(val);
//            }
//        }
//    }
//
//    public void pop() {
//        if (stack.empty()) {
//            return;
//        }
//        int tmp = stack.pop();
//        if (!minStack.empty() && tmp == minStack.peek()) {
//            minStack.pop();
//        }
//    }
//
//    public int top() {
//        if (stack.empty()) {
//            return -1;
//        }
//        return stack.peek();
//    }
//
//    public int getMin() {
//        if (minStack.empty()) {
//            return -1;
//        }
//        return minStack.peek();
//    }
//}
