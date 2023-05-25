/*public class ReviewMyLinkedList {
    //实现双向无头非循环链表

    static class ListNode {
        public int val;
        public ListNode prev;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;//头结点
    public ListNode last;//尾巴结点

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            last = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }

    }

    //尾插法
    public void addLast(int data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        ListNode node = new ListNode(data);
        node.prev = last;
        last.next = node;
        last = node;
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
        ListNode node = new ListNode(data);
        ListNode cur = head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        node.prev = cur.prev;
        node.next = cur;
        cur.prev.next = node;
        cur.prev = node;
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

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (head == null) {
            return;
        }
        if (head.val == key) {
            head = head.next;
            return;
        }
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == key) {
                ListNode prev = cur.prev;
                ListNode curNext = cur.next;
                curNext.prev = prev;
                prev.next = curNext;
                return;
            }
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (head == null) {
            return;
        }
        ListNode cur = head;

        while (cur != null) {
            if (cur.val == key) {
                ListNode prev = cur.prev;
                ListNode curNext = cur.next;
                curNext.prev = prev;
                prev.next = curNext;
                return;
            }
        }
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        ListNode cur = head;
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
    }

    public void clear() {
        head = null;
        last = null;
    }
}*/
