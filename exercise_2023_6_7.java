
//牛客网 BM2 链表内指定区间反转
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
//     * @param m    int整型
//     * @param n    int整型
//     * @return ListNode类
//     */
//    public ListNode reverseBetween(ListNode head, int m, int n) {
//        if (head == null) {
//            return null;
//        }
//        if (m == n) {
//            return head;
//        }
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//        ListNode cur = head;//cur表示开始翻转的头结点
//        ListNode pre = dummy;//pre.next指向翻转成功的头结点位置
//        int cnt = n - m;
//        while (m - 1 != 0) {
//            cur = cur.next;
//            pre = pre.next;
//            m--;
//        }
//        for (int i = 0; i < cnt; i++) {
//            ListNode curNext = cur.next;//要反转的结点
//            cur.next = curNext.next;//存起后面的数据
//            curNext.next = pre.next;//翻转
//            pre.next = curNext;//更新指向
//        }
//        return dummy.next;
//    }
//}

