
// leetcode 61. 旋转链表
//class Solution {
//    public ListNode rotateRight(ListNode head, int k) {
//        // 连成环，然后找到新链表的最后一个节点，断开，然后返回即可
//        if (head == null || head.next == null || k == 0) {
//            return head;
//        }
//        ListNode cur = head;
//        int n = 1;
//        while (cur.next != null) {
//            cur = cur.next;
//            n++;
//        }
//        // 此时 cur 为链表的最后一个节点, 置环
//        cur.next = head;
//        int last = n - (k % n);
//        // 走到新链表最后一个节点
//        while (last != 0) {
//            cur = cur.next;
//            last--;
//        }
//        // 记录头节点，然后断开
//        ListNode newHead = cur.next;
//        cur.next = null;
//        return newHead;
//    }
//}