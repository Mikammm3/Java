
// leetcode 82. 删除排序链表中的重复元素 II
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null) return null;
//        ListNode dummy = new ListNode(-1, head);
//        ListNode cur = dummy;
//        while (cur != null && cur.next != null && cur.next.next != null) {
//            if (cur.next.val == cur.next.next.val) {
//                // 删除
//                int val = cur.next.val;
//                while (cur != null && cur.next != null && cur.next.val == val) {
//                    cur.next = cur.next.next;
//                }
//            } else {
//                cur = cur.next;
//            }
//        }
//        return dummy.next;
//    }
//}