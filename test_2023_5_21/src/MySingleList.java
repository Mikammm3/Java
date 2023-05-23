//public class MySingleList {
//
//    static class ListNode {
//        public int val;//结点的值域
//        public ListNode next;//下一个结点的地址
//
//        //提供构造方法
//        public ListNode(int val) {
//            this.val = val;
//        }
//    }
//
//    //对于链表本身来说，必须得有一个头结点
//    public ListNode head;//表示当前链表的头结点
//
//    //因为没有完整的链表，所以我们手动创建一个链表
//    public void creatList() {
//        ListNode node1 = new ListNode(12);
//        ListNode node2 = new ListNode(23);
//        ListNode node3 = new ListNode(34);
//        ListNode node4 = new ListNode(45);
//        ListNode node5 = new ListNode(56);
//
//        //通过next建立结点之间的联系
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//
//        this.head = node1;
//    }
//
//
//    //得到单链表的长度
//    public int size() {
//        //定义一个cur来遍历链表
//        ListNode cur = head;
//        int count = 0;//计数器
//
//        //cur == null说明链表遍历完了
//        while (cur != null) {
//            count++;
//            //cur走一步，
//            cur = cur.next;
//        }
//        return count;
//    }
//
//    public void clear() {
//        this.head = null;//头结点为null，就找不到其他结点了
//    }
//
//    //打印链表的数据
//    public void display() {
//        ListNode cur = head;
//        //遍历链表
//        while (cur != null) {
//            System.out.print(cur.val + " ");
//            cur = cur.next;
//        }
//        System.out.println();
//    }
//
//    //查找是否包含关键字key是否在单链表当中
//    public boolean contains(int key) {
//        //遍历链表，找到了就返回true
//        ListNode cur = head;
//        while (cur != null) {
//            if (cur.val == key) {
//                return true;
//            }
//            cur = cur.next;
//        }
//        //找不到就返回false
//        return false;
//    }
//
//    //头插法
//    public void addFirst(int data) {
//        ListNode node = new ListNode(data);
//        if (head == null) {
//            head = node;
//            return;
//        }
//        //先绑定后面的数据
//        node.next = head;
//        //再让head更新成node
//        head = node;
//    }
//
//
//    //尾插法
//    public void addLast(int data) {
//        //第一步：找到最后一个结点的位置
//        ListNode cur = head;
//        //如果cur为null，说明链表没有结点
//        if (cur == null) {
//            //头插
//            addFirst(data);
//            return;
//        }
//        while (cur.next != null) {
//            cur = cur.next;
//        }
//        //循环结束后，cur就来到了最后一个结点的位置
//        //第二部：插入
//        ListNode node = new ListNode(data);
//        cur.next = node;
//    }
//
//
//    //任意位置插入,第一个数据节点为0号下标
//    public void addIndex(int index, int data) {
//        //先判断index的合法性
//        if (index < 0 || index > size()) {
//            System.out.println("index 不合法");
//            return;
//        }
//        if (index == 0) {
//            //头插
//            addFirst(data);
//            return;
//        }
//        if (index == size()) {
//            //尾插
//            addLast(data);
//            return;
//        }
//        ListNode cur = head;
//        int tmp = index - 1;
//        //走index-1步,找到要删除结点位置的前一个结点
//        while (tmp != 0) {
//            cur = cur.next;
//            tmp--;
//        }
//        //绑定后面的数据
//        ListNode node = new ListNode(data);
//        node.next = cur.next;
//        //插入
//        cur.next = node;
//    }
//
//
//    //删除第一次出现关键字为key的节点
//    public void remove(int key) {
//        if (head == null) {
//            return;
//        }
//        //单独删除头结点
//        if (head.val == key) {
//            head = head.next;
//            return;
//        }
//
//        ListNode prev = findKeySubOne(key);
//
//        if (prev != null) {
//            ListNode del = prev.next;
//            prev.next = del.next;
//        } else {
//            System.out.println("没有你要删除的数字");
//        }
//    }
//
//    public ListNode findKeySubOne(int key) {
//        ListNode cur = head;
//        //尾巴结点
//        //找到要删除的前一个结点
//        //必须得判断cur和cur.next是否为空，不然有可能会空指针异常
//        //如果cur.next==null,那么cur已经是尾巴结点，就没有继续判断的必要了
//        while (cur != null && cur.next != null) {
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
//            //链表为空
//            return;
//        }
//        ListNode del = head.next;
//        ListNode prev = head;
//        while (del != null) {
//            if (del.val == key) {
//                //删除
//                prev.next = del.next;
//                del = del.next;
//            } else {
//                prev = del;
//                del = del.next;
//            }
//        }
//        if (head.val == key) {
//            head = head.next;
//        }
//    }
//
//}





