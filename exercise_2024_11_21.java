
// leetcode 19. 删除链表的倒数第 N 个结点
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(-1, head);
//        ListNode fast = dummy;
//        ListNode slow = dummy;
//        while (n != 0) {
//            fast = fast.next;
//            n--;
//        }
//        while (fast != null && fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//        return dummy.next;
//    }
//}