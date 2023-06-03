
//牛客网 BM15 删除有序链表中重复的元素-I
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
//        while (cur != null && cur.next != null) {
//            if (cur.val == cur.next.val) {
//                cur.next = cur.next.next;
//            } else {
//                cur = cur.next;
//            }
//        }
//        return head;
//    }
//}