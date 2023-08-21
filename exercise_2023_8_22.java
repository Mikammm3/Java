
//LeetCode 面试题 17.14. 最小K个数
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