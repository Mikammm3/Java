
//LeetCode 203. 移除链表元素
//class Solution {
//    public ListNode removeElements(ListNode head, int val) {
//        if (head == null) {
//            //链表为空
//            return null;
//        }
//        ListNode cur = head, next;
//        ListNode prev = head;
//        //先判断head之后的结点
//        while (cur != null) {
//            if (cur.val == val) {
//                //删除
//                prev.next = cur.next;
//                cur = cur.next;
//            } else {
//                //prev更新
//                prev = cur;
//                cur = cur.next;
//            }
//        }
//        //最后来判断head结点
//        if (head.val == val) {
//            head = head.next;
//        }
//        return head;
//    }
//}


//LeetCode 206. 反转链表
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode cur = head.next;
//        ListNode prev = head;
//        head.next = null;
//        while (cur != null) {
//            ListNode curNext = cur.next;//记录cur的下一个位置
//            cur.next = prev;//头插
//            prev = cur;//更新
//            cur = curNext;//cur往后走一步
//        }
//        return prev;//新头
//    }
//}


//LeetCode 876. 链表的中间结点
//class Solution {
//    //找中间结点
//    public ListNode middleNode(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        //遍历链表，防止空指针异常
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;//一次走两步
//            slow = slow.next;//一次走一步
//        }
//        return slow;
//    }
//}


//LeetCode 21. 合并两个有序链表
//class Solution {
//    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
//        if (headA == null && headB == null) {
//            return null;
//        }
//        if (headA == null) {
//            return headB;
//        }
//        if (headB == null) {
//            return headA;
//        }
//        ListNode newHead = null;
//        ListNode tmpHead = null;
//        while (headA != null && headB != null) {
//            if (headA.val > headB.val) {
//                if (newHead == null) {
//                    newHead = headB;
//                    tmpHead = headB;
//                    headB = headB.next;
//                } else {
//                    tmpHead.next = headB;
//                    tmpHead = tmpHead.next;
//                    headB = headB.next;
//                }
//            } else {
//                if (newHead == null) {
//                    newHead = headA;
//                    tmpHead = headA;
//                    headA = headA.next;
//                } else {
//                    tmpHead.next = headA;
//                    tmpHead = tmpHead.next;
//                    headA = headA.next;
//                }
//            }
//        }
//        if (headA != null) {
//            tmpHead.next = headA;
//        }
//        if (headB != null) {
//            tmpHead.next = headB;
//        }
//        return newHead;
//    }
//}