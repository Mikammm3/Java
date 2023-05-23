//import java.util.List;
//
//public class ReviewSingleList {
//    //结点
//    static class ListNode {
//        public int val;
//        public ListNode next;
//
//        public ListNode(int val) {
//            this.val = val;
//        }
//    }
//
//    public ListNode head;
//
//    //头插法
//    public void addFirst(int data) {
//        ListNode node = new ListNode(data);
//        node.next = head;//忘记绑定了
//        head = node;
//    }
//
//    //尾插法
//    public void addLast(int data) {
//        if (head == null) {
//            addFirst(data);
//            return;
//        }
//        ListNode cur = head;
//        while (cur.next != null) {
//            cur = cur.next;
//        }
//        ListNode node = new ListNode(data);
//        cur.next = node;
//    }
//
//    //任意位置插入,第一个数据节点为0号下标
//    public void addIndex(int index, int data) {
//        if (index < 0 || index > size()) {
//            return;
//        }
//        if (index == 0 || head == null) {
//            addFirst(data);
//            return;
//        }
//        if (index == size()) {
//            addLast(data);
//            return;
//        }
//        ListNode prev = findIndexSubOne(index);
//        ListNode node = new ListNode(data);
//        node.next = prev.next;
//        prev.next = node;
//
//    }
//
//    private ListNode findIndexSubOne(int index) {
//        ListNode cur = head;
//        int tmp = index - 1;
//        while (tmp != 0) {
//            cur = cur.next;
//            tmp--;
//        }
//        return cur;
//    }
//
//    //查找是否包含关键字key是否在单链表当中
//    public boolean contains(int key) {
//        ListNode cur = head;
//        while (cur != null) {
//            if (cur.val == key) {
//                return true;
//            }
//            cur = cur.next;
//        }
//        return false;
//    }
//
//    //删除第一次出现关键字为key的节点
//    public void remove(int key) {
//        if (head == null) {
//            return;
//        }
//        if (head.val == key) {
//            head = head.next;//忘记判断头结点了
//        }
//        ListNode prev = findKeySubOne(key);
//        if (prev == null) {
//            System.out.println("没有你要删除的数据");
//            return;
//        }
//        ListNode del = prev.next;
//        prev.next = del.next;
//    }
//
//    private ListNode findKeySubOne(int key) {
//        ListNode cur = head;
//        while (cur.next != null) {
//            if (cur.next.val == key) {
//                return cur;
//            }
//            cur = cur.next;
//        }
//        return null;
//    }
//
//    //删除所有值为key的节点
//    public void removeAllKey(int key) {
//        if (head == null) {
//            return;
//        }
//        ListNode del = head.next;
//        ListNode prev = head;
//        while (del != null) {
//            if (del.val == key) {
//                prev.next = del.next;
//                del = del.next;
//            } else {
//                prev = del;
//                del = del.next;
//            }
//        }
//        if (head.val == key) {
//            head = head.next;//忘记判断头结点了
//        }
//    }
//
//    //得到单链表的长度
//    public int size() {
//        ListNode cur = head;
//        int cnt = 0;
//        while (cur != null) {
//            cnt++;
//            cur = cur.next;
//        }
//        return cnt;
//    }
//
//    public void clear() {
//        this.head = null;
//    }
//
//    public void display() {
//        ListNode cur = head;
//        while (cur != null) {
//            System.out.print(cur.val + " ");
//            cur = cur.next;
//        }
//        System.out.println();
//    }
//}
//
//
////public class Solution {
////    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//////1、分别求2个链表的长度
////        int lenA = 0;
////        int lenB = 0;
////
////        ListNode pL = headA;//假设pL 所指向的链表 是最长的链表
////        ListNode pS = headB;//假设pS 所指向的链表 是最短的链表
////        while (pL != null) {
////            lenA++;
////            pL = pL.next;
////        }
////
////        while (pS != null) {
////            lenB++;
////            pS = pS.next;
////        }
////
////        pL = headA;
////        pS = headB;
////
////        //分别求得了 2个链表的长度
////        int len = lenA - lenB;
////        //修正指向 和 len的差值
////        if (len < 0) {
////            pL = headB;
////            pS = headA;
////            len = lenB - lenA;
////        }
////        //我们都能保证PL一定指向最长的链表  PS 一定指向最短的链表  len 一定是一个正数
////
////        //2、让最长的链表 先走差值步
////
////        while (len != 0) {
////            pL = pL.next;
////            len--;
////        }
////        //3、就是相遇的点
////        while (pL != null && pS != null) {
////            if (pL == pS) {
////                return pL;
////            }
////            pL = pL.next;
////            pS = pS.next;
////        }
////        return null;
////
////    }
////}
////
////
////public class Solution {
////    public boolean hasCycle(ListNode head) {
////        if (head == null) {
////            return false;
////        }
////        ListNode fast = head;
////        ListNode slow = head;
////        while (fast != null && fast.next != null) {
////
////            fast = fast.next.next;
////            slow = slow.next;
////            if (fast == slow) {
////                return true;
////            }
////        }
////        return false;
////    }
////}
