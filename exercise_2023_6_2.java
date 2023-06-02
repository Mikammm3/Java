

//牛客网 BM13 判断一个链表是否为回文结构
//public class Solution {
//    /**
//     * @param head ListNode类 the head
//     * @return bool布尔型
//     */
//    public boolean isPail(ListNode head) {
//        if (head == null) {
//            return false;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        ListNode cur = slow.next;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = slow;
//            slow = cur;
//            cur = curNext;
//        }
//        cur = head;
//        while (cur != slow) {
//            if (cur.val != slow.val) {
//                return false;
//            }
//            if (cur.next == slow) {
//                return true;
//            }
//            cur = cur.next;
//            slow = slow.next;
//        }
//        return true;
//    }
//}
