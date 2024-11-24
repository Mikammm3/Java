

// leetcode 86. 分隔链表
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode partition(ListNode head, int x) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode bs = new ListNode(-1);
//        ListNode cur1 = bs;
//        ListNode as = new ListNode(-1);
//        ListNode cur2 = as;
//        ListNode cur = head;
//        while (cur != null) {
//            if (cur.val < x) {
//                cur1.next = cur;
//                cur1 = cur1.next;
//            } else {
//                cur2.next = cur;
//                cur2 = cur2.next;
//            }
//            cur = cur.next;
//        }
//
//        // 防止形成环
//        if (cur2 != null) {
//            cur2.next = null;
//        }
//
//
//        if (cur1 == null) {
//            return as.next;
//        } else {
//            // 链表连接
//            cur1.next = as.next;
//        }
//        return bs.next;
//    }
//}