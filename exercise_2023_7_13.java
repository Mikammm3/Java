


//LeetCode 面试题 17.14. 最小K个数
//class Intcmp implements Comparator<Integer> {
//    public int compare(Integer o1, Integer o2) {
//        return o2.compareTo(o1);
//    }
//}
//
//class Solution {
//    public int[] smallestK(int[] arr, int k) {
//        int[] ans = new int[k];
//        if (arr == null || k <= 0) {
//            return ans;
//        }
//        //创建一个大根堆
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Intcmp());
//        for (int i = 0; i < k; i++) {
//            priorityQueue.offer(arr[i]);
//        }
//        for (int i = k; i < arr.length; i++) {
//            int tmp = priorityQueue.peek();
//            if (arr[i] < tmp) {
//                priorityQueue.poll();
//                priorityQueue.offer(arr[i]);
//            }
//        }
//        for (int i = 0; i < k; i++) {
//            ans[i] = priorityQueue.poll();
//        }
//        return ans;
//    }
//}