

//牛客网 BM12 单链表的排序
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param head ListNode类 the head node
//     * @return ListNode类
//     */
//    public ListNode sortInList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        //归并排序
//        ListNode fast = head.next;
//        ListNode slow = head;//让slow是中间节点
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        ListNode tmp = slow.next;
//        //递归分解
//        slow.next = null;//分隔成2个链表
//        ListNode left = sortInList(head);
//        ListNode right = sortInList(tmp);
//
//        //合并
//        ListNode newHead = new ListNode(-1);
//        ListNode cur = newHead;
//        while (left != null && right != null) {
//            if (left.val < right.val) {
//                cur.next = left;
//                left = left.next;
//                cur = cur.next;
//            } else {
//                cur.next = right;
//                right = right.next;
//                cur = cur.next;
//            }
//        }
//        if (left != null) {
//            cur.next = left;
//        }
//        if (right != null) {
//            cur.next = right;
//        }
//        return newHead.next;
//    }
//
//}