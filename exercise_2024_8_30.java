
// leetcode LCR 136. 删除链表的节点
//class Solution {
//    public ListNode deleteNode(ListNode head, int val) {
//        if (head == null) return null;
//        ListNode prev = head;
//        ListNode cur = head.next;
//        while (cur != null) {
//            if (cur.val == val) {
//                prev.next = cur.next;
//                cur = cur.next;
//                return head;
//            } else {
//                prev = cur;
//                cur = cur.next;
//            }
//        }
//
//        if (head.val == val) head = head.next;
//        return head;
//    }
//}


// leetcode LCR 140. 训练计划 II
//class Solution {
//    public ListNode trainingPlan(ListNode head, int cnt) {
//        ListNode fast = head;
//        ListNode slow = head;
//        while (cnt - 1 != 0) {
//            fast = fast.next;
//            if (fast == null) {
//                return null;
//            }
//            cnt--;
//        }
//
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//
//    }
//}