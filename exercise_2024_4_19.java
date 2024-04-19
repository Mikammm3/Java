

//import java.util.*;
//
///*
// * public class ListNode {
// *   int val;
// *   ListNode next = null;
// *   public ListNode(int val) {
// *     this.val = val;
// *   }
// * }
// */
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param head1 ListNode类
//     * @param head2 ListNode类
//     * @return ListNode类
//     */
//    public ListNode addInList(ListNode head1, ListNode head2) {
//        if (head1 == null) return head2;
//        if (head2 == null) return head1;
//        long a = 0;
//        ListNode cur1 = head1;
//        while (cur1 != null) {
//            a = a * 10 + cur1.val;
//            cur1 = cur1.next;
//        }
//        long b = 0;
//        ListNode cur2 = head2;
//        while (cur2 != null) {
//            b = b * 10 + cur2.val;
//            cur2 = cur2.next;
//        }
//        long ans = a + b;
//        String str = String.valueOf(ans);
//        ListNode newHead = new ListNode(-1);
//        ListNode cur = newHead;
//        for (int i = 0; i < str.length(); i++) {
//            int c = str.charAt(i) - '0';
//            ListNode node = new ListNode(c);
//            cur.next = node;
//            cur = cur.next;
//        }
//        return newHead.next;
//    }
//}