

// leetcode LCR 184. 设计自助结算系统
//class Checkout {
//    // 可以用队列和双端队列实现
//    Queue<Integer> queue;
//    // 双端队列存储可能是最大值的元素，并且按照降序存储
//    Deque<Integer> maxQueue;
//
//    public Checkout() {
//        queue = new LinkedList<>();
//        maxQueue = new LinkedList<>();
//    }
//
//    public int get_max() {
//        if (maxQueue.isEmpty()) {
//            return -1;
//        }
//        // 取出双端队列的头元素就是最大值
//        return maxQueue.peekFirst();
//
//    }
//
//    public void add(int value) {
//        queue.offer(value);
//        // 如果双端队列为空，则当前元素可能是最大值，入队
//        if (maxQueue.isEmpty()) {
//            maxQueue.offerLast(value);
//            return;
//        }
//        // 如果不为空，则需要判断，如果当前 val 大于双端队列的尾巴元素，
//        // 说明此时双端队列的尾巴元素一定不可能是最大值
//        // 那就把双端队列的尾巴元素删掉，然后把 val 添加进来
//        while (!maxQueue.isEmpty() && value > maxQueue.peekLast()) {
//            maxQueue.pollLast();
//        }
//        maxQueue.offerLast(value);
//    }
//
//    public int remove() {
//        if (queue.isEmpty()) {
//            return -1;
//        }
//        int top = queue.poll();
//        if (top == maxQueue.peekFirst()) {
//            maxQueue.pollFirst();
//        }
//        return top;
//    }
//}
//
///**
// * Your Checkout object will be instantiated and called as such:
// * Checkout obj = new Checkout();
// * int param_1 = obj.get_max();
// * obj.add(value);
// * int param_3 = obj.remove();
// */


// leetcode LCR 148. 验证图书取出顺序
//class Solution {
//    public boolean validateBookSequences(int[] putIn, int[] takeOut) {
//        Stack<Integer> stack = new Stack<>();
//        int j = 0;
//        for (int i = 0; i < putIn.length; i++) {
//            stack.push(putIn[i]);
//            while (!stack.empty() && stack.peek() == takeOut[j]) {
//                stack.pop();
//                j++;
//            }
//        }
//        if (stack.empty()) {
//            return true;
//        }
//        return false;
//    }
//}