

//牛客网 AB12 删除链表的节点
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
//     * @param head ListNode类
//     * @param val  int整型
//     * @return ListNode类
//     */
//    public ListNode deleteNode(ListNode head, int val) {
//        if (head == null) {
//            return null;
//        }
//        if (head.val == val) {
//            head = head.next;
//        }
//        ListNode cur = head;
//        while (cur != null && cur.next != null) {
//            if (cur != null && cur.next.val == val) {
//                cur.next = cur.next.next;
//                break;
//            }
//            cur = cur.next;
//        }
//        return head;
//    }
//}