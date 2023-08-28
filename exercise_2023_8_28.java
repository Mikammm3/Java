

//牛客网 BM5 合并k个已排序的链表
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param lists ListNode类ArrayList
//     * @return ListNode类
//     */
//    public ListNode mergeKLists(ArrayList<ListNode> lists) {
//        if (lists == null || lists.size() == 0) {
//            return null;
//        }
//        if (lists.size() == 1) {
//            return lists.get(0);
//        }
//        //用归并排序，先拆分，再合并
//        return mergeKLists(0, lists.size() - 1, lists);
//    }
//
//    public ListNode mergeKLists(int left, int right, ArrayList<ListNode> lists) {
//        if (left >= right) {
//            //说明拆分成了一个节点
//            return lists.get(left);
//        }
//        int mid = (left + right) / 2;
//        //拆分左边
//        ListNode headA = mergeKLists(left, mid, lists);
//        //拆分右边
//        ListNode headB = mergeKLists(mid + 1, right, lists);
//
//        //合并有序链表
//        ListNode newHead = new ListNode(-1);
//        ListNode cur = newHead;
//        while (headA != null && headB != null) {
//            if (headA.val < headB.val) {
//                cur.next = headA;
//                cur = cur.next;
//                headA = headA.next;
//            } else {
//                cur.next = headB;
//                cur = cur.next;
//                headB = headB.next;
//            }
//        }
//        if (headA != null) {
//            cur.next = headA;
//        }
//        if (headB != null) {
//            cur.next = headB;
//        }
//        return newHead.next;
//    }
//
//}