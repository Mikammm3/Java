
// leetcode 2. 两数相加
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        int ret = 0;
//        while (l1 != null && l2 != null) {
//            int val = ret + l1.val + l2.val;
//            ListNode node = new ListNode(val % 10);
//            cur.next = node;
//            ret = val / 10;
//            cur = cur.next;
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//
//        while (l1 != null) {
//            int val = ret + l1.val;
//            ListNode node = new ListNode(val % 10);
//            cur.next = node;
//            ret = val / 10;
//            cur = cur.next;
//            l1 = l1.next;
//        }
//        while (l2 != null) {
//            int val = ret + l2.val;
//            ListNode node = new ListNode(val % 10);
//            cur.next = node;
//            ret = val / 10;
//            cur = cur.next;
//            l2 = l2.next;
//        }
//
//        while (ret > 0) {
//            int val = ret;
//            ListNode node = new ListNode(val % 10);
//            cur.next = node;
//            ret = val / 10;
//            cur = cur.next;
//        }
//
//        return dummy.next;
//
//    }
//}


// leetcode 21. 合并两个有序链表
//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null) return list2;
//        if (list2 == null) return list1;
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        while (list1 != null && list2 != null) {
//            if (list1.val <= list2.val) {
//                cur.next = list1;
//                list1 = list1.next;
//            } else {
//                cur.next = list2;
//                list2 = list2.next;
//            }
//            cur = cur.next;
//        }
//        if (list1 != null) {
//            cur.next = list1;
//        }
//        if (list2 != null) {
//            cur.next = list2;
//        }
//        return dummy.next;
//    }
//}