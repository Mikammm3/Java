

//牛客网 BM4 合并两个排序的链表
//public class Solution {
//    public ListNode Merge(ListNode headA, ListNode headB) {
//        if (headA == null && headB == null) {
//            return null;
//        }
//        if (headA == null) {
//            return headB;
//        }
//        if (headB == null) {
//            return headA;
//        }
//        ListNode newHead = null;
//        ListNode tmpHead = null;
//        while (headA != null && headB != null) {
//            if (headA.val > headB.val) {
//                if (newHead == null) {
//                    newHead = headB;
//                    tmpHead = headB;
//                    headB = headB.next;
//                } else {
//                    tmpHead.next = headB;
//                    tmpHead = tmpHead.next;
//                    headB = headB.next;
//                }
//            } else {
//                if (newHead == null) {
//                    newHead = headA;
//                    tmpHead = headA;
//                    headA = headA.next;
//                } else {
//                    tmpHead.next = headA;
//                    tmpHead = tmpHead.next;
//                    headA = headA.next;
//                }
//            }
//        }
//        if (headA != null) {
//            tmpHead.next = headA;
//        }
//        if (headB != null) {
//            tmpHead.next = headB;
//        }
//        return newHead;
//    }
//}