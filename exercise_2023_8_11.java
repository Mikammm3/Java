

//LeetCode 206. 反转链表
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode prev = head;
//        ListNode cur = head.next;
//        head.next = null;//置空，防止循环
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;//头插
//            prev = cur;//新头
//            cur = curNext;
//        }
//        return prev;
//    }
//}