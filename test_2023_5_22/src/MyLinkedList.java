public class MyLinkedList {

    static class ListNode {
        private int val;
        private ListNode prev;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;
    public ListNode last;

    //头插法
    public void addFirst(int data) {
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        if (index < 0 || index > size()) {
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }

        ListNode cur = head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        ListNode node = new ListNode(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;

    }


    //删除第一次出现关键字为key的节点
    public void remove(int key) {
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
    }

    //得到单链表的长度
    public int size() {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void clear() {

    }


    //求链表的相交点
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null && headB == null) {
//            return null;
//        }
//        //1.分别求出两个链表的长度，然后做差
//        ListNode pL = headA;//假设A是较长的
//        ListNode pS = headB;
//        int lenA = 0;
//        int lenB = 0;
//        while (pL != null) {
//            lenA++;
//            pL = pL.next;
//        }
//        while (pS != null) {
//            lenB++;
//            pS = pS.next;
//        }
//        int len = lenA - lenB;//记录差值
//        pL = headA;//重新回到头结点
//        pS = headB;
//        //进行修正
//        if (len < 0) {
//            pL = headB;
//            pS = headA;
//            len = lenB - lenA;
//        }
//        //2.让较长的链表先走差值步
//        while (len != 0) {
//            pL = pL.next;
//            len--;
//        }
//        //3.然后两个链表再一起走
//        while (pL != null && pS != null) {
//            if (pL == pS) {
//                return pL;
//            }
//            pL = pL.next;
//            pS = pS.next;
//        }
//        return null;
//    }


//    //是否有环
//    public boolean hasCycle(ListNode head) {
//        if (head == null) {
//            return false;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;//一次走两步
//            slow = slow.next;//一次走一步
//            //相当于追及问题，slow在追fast，有环就能追上，没环就追不上
//            if (fast == slow) {
//                return true;
//            }
//        }
//        return false;
//    }


//    //返回环的入口点
//    public ListNode detectCycle(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                //相遇后，
//                //相遇点到入口点的距离与起始点到入口点的距离相等
//                break;//此时跳出表明fast与slow已经相遇
//            }
//        }
//        fast = head;
//        while (fast != null && slow != null) {
//            if (fast == slow) {
//                break;//如果fast与slow再次相遇，则该点为入口点
//            }
//            fast = fast.next;
//            slow = slow.next;
//
//        }
//        return fast;
//    }


//    //倒数第k个结点
//    public ListNode FindKthToTail(ListNode head, int k) {
//        if (head == null || k <= 0) {
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while (k - 1 != 0) {
//            if (fast == null) {
//                return null;
//            }
//            fast = fast.next;
//            k--;
//        }
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }


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
//        ListNode newHead = new ListNode(-1);
//        ListNode tmpHead = newHead;
//
//        while (headA != null && headB != null) {
//            if (headA.val > headB.val) {
//                tmpHead.next = headB;
//                tmpHead = tmpHead.next;
//                headB = headB.next;
//            } else {
//                tmpHead.next = headA;
//                tmpHead = tmpHead.next;
//                headA = headA.next;
//            }
//        }
//        if (headA != null) {
//            tmpHead.next = headA;
//        }
//        if (headB != null) {
//            tmpHead.next = headB;
//        }
//        return newHead.next;
//    }


//    public ListNode partition(ListNode pHead, int x) {
//        if (pHead == null) {
//            return null;
//        }
//        ListNode bs = null;
//        ListNode be = null;
//        ListNode as = null;
//        ListNode ae = null;
//        ListNode cur = pHead;
//        while (cur != null) {
//            if (cur.val < x) {
//                if (bs == null) {
//                    bs = cur;
//                    be = cur;
//                } else {
//                    be.next = cur;
//                    be = be.next;
//                }
//            } else {
//                if (as == null) {
//                    as = cur;
//                    ae = cur;
//                } else {
//                    ae.next = cur;
//                    ae = ae.next;
//                }
//
//            }
//            cur = cur.next;
//        }
//        if (bs == null) {
//            return as;
//        }
//        if (as != null) {
//            ae.next = null;
//        }
//        be.next = as;
//        return bs;
//    }


//    public boolean chkPalindrome(ListNode A) {
//        if (A == null) {
//            return false;
//        }
//        ListNode fast = A;
//        ListNode slow = A;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        ListNode cur = slow.next;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = slow;
//            slow = cur;
//            cur = curNext;
//        }
//        while (A != null && slow != null) {
//            if (A.val != slow.val) {
//                return false;
//            }
//            if (A.next == slow) {
//                return true;
//            }
//            A = A.next;
//            slow = slow.next;
//        }
//        return true;
//    }


//    public ListNode detectCycle(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                break;
//            }
//        }
//        if (fast == null || fast.next == null) {
//            return null;
//        }
//        fast = head;
//        while (fast != null && slow != null) {
//            if (fast == slow) {
//                break;
//            }
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return fast;
//    }
}











