
// leetcode 面试题 17.14. 最小K个数
//class Solution {
//    public int[] smallestK(int[] arr, int k) {
//        int[] ret = new int[k];
//        if (arr == null || k <= 0) return ret;
//        // 因为是求前 k 小，所以要建立大根堆
//        // 默认为小根堆，要传构造器建立大根堆
//        PriorityQueue<Integer> queue = new PriorityQueue<>(new IntCmp());
//        for (int i = 0; i < arr.length; i++) {
//            if (i < k) {
//                // 入堆
//                queue.offer(arr[i]);
//            } else {
//                // top < arr[i]
//                if (arr[i] < queue.peek()) {
//                    queue.poll();
//                    queue.offer(arr[i]);
//                }
//            }
//        }
//        int j = k - 1;
//        while (!queue.isEmpty()) {
//            ret[j] = queue.poll();
//            j--;
//        }
//        return ret;
//    }
//}
//
//class IntCmp implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2 - o1;
//    }
//
//}