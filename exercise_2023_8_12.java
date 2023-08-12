

//LeetCode 142. 环形链表 II
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
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
//
//                    if (fast == slow) {
//                        return fast;
//                    }
//                    fast = fast.next;
//                    slow = slow.next;
//                }
//            }
//
//        }
//        return null;
//    }
//}