import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //创建一个栈
        Stack<Integer> stack = new Stack<>();
        //入栈
        stack.push(1);
        //看看栈顶元素但不删除
        int top = stack.peek();
        System.out.println(top);
        //删除栈顶元素
        stack.pop();
        //如果栈不为空，就看看栈里有几个元素
        if (!stack.empty()) {
            int size = stack.size();
            System.out.println(size);
        }
    }
}

