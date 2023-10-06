

// 牛客网 BM3 链表中的节点每k个一组翻转
//import java.util.*;
//
///*
// * public class ListNode {
// *   int val;
// *   ListNode next = null;
// *   public ListNode(int val) {
// *     this.val = val;
// *   }
// * }
// */
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param head ListNode类
//     * @param k    int整型
//     * @return ListNode类
//     */
//    public ListNode reverseKGroup(ListNode head, int k) {
//        // 1. 先看节点是否大于等于k，不足k则不翻转
//        // 2. head - tail 区间翻转
//        // 3. 尾部连接利用递归
//        ListNode tail = head;// 每次翻转的尾部
//        // 如果不足 k ，则直接返回头部
//        for (int i = 0; i < k; i++) {
//            if (tail == null) {
//                return head;
//            }
//            tail = tail.next;
//        }
//        ListNode prev = null;// 翻转后的头
//        ListNode cur = head;
//        while (cur != tail) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;// prev 往后走一步
//            cur = curNext;
//        }
//        head.next = reverseKGroup(tail, k);
//        return prev;
//    }
//}