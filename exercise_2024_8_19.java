
// leetcode LCR 159. 库存管理 III
//class Solution {
//    public int[] inventoryManagement(int[] stock, int cnt) {
//        Arrays.sort(stock);
//        return Arrays.copyOfRange(stock, 0, cnt);
//    }
//}
//class Solution {
//    public int[] inventoryManagement(int[] stock, int cnt) {
//        if (stock == null || stock.length == 0 || cnt <= 0) return new int[0];
//        // 或者利用大根堆来做，就是 tok-k 问题
//        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        for (int i = 0; i < stock.length; i++) {
//            if (i < cnt) {
//                queue.offer(stock[i]);
//            } else {
//                int top = queue.peek();
//                if (top > stock[i]) {
//                    queue.poll();
//                    queue.offer(stock[i]);
//                }
//            }
//        }
//        // 最后队列里就是前 cnt 个小的元素
//        int[] ret = new int[cnt];
//        for (int i = cnt - 1; i >= 0; i--) {
//            ret[i] = queue.poll();
//        }
//        return ret;
//    }
//}


// LCR 160. 数据流中的中位数
//class MedianFinder {
//
//    /**
//     * initialize your data structure here.
//     */
//    int usedSize = 0;
//    int[] arr;
//
//    public MedianFinder() {
//        arr = new int[10];
//
//    }
//
//    public void addNum(int num) {
//        // 扩容
//        if (usedSize == arr.length) {
//            this.arr = Arrays.copyOf(arr, arr.length * 2);
//        }
//        arr[usedSize] = num;
//        usedSize++;
//    }
//
//    public double findMedian() {
//        if (usedSize == 0) {
//            return -1.0;
//        }
//
//        // 直接插入排序
//        for (int i = 1; i < usedSize; i++) {
//            int j = i - 1;
//            int tmp = arr[i];
//            for (; j >= 0; j--) {
//                if (arr[j] > tmp) {
//                    arr[j + 1] = arr[j];
//                } else {
//                    break;
//                }
//            }
//            arr[j + 1] = tmp;
//        }
//        if (usedSize % 2 == 1) {
//            return (double) arr[usedSize / 2];
//        } else {
//            //
//            double sum = arr[usedSize / 2] + arr[usedSize / 2 - 1];
//            return sum / 2;
//        }
//
//    }
//}

