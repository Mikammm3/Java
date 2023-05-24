//public class exercise_2023_5_24 {
//}


//牛客网 链表中倒数第k个结点
//public class Solution {
//
//    public ListNode FindKthToTail(ListNode head, int k) {
//        if (head == null) {
//            return null;
//        }
//        //k <= 0不合法
//        if (k <= 0) {
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while (k - 1 != 0) {
//            fast = fast.next;
//            //k太大，超过了链表长度
//            if (fast == null) {
//                return null;
//            }
//            k--;
//        }
//        //你先走，然后我们同时同速走，距离不变，就是k-1步，差k个结点
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
//}


//牛客网 CM11 链表分割
//public class Partition {
//    public ListNode partition(ListNode pHead, int x) {
//        //定义bs，be，as，ae 两个部分
//        //小于x的结点放到b中，大于的放到a中
//        //最后返回数据的时候，be和as连接即可
//        ListNode bs = null;
//        ListNode be = null;
//        ListNode as = null;
//        ListNode ae = null;
//
//        ListNode cur = pHead;
//        //遍历链表
//        while (cur != null) {
//            if (cur.val < x) {
//                //第一次
//                if (bs == null) {
//                    bs = cur;
//                    be = cur;
//
//                } else {
//                    be.next = cur;
//                    be = be.next;
//                }
//            } else {
//                //第一次
//                if (as == null) {
//                    as = cur;
//                    ae = cur;
//
//                } else {
//                    ae.next = cur;
//                    ae = ae.next;
//                }
//
//            }
//            cur = cur.next;
//        }
//        //如果第一段为空
//        if (bs == null) {
//            return as;
//        }
//        //连接a段和b段
//        be.next = as;
//        //如果a段存在，ae.next需要置空，防止形成循环
//        if (as != null) {
//            ae.next = null;
//        }
//        return bs;
//    }
//}


//牛客网 OR36 链表的回文结构
//public class PalindromeList {
//    public boolean chkPalindrome(ListNode head) {
//        if (head == null) {
//            return false;
//        }
//
//        //1.找中间结点
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//
//        //2.翻转中间结点之后的结点
//        ListNode cur = slow;
//        //遍历链表
//        while (cur != null) {
//            ListNode curNext = cur.next;//记录cur的下一个结点
//            cur.next = slow;//翻转
//            slow = cur;//更新头
//            cur = curNext;
//        }
//
//        //3.比较
//        while (slow != head) {
//            if (slow.val != head.val) {
//                return false;
//            }
//            //结点个数为偶数个时
//            if (head.next == slow) {
//                return true;
//            }
//            slow = slow.next;
//            head = head.next;
//        }
//        return true;
//    }
//}