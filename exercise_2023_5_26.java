
//牛客网 JZ76 删除链表中重复的结点
//public class Solution {
//    public ListNode deleteDuplication(ListNode pHead) {
//        if (pHead == null) {
//            return null;
//        }
//        ListNode cur = pHead;
//        ListNode newHead = new ListNode(-1);
//        ListNode tmpHead = newHead;
//        //遍历链表
//        while (cur != null) {
//            //判断，结点相同
//            if (cur.next != null && cur.val == cur.next.val) {
//                while (cur.next != null && cur.val == cur.next.val) {
//                    cur = cur.next;//跳过这个结点
//                }
//                cur = cur.next;//跳出这个重复的结点
//            } else {
//                tmpHead.next = cur;//存起来
//                tmpHead = tmpHead.next;
//                cur = cur.next;
//            }
//        }
//        //防止tmpHead的最后一个结点的下一个不是空，
//        if (tmpHead.next != null) {
//            tmpHead.next = null;
//        }
//        return newHead.next;
//    }
//}
