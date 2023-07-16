import java.util.Stack;

class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        int size = s1.size();
        if (s2.empty()) {
            while (size != 0) {
                int tmp = s1.pop();
                s2.push(tmp);
                size--;
            }
            return s2.pop();
        }
        return s2.pop();
    }

    public int peek() {
        if (empty()) {
            return -1;
        }
        if (s2.empty()) {
            int size = s1.size();
            while (size != 0) {
                int tmp = s1.pop();
                s2.push(tmp);
                size--;
            }
            return s2.peek();
        }
        return s2.peek();
    }

    public boolean empty() {
        if (s1.empty() && s2.empty()) {
            return true;
        }
        return false;
    }
}