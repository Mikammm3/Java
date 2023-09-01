

//牛客网 BM14 链表的奇偶重排
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param head ListNode类
//     * @return ListNode类
//     */
//    public ListNode oddEvenList(ListNode head) {
//        if (head == null || head.next == null || head.next.next == null) {
//            return head;
//        }
//
//        ListNode odd = head;//奇数
//        ListNode even = head.next;//偶数
//        ListNode evenHead = even;//偶数头节点
//        while (odd != null && even != null) {
//            //让奇数连接，偶数连接
//            odd.next = even.next;//让奇数的下一个还是奇数
//            if (even.next == null) {
//                break;
//            }
//            odd = even.next;//让odd往后走
//            even.next = odd.next;//让偶数的下一个还是偶数
//            even = odd.next;//让even往后走
//        }
//        //奇数连接偶数头
//        odd.next = evenHead;
//        return head;
//    }
//}