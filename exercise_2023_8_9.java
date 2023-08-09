

//LeetCode 21. 合并两个有序链表
//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null && list2 == null) {
//            return null;
//        }
//        if (list1 == null) {
//            return list2;
//        }
//        if (list2 == null) {
//            return list1;
//        }
//        ListNode newHead = new ListNode(-1);
//        ListNode tmpHead = newHead;
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                tmpHead.next = list1;
//                tmpHead = tmpHead.next;
//                list1 = list1.next;
//            } else {
//                tmpHead.next = list2;
//                tmpHead = tmpHead.next;
//                list2 = list2.next;
//            }
//        }
//        if (list1 != null) {
//            tmpHead.next = list1;
//        }
//        if (list2 != null) {
//            tmpHead.next = list2;
//        }
//        return newHead.next;
//    }
//}