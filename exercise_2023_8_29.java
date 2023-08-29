


//牛客网 BM9 删除链表的倒数第n个节点
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param head ListNode类
//     * @param n    int整型
//     * @return ListNode类
//     */
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head == null) {
//            return null;
//        }
//        //1.先找到倒数第n个节点
//        int len = 0;
//        ListNode cur = head;
//        //有可能倒数第n个节点就是头节点
//        while (cur != null) {
//            cur = cur.next;
//            len++;
//        }
//        if (len == n) {
//            return head.next;
//        }
//
//        ListNode fast = head;
//        ListNode slow = head;
//        int step = n - 1;
//        while (step != 0) {
//            fast = fast.next;
//            step--;
//        }
//        ListNode prev = head;//记录slow的前一个节点
//        while (fast != null && fast.next != null) {
//            prev = slow;
//            fast = fast.next;
//            slow = slow.next;
//        }
//        //2.删除倒数第n个节点slow
//        prev.next = slow.next;
//        return head;
//    }
//}