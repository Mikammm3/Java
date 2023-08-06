

//LeetCode 1046. 最后一块石头的重量
//class Solution {
//    public int lastStoneWeight(int[] stones) {
//        //将所有石头的重量放入最大堆中。
//        // 每次依次从队列中取出最重的两块石头 a和 b，必有 a≥b
//        // 如果 a>b，则将新石头 a−b 放回到最大堆中；
//        //如果 a=b，两块石头完全被粉碎，因此不会产生新的石头。
//        // 重复上述操作，直到剩下的石头少于 2 块。
//        // 最终可能剩下 1 块石头，该石头的重量即为最大堆中剩下的元素，返回该元素；
//        // 也可能没有石头剩下，此时最大堆为空，返回 0。
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
//        for (Integer x : stones) {
//            priorityQueue.add(x);
//        }
//        while (priorityQueue.size() > 1) {
//            int a = priorityQueue.poll();
//            int b = priorityQueue.poll();
//            if (a > b) {
//                priorityQueue.add(a - b);
//            }
//        }
//        return priorityQueue.isEmpty() ? 0 : priorityQueue.poll();
//    }
//}