public class ReviewSingleList2 {
    //结点
    static class ListNode {
        public int val;
        public ListNode next;


        public ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode head;//头结点


    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        ListNode cur = this.head;
        if (this.head == null) {
            addFirst(data);
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        ListNode node = new ListNode(data);
        cur.next = node;
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
        ListNode cur = findIndexSubOne(index);
        ListNode node = new ListNode(data);
        node.next = cur.next;
        cur.next = node;
    }


    private ListNode findIndexSubOne(int index) {
        ListNode cur = this.head;
        while (index - 1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.val == key) {
            this.head = this.head.next;
            return;
        }
        ListNode cur = findKeySubOne(key);
        if (cur == null) {
            return;
        }
        ListNode del = cur.next;
        cur.next = del.next;
    }

    private ListNode findKeySubOne(int key) {

        ListNode cur = this.head;
        while (cur != null && cur.next != null) {
            if (cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (this.head == null) {
            return;
        }
        ListNode cur = this.head.next;
        ListNode prev = this.head;
        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.val == key) {
            this.head = this.head.next;
        }
    }

    //得到单链表的长度
    public int size() {
        ListNode cur = this.head;
        int cnt = 0;
        while (cur != null) {
            cnt++;
            cur = cur.next;
        }
        return cnt;
    }

    public void clear() {
        this.head = null;
    }

    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    //删除所有val值元素
//    public ListNode removeElements(ListNode head, int val) {
//        if (head == null) {
//            return null;
//        }
//        while (head.val == val) {
//            head = head.next;
//        }
//        ListNode cur = head.next;
//        ListNode prev = head;
//        while (cur != null) {
//            if (cur.val == val) {
//                prev.next = cur.next;
//                cur = cur.next;
//            } else {
//                prev = cur;
//                cur = cur.next;
//            }
//        }
//        return head;
//    }

    //翻转链表
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode cur = head.next;
//        ListNode prev = head;
//        head.next = null;
//        while (cur != null) {
//            ListNode curNext = cur.next;//记录cur的下一个位置
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        return prev;
//    }


    //找中间结点
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

    //牛客网 链表中倒数第k个结点
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k < 0) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k - 1 != 0) {
            fast = fast.next;
            k--;
        }
        //你先走，然后我们同时同速走，距离不变，就是k-1
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


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


    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode bs = new ListNode(-1);
        ListNode be = new ListNode(-1);
        ListNode as = new ListNode(-1);
        ListNode ae = new ListNode(-1);
        ListNode cur = pHead;
        if (pHead == null) {
            return null;
        }
        while (cur != null) {
            if (cur.val < x) {
                bs.next = cur;
                be = cur;
            }
        }

    }


}




