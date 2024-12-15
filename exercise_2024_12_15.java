
// leetcode 234. 回文链表
//class Solution {
//    public boolean isPalindrome(ListNode head) {
//        if (head == null) return true;
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        // prev 就是头节点
//        ListNode prev = slow;
//        ListNode cur = slow.next;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        while (head != prev) {
//            if (head.val != prev.val) {
//                return false;
//            }
//            if (head.next == prev) {
//                return true;
//            }
//            head = head.next;
//            prev = prev.next;
//        }
//        return true;
//    }
//}


// leetcode 206. 反转链表
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if (head == null) return null;
//        ListNode cur = head.next;
//        ListNode prev = head;
//        head.next = null;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        return prev;
//    }
//}