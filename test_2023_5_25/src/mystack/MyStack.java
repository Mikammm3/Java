package mystack;

import java.util.Arrays;

public class MyStack {
    private int[] elem;
    private int usedSize;//表示当前数组存放元素个数

    private static final int DEFAULT_CAPACITY = 10;//数组的默认容量

    public MyStack() {
        this.elem = new int[DEFAULT_CAPACITY];
    }

    //判空
    public boolean empty() {
        return this.usedSize == 0;
    }

    //返回栈的元素个数
    public int size() {
        return this.usedSize;
    }


    //出栈
    public int pop() {
        //栈为空，删不了
        if (empty()) {
            return -1;
        }
        //栈不为空，删除
        int top = this.elem[this.usedSize - 1];
        usedSize--;
        return top;
    }


    //返回栈顶元素
    public int peek() {
        //栈为空
        if (empty()) {
            return -1;
        }
        return elem[usedSize - 1];
    }

    //入栈
    public void push(int val) {
        //数组满了，得扩容
        if (this.usedSize == this.elem.length) {
            //扩容
            this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
        }
        this.elem[usedSize] = val;
        usedSize++;
    }

}



