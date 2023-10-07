
// 牛客网 BM11 链表相加(二)
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
//        if (head1 == null) {
//            return head2;
//        }
//        if (head2 == null) {
//            return head1;
//        }
//        // 用栈相当于将链表逆序
//        Stack<ListNode> stack1 = new Stack<>();
//        Stack<ListNode> stack2 = new Stack<>();
//        ListNode p1 = head1;
//        ListNode p2 = head2;
//        while (p1 != null) {
//            stack1.push(p1);
//            p1 = p1.next;
//        }
//        while (p2 != null) {
//            stack2.push(p2);
//            p2 = p2.next;
//        }
//        int tmp = 0;//进位
//        ListNode head = new ListNode(-1);
//        ListNode nHead = head.next;
//        while (!stack1.isEmpty() || !stack2.isEmpty()) {
//            int val = tmp;
//            if (!stack1.isEmpty()) {
//                val += stack1.pop().val;
//            }
//            if (!stack2.isEmpty()) {
//                val += stack2.pop().val;
//            }
//            // 头插
//            ListNode node = new ListNode(val % 10);
//            node.next = nHead;
//            nHead = node;
//            tmp = val / 10;
//        }
//        if (tmp > 0) {
//            ListNode node = new ListNode(tmp);
//            nHead.next = node;
//            nHead = node;
//        }
//        return nHead;
//    }
//}
