import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //迭代器遍历
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        //迭代器倒着打印
        ListIterator<Integer> it2 = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println();

        /*//foreach遍历
        for (Integer x : list) {
            System.out.print(x + " ");
        }
        System.out.println();*/
    }
}


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
//}