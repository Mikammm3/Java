
// leetcode 2. 两数相加
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode cur1 = l1, cur2 = l2, newHead = new ListNode(-1);
//        ListNode cur = newHead;
//        int t = 0; // 表示进位
//        while (cur1 != null || cur2 != null || t != 0) {
//            if (cur1 != null) {
//                t += cur1.val;
//                cur1 = cur1.next;
//            }
//            if (cur2 != null) {
//                t += cur2.val;
//                cur2 = cur2.next;
//            }
//            ListNode node = new ListNode(t % 10);
//            cur.next = node;
//            cur = cur.next;
//            t /= 10;
//        }
//        return newHead.next;
//
//    }
//}