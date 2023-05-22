/*
// 1、无头单向非循环链表实现
public class SingleLinkedList {

    static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode head;

    public ListNode creatList() {
        ListNode node1 = new ListNode(12);
        ListNode node2 = new ListNode(23);
        ListNode node3 = new ListNode(34);
        ListNode node4 = new ListNode(45);
        ListNode node5 = new ListNode(56);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        this.head = node1;
        return head;
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
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        node.next = head.next;
        head = node;
    }

    //尾插法
    public void addLast(int data) {
        ListNode cur = head;
        ListNode node = new ListNode(data);
        if (cur == null) {
            head = node;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
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

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        if (index < 0 || index > size()) {
            System.out.println("不合法");
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
        ListNode node = new ListNode(data);
        int tmp = index - 1;
        while (tmp != 0) {
            cur = cur.next;
            tmp--;
        }
        node.next = cur.next;
        cur.next = node;
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
        ListNode cur = head;
        ListNode del = null;
        while (cur.next.val != key) {
            cur = cur.next;
        }
        if (cur.next.val == key) {
            del = cur.next;
        }
        cur.next = del.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode prev = head.next;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (head.val == key) {
            head = head.next;
        }
    }


//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode cur = head.next;
//        head.next = null;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = head;
//            head = cur;
//            cur = curNext;
//        }
//        return head;
//    }
//
//    public ListNode middleNode(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast.next != null) {
//            if (fast != null) {
//                fast = fast.next.next;
//                slow = fast.next;
//            }
//        }
//        return slow;
//    }
//
//    public ListNode FindKthToTail(ListNode head, int k) {
//        if (k <= 0 || k > size()) {
//            return null;
//        }
//        if (head == null) {
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        int tmp = k - 1;
//        while (tmp != 0) {
//            fast = fast.next;
//            tmp--;
//        }
//        while (fast != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow;
//    }
//
//
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode nH = new ListNode();
//        ListNode tH = nH;
//        if (list1.val < list2.val) {
//            nH = list1;
//            tH = nH;
//            list1 = list1.next;
//        } else {
//            nH = list2;
//            tH = nH;
//            list2 = list2.next;
//
//        }
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                tH.next = list1;
//                tH = list1;
//                list1 = list1.next;
//            } else {
//                tH.next = list2;
//                tH = list2;
//                list2 = list2.next;
//            }
//        }
//        while (list1 != null) {
//            tH.next = list1;
//            list1 = list1.next;
//        }
//        while (list2 != null) {
//            tH.next = list2;
//            list2 = list2.next;
//        }
//        return nH;
//    }
}*/


public class MySingleList {

    static class ListNode {
        public int val;//结点的值域
        public ListNode next;//下一个结点的地址

        //提供构造方法
        public ListNode(int val) {
            this.val = val;
        }
    }

    //对于链表本身来说，必须得有一个头结点
    public ListNode head;//表示当前链表的头结点

    //因为没有完整的链表，所以我们手动创建一个链表
    public void creatList() {
        ListNode node1 = new ListNode(12);
        ListNode node2 = new ListNode(23);
        ListNode node3 = new ListNode(34);
        ListNode node4 = new ListNode(45);
        ListNode node5 = new ListNode(56);

        //通过next建立结点之间的联系
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        this.head = node1;
    }


    //得到单链表的长度
    public int size() {
        //定义一个cur来遍历链表
        ListNode cur = head;
        int count = 0;//计数器

        //cur == null说明链表遍历完了
        while (cur != null) {
            count++;
            //cur走一步，
            cur = cur.next;
        }
        return count;
    }

    public void clear() {
        this.head = null;//头结点为null，就找不到其他结点了
    }

    //打印链表的数据
    public void display() {
        ListNode cur = head;
        //遍历链表
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        //遍历链表，找到了就返回true
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        //找不到就返回false
        return false;
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            return;
        }
        //先绑定后面的数据
        node.next = head;
        //再让head更新成node
        head = node;
    }


    //尾插法
    public void addLast(int data) {
        //第一步：找到最后一个结点的位置
        ListNode cur = head;
        //如果cur为null，说明链表没有结点
        if (cur == null) {
            //头插
            addFirst(data);
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        //循环结束后，cur就来到了最后一个结点的位置
        //第二部：插入
        ListNode node = new ListNode(data);
        cur.next = node;
    }


    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        //先判断index的合法性
        if (index < 0 || index > size()) {
            System.out.println("index 不合法");
            return;
        }
        if (index == 0) {
            //头插
            addFirst(data);
            return;
        }
        if (index == size()) {
            //尾插
            addLast(data);
            return;
        }
        ListNode cur = head;
        int tmp = index - 1;
        //走index-1步,找到要删除结点位置的前一个结点
        while (tmp != 0) {
            cur = cur.next;
            tmp--;
        }
        //绑定后面的数据
        ListNode node = new ListNode(data);
        node.next = cur.next;
        //插入
        cur.next = node;
    }


    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (head == null) {
            return;
        }
        //单独删除头结点
        if (head.val == key) {
            head = head.next;
            return;
        }

        ListNode prev = findKeySubOne(key);

        if (prev != null) {
            ListNode del = prev.next;
            prev.next = del.next;
        } else {
            System.out.println("没有你要删除的数字");
        }
    }

    public ListNode findKeySubOne(int key) {
        ListNode cur = head;
        //尾巴结点
        //找到要删除的前一个结点
        //必须得判断cur.next是否为空，不然有可能会空指针异常
        //如果cur.next==null,那么cur已经是尾巴结点，就没有继续判断的必要了
        while (cur.next != null) {
            if (cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {

    }

}
