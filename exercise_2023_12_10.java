
// LeetCode 24. 两两交换链表中的节点
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//        if (head == null) return null;
//        ListNode newHead = new ListNode(-1);
//        newHead.next = head;
//        ListNode prev = newHead, cur = head, next = cur.next;
//        while (cur != null && next != null) {
//
//            ListNode nnext = null;
//            if (next != null) nnext = next.next;
//            prev.next = next;
//            next.next = cur;
//            cur.next = nnext;
//            prev = cur;
//            cur = nnext;
//            if (cur == null) break;
//            next = cur.next;
//        }
//        return newHead.next;
//    }
//}