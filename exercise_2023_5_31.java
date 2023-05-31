

//牛客网 BM8 链表中倒数最后k个结点
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param pHead ListNode类
//     * @param k     int整型
//     * @return ListNode类
//     */
//    public ListNode FindKthToTail(ListNode pHead, int k) {
//        if (pHead == null || k <= 0) {
//            return null;
//        }
//        ListNode fast = pHead;
//        ListNode slow = pHead;
//        while (k - 1 != 0) {
//            fast = fast.next;
//            if (fast == null) {
//                return null;
//            }
//            k--;
//        }
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
//}