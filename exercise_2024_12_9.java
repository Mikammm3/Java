
// leetcode 239. 滑动窗口最大值
//class Solution {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int[] ans = new int[nums.length - k + 1];
//        // 使用队列来做
//        // 保证队列中的节点是按照从大到小来排序
//        LinkedList<Integer> queue = new LinkedList<>();
//        // 遍历每个元素，如果当前元素的值大于等于链表末尾值
//        // 就需要弹出链表末尾值
//        // 链表中存储的是数的下标
//        // 用 L 和 R 来标记窗口范围
//        // 如果队首元素在 L 到 R 之间，则说明元素有效
//        // 如果不在，就需要弹出队首元素
//        // 窗口形成后，最后队首元素就是最大值
//        for (int right = 0, i = 0; right < nums.length; right++) {
//            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[right]) {
//                queue.pollLast();
//            }
//            queue.addLast(right);
//
//            // 判断队首的最大值有效  [L, R] = [right+1-k, right]
//            if (queue.peek() < right + 1 - k) {
//                queue.poll();
//            }
//
//            if (right >= k - 1) {
//                // 更新最大值
//                ans[i++] = nums[queue.peek()];
//            }
//        }
//        return ans;
//    }
//}

// leetcode 76. 最小覆盖子串
//class Solution {
//    public String minWindow(String s, String t) {
//        int[] hashS = new int[128];
//        int[] hashT = new int[128];
//        // 代表 t 中字符种类总数
//        int kinds = 0;
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            hashT[ch]++;
//            if (hashT[ch] == 1) kinds++;
//        }
//        String str = "";
//        for (int left = 0, right = 0, count = 0; right < s.length(); right++) {
//            char ch = s.charAt(right);
//            hashS[ch]++;
//            // 当达到指定个数时
//            if (hashS[ch] == hashT[ch]) count++;
//            // 满了，就需要出窗口
//            while (count == kinds) {
//                if (count == kinds) {
//                    String tmp = s.substring(left, right + 1);
//                    if (str.length() == 0 || tmp.length() < str.length()) {
//                        str = tmp;
//                    }
//                }
//                char c = s.charAt(left);
//                if (hashS[c] == hashT[c]) count--;
//                hashS[c]--;
//                left++;
//            }
//        }
//        return str;
//    }
//}