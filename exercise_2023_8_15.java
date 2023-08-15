

//LeetCode 225. 用队列实现栈
//class MyStack {
//    private Queue<Integer> q1;
//    private Queue<Integer> q2;
//
//    public MyStack() {
//        q1 = new LinkedList<>();
//        q2 = new LinkedList<>();
//    }
//
//    public void push(int x) {
//        if (empty()) {
//            q1.offer(x);
//        } else if (!q1.isEmpty()) {
//            q1.offer(x);
//        } else {
//            q2.offer(x);
//        }
//    }
//
//    public int pop() {
//        if (empty()) {
//            return -1;
//        }
//        if (!q1.isEmpty()) {
//            int count = q1.size() - 1;
//            while (count != 0) {
//                int tmp = q1.poll();
//                q2.offer(tmp);
//                count--;
//            }
//            return q1.poll();
//        }
//        int count = q2.size() - 1;
//        while (count != 0) {
//            int tmp = q2.poll();
//            q1.offer(tmp);
//            count--;
//        }
//        return q2.poll();
//    }
//
//    public int top() {
//        if (empty()) {
//            return -1;
//        }
//        int tmp = 0;
//        if (!q1.isEmpty()) {
//            int count = q1.size();
//            while (count != 0) {
//                tmp = q1.poll();
//                q2.offer(tmp);
//                count--;
//            }
//            return tmp;
//        }
//        int count = q2.size();
//        while (count != 0) {
//            tmp = q2.poll();
//            q1.offer(tmp);
//            count--;
//        }
//        return tmp;
//    }
//
//    public boolean empty() {
//        if (q1.isEmpty() && q2.isEmpty()) {
//            return true;
//        }
//        return false;
//    }
//}