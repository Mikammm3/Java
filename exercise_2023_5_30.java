
//牛客网 BM7 链表中环的入口结点
//public class Solution {
//    public ListNode EntryNodeOfLoop(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                fast = head;
//                while (fast != null && slow != null) {
//                    if (fast == slow) {
//                        return fast;
//                    }
//                    fast = fast.next;
//                    slow = slow.next;
//                }
//            }
//        }
//        return null;
//    }
//}