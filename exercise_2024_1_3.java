


// LeetCode 24. 两两交换链表中的节点
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode tmp = swapPairs(head.next.next);
//        ListNode newHead = head.next;
//        newHead.next = head;
//        head.next = tmp;
//        return newHead;
//    }
//}