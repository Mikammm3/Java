

// leetcode LCR 141. 训练计划 III
//class Solution {
//    public ListNode trainningPlan(ListNode head) {
//        // 采用头插法即可
//        if (head == null || head.next == null) return head;
//        ListNode prev = head;
//        ListNode cur = head.next;
//        prev.next = null;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        return prev;
//
//    }
//}


// leetcode LCR 142. 训练计划 IV
//class Solution {
//    public ListNode trainningPlan(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//        // 虚拟头节点，返回时返回 dummy.next
//        ListNode dummy = new ListNode(-1);
//        ListNode cur = dummy;
//        // 其实跟合并有序数组差不多
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                cur.next = l1;
//                l1 = l1.next;
//                cur = cur.next;
//            } else {
//                cur.next = l2;
//                l2 = l2.next;
//                cur = cur.next;
//            }
//        }
//        if (l1 != null) {
//            cur.next = l1;
//        }
//        if (l2 != null) {
//            cur.next = l2;
//        }
//        return dummy.next;
//    }
//}