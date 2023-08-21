import java.util.Comparator;
import java.util.PriorityQueue;


class IntCmp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //创建大根堆需要的比较器
        return o2.compareTo(o1);
    }
}


public class Test {
    public static void main(String[] args) {
        //默认情况下是小根堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new IntCmp());
        priorityQueue.offer(10);
        priorityQueue.offer(5);
        priorityQueue.offer(9);
        priorityQueue.offer(7);
        priorityQueue.offer(77);

        System.out.println(priorityQueue.poll());

    }


    public static void main1(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] arr = {27, 15, 19, 18, 28, 34, 65, 49, 25, 37};
        testHeap.initHeap(arr);//初始化
        testHeap.createHeap();
        testHeap.offer(80);
        System.out.println();
        int val = testHeap.poll();
        System.out.println(val);
    }
}

//class IntCmp implements Comparator<Integer> {
//
//    public int compare(Integer o1, Integer o2) {
//        return o2.compareTo(o1);
//    }
//}
//
//class Solution {
//    public int[] smallestK(int[] arr, int k) {
//        int[] ret = new int[k];
//        if (arr == null || k <= 0) {
//            return ret;
//        }
//
//        //求最小k，则需要创建大根堆
//        PriorityQueue<Integer> priorityQueue =
//                new PriorityQueue<>(new IntCmp());
//
//        //将前k个元素添加进优先级队列
//        for (int i = 0; i < k; i++) {
//            priorityQueue.offer(arr[i]);
//        }
//
//        //再从下标k开始往后比较
//        for (int i = k; i < arr.length; i++) {
//            int top = priorityQueue.peek();
//            if (arr[i] < top) {
//                priorityQueue.poll();
//                priorityQueue.offer(arr[i]);
//            }
//        }
//
//        for (int i = 0; i < k; i++) {
//            ret[i] = priorityQueue.poll();
//        }
//        return ret;
//    }
//}
