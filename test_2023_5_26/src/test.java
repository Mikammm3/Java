import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    /**
     * 选择排序：
     *
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }


}

//牛客网 JZ31 栈的压入、弹出序列
class Solution {
    public boolean IsPopOrder(int[] push, int[] pop) {
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        //用i遍历push数组，j遍历pop数组，
        //将push数组的所有数字都放入栈中，然后再peek栈
        //如果peek栈的元素和pop数组的j下标元素相同
        //就将该元素出栈
        //遍历完i后，如果栈不是空的就返回false
        for (int i = 0; i < push.length; i++) {
            stack.push(push[i]);
            while (!stack.empty() && j < pop.length && stack.peek() == pop[j]) {
                stack.pop();
                j++;
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}


class MinStack {
    private Stack<Integer> stack;//一个是正常栈
    private Stack<Integer> minStack;//一个存有可能是最小值的栈

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.empty()) {
            //如果是第一次入栈，那么两个栈都得入
            minStack.push(val);
        } else {
            int tmp = minStack.peek();
            //如果val小于等于minStack栈顶元素，那就入栈
            if (val <= tmp) {
                minStack.push(val);
            }
        }
    }

    public void pop() {
        if (stack.empty()) {
            return;
        }
        int tmp = minStack.peek();
        int top = stack.pop();
        if (tmp == top) {
            //如果正常栈和最小栈元素相等，那就都得出栈
            //不是的话就正常栈出栈
            minStack.pop();
        }
    }

    //获取正常栈的栈顶元素
    public int top() {
        if (stack.empty()) {
            return -1;
        }
        return stack.peek();
    }

    //获取正常栈的栈顶元素
    public int getMin() {
        if (minStack.empty()) {
            return -1;
        }
        return minStack.peek();
    }
}