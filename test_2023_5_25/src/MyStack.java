import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    private int[] elem;
    private int usedSize;

    public static final int DEFAULT_CAPACITY = 10;

    public MyStack() {
        this.elem = new int[DEFAULT_CAPACITY];
    }

    public void push(int val) {
        if (elem.length == DEFAULT_CAPACITY) {
            elem = Arrays.copyOf(elem, 2 * elem.length);
        }
        elem[usedSize] = val;
        usedSize++;
    }

    public int pop() {
        if (usedSize == 0) {
            return -1;
        }
        int tmp = elem[usedSize - 1];
        usedSize--;
        return tmp;
    }

    public int peek() {
        if (usedSize == 0) {
            return -1;
        }
        return elem[usedSize - 1];
    }

    private boolean isEmpty() {
        if (usedSize > 0) {
            return false;
        } else {
            return true;
        }
    }


    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                switch (tokens[i]) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            } else {
                int tmp = Integer.parseInt(tokens[i]);
                stack.push(tmp);
            }
        }
        return stack.pop();
    }


}


//import java.util.Arrays;
//
//public class MyStack {
//    private int[] elem;
//    private int usedSize;
//
//    private static final int DEFAULT_CAPACITY = 10;
//
//    public MyStack() {
//        this.elem = new int[DEFAULT_CAPACITY];
//    }
//
//    public void push(int val) {
//        if (this.usedSize == elem.length) {
//            this.elem = Arrays.copyOf(this.elem, 2 * this.usedSize);
//        }
//        this.elem[this.usedSize] = val;
//        this.usedSize++;
//    }
//
//
//    public int pop() {
//        if (this.usedSize == 0) {
//            return -1;
//        }
//        int val = this.elem[this.usedSize - 1];
//        this.usedSize--;
//        return val;
//    }
//
//    public int peek() {
//        if (this.usedSize == 0) {
//            return -1;
//        }
//        return this.elem[this.usedSize - 1];
//    }
//
//
//    private boolean isEmpty() {
//        if (this.usedSize == 0) {
//            return true;
//        }
//        return false;
//    }
//
//
//}
//
//
//class MinStack {
//
//    private Stack<Integer> stack;
//    private Stack<Integer> minStack;
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
//            return;
//        }
//        if (val <= minStack.peek()) {
//            minStack.push(val);
//        }
//    }
//
//    public void pop() {
//
//    }
//
//    public int top() {
//        return -1;
//    }
//
//    public int getMin() {
//        return -1;
//    }
//
//
//    public boolean isEmpty() {
//        if (rear == front) {
//            return true;
//        }
//        return false;
//
//    }
//
//    public boolean isFull() {
//        int tmp = (rear + 1) % elem.length;
//        if (tmp == front) {
//            return true;
//        }
//
//        return false;
//    }
//
//
//    public boolean deQueue() {
//        //1、空的 不能出
//        if (isEmpty()) {
//            return false;
//        }
//        //2、不空 则 保存队头元素 然后front往后走
//        int val = elem[front];
//        front = (front + 1) % elem.length;
//    }
//
//    //得到队头元素
//    public int Front() {
//        if (isEmpty) {
//            return -1;
//        }
//        return elem[front];
//    }
//}
//
