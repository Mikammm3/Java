
//牛客网 BM10 两个链表的第一个公共结点
//public class Solution {
//    public ListNode FindFirstCommonNode(ListNode headA, ListNode headB) {
//        ListNode pL = headA;
//        ListNode pS = headB;
//        int cntA = 0;
//        int cntB = 0;
//        while (pL != null) {
//            cntA++;
//            pL = pL.next;
//        }
//        while (pS != null) {
//            cntB++;
//            pS = pS.next;
//        }
//        int len = cntA - cntB;
//        pL = headA;
//        pS = headB;
//        if (len < 0) {
//            pL = headB;
//            pS = headA;
//            len = cntB - cntA;
//        }
//        while (len != 0) {
//            pL = pL.next;
//            len--;
//        }
//        while (pL != null && pS != null) {
//            if (pS == pL) {
//                return pL;
//            }
//            pL = pL.next;
//            pS = pS.next;
//        }
//        return null;
//    }
//}