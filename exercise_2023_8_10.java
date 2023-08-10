

//牛客网 删除链表中重复的结点
//public class Solution {
//    public ListNode deleteDuplication(ListNode pHead) {
//        if (pHead == null) {
//            return null;
//        }
//        ListNode newHead = new ListNode(-1);
//        ListNode cur = newHead;
//        while (pHead != null) {
//            if (pHead.next != null && pHead.val == pHead.next.val) {
//                while (pHead.next != null && pHead.val == pHead.next.val) {
//                    pHead = pHead.next;
//                }
//                pHead = pHead.next;
//            } else {
//                cur.next = pHead;
//                cur = cur.next;
//                pHead = pHead.next;
//            }
//        }
//        if (cur.next != null) {
//            cur.next = null;
//        }
//        return newHead.next;
//    }
//}