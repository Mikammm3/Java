
// leetcode 141. 环形链表
//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        if (head == null) return false;
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) return true;
//        }
//
//        return false;
//    }
//}


// leetcode 142. 环形链表 II
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        if (head == null) return null;
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                fast = head;
//                while (fast != slow) {
//                    fast = fast.next;
//                    slow = slow.next;
//                }
//                return fast;
//            }
//        }
//        return null;
//    }
//}