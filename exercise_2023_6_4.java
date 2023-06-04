

//牛客网 BM16 删除有序链表中重复的元素-II
//import java.util.*;
//
///*
// * public class ListNode {
// *   int val;
// *   ListNode next = null;
// * }
// */
//
//public class Solution {
//    /**
//     * @param head ListNode类
//     * @return ListNode类
//     */
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode cur = head;
//        ListNode newHead = new ListNode(-1);
//        ListNode tmpHead = newHead;
//        while (cur != null) {
//            if (cur.next != null && cur.val == cur.next.val) {
//                while (cur.next != null && cur.val == cur.next.val) {
//                    cur = cur.next;
//                }
//                cur = cur.next;
//            } else {
//                tmpHead.next = cur;
//                tmpHead = tmpHead.next;
//                cur = cur.next;
//            }
//        }
//        if (tmpHead.next != null) {
//            tmpHead.next = null;
//        }
//        return newHead.next;
//    }
//}