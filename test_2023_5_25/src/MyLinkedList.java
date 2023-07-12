import java.util.Stack;

// 2、无头双向链表实现
public class MyLinkedList {
    public ListNode head;//头
    public ListNode last;//尾巴

    static class ListNode {
        private int val;
        private ListNode prev;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            last = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            last = node;
            return;
        }
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
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head) {
                    //只有一个结点
                    if (cur == last) {
                        head = null;
                        last = null;
                    } else {
                        head = head.next;
                        head.prev = null;
                    }

                } else {
                    //中间结点
                    if (cur.next != null) {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    } else {
                        //尾巴结点
                        last = last.prev;
                        last.next = null;
                    }
                }
                return;
            } else {
                cur = cur.next;
            }
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head) {
                    //只有一个结点
                    if (cur == last) {
                        head = null;
                        last = null;
                    } else {
                        head = head.next;
                        head.prev = null;
                    }

                } else {
                    //中间结点
                    if (cur.next != null) {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    } else {
                        //尾巴结点
                        last = last.prev;
                        last.next = null;
                    }
                }
                cur = cur.next;
            } else {
                cur = cur.next;
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
        System.out.println();
    }

    public void clear() {
        ListNode cur = head;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.prev = null;
            cur.next = null;
            cur = curNext;
        }
        head = null;
        last = null;
    }


    public void reversePrintList() {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (!stack.empty()) {
            ListNode tmp = stack.pop();
            System.out.print(tmp.val + " ");
        }
        System.out.println();
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //左括号
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                //右括号
                if (!stack.empty()) {
                    char top = stack.peek();
                    if (top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    //栈为空，没有左括号
                    return false;
                }
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}


/*
// 2、无头双向链表实现
public class MyLinkedList {
    //结点
    static class ListNode {
        private int val;
        private ListNode prev;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;//双向链表的头结点
    public ListNode last;//双向链表的尾巴结点


    //得到链表的长度
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

    //查找是否包含关键字key是否在链表当中
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

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        //如果链表为空
        if (head == null) {
            head = node;
            last = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        //如果链表为空
        if (head == null) {
            addFirst(data);
        }
        last.next = node;
        node.prev = last;
        last = node;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        //首先检查index合不合法
        if (index < 0 || index > size()) {
            //可以扔异常
            System.out.println(index + "位置不合法");
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
        ListNode next = head;
        while (index != 0) {
            next = next.next;
            index--;
        }
        ListNode prev = next.prev;
        ListNode node = new ListNode(data);
        node.prev = prev;
        node.next = next;
        prev.next = node;
        next.prev = node;
    }


    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (head == null) {
            return;
        }
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head) {
                    //删除头结点
                    head = head.next;
                    //考虑只有一个结点的情况
                    if (head != null) {
                        head.prev = null;
                    } else {
                        last = null;
                    }
                } else {
                    if (cur.next != null) {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    } else {
                        last = last.prev;
                        last.next = null;
                    }
                }
                return;
            } else {
                cur = cur.next;
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
                if (cur == head) {
                    //删除头结点
                    head = head.next;
                    //考虑只有一个结点的情况
                    if (head != null) {
                        head.prev = null;
                    } else {
                        last = null;
                    }
                } else {
                    if (cur.next != null) {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    } else {
                        last = last.prev;
                        last.next = null;
                    }
                }
                //继续删除
                cur = cur.next;
            } else {
                cur = cur.next;
            }
        }
    }


    public void clear() {
        ListNode cur = head;
        while (cur != null) {
            cur.prev = null;
            ListNode curNext = cur.next;
            cur.next = null;
            cur = curNext;
        }
        head = null;
        last = null;
    }
}
*/


//
//
//public class MyLinkedList {
//
//
//    static class ListNode {
//        private int val;
//        private ListNode prev;
//        private ListNode next;
//
//        public ListNode(int val) {
//            this.val = val;
//        }
//
//    }
//
//    public ListNode head;
//    public ListNode last;
//
//    //头插法
//    public void addFirst(int data) {
//        ListNode node = new ListNode(data);
//        if (head == null) {
//            head = node;
//            last = node;
//        } else {
//            node.next = head;
//            head.prev = node;
//            head = node;
//        }
//    }
//
//    //尾插法
//    public void addLast(int data) {
//        if (head == null) {
//            addFirst(data);
//            return;
//        }
//        ListNode node = new ListNode(data);
//        last.next = node;
//        node.prev = last;
//        last = node;
//
//    }
//
//    //任意位置插入,第一个数据节点为0号下标
//    public void addIndex(int index, int data) {
//        if (index < 0 || index > size()) {
//            return;
//        }
//        if (index == 0) {
//            addFirst(data);
//            return;
//        }
//        if (index == size()) {
//            addLast(data);
//            return;
//        }
//        // 1 2 3 4 5  index = 1
//        ListNode node = new ListNode(data);
//        ListNode cur = head;
//        while (index != 0) {
//            cur = cur.next;
//            index--;
//        }
//        node.prev = cur.prev;
//        node.next = cur;
//        cur.prev.next = node;
//        cur.prev = node;
//
//
//    }
//
//
//    //删除第一次出现关键字为key的节点
//    public void remove(int key) {
//    }
//
//    //删除所有值为key的节点
//    public void removeAllKey(int key) {
//    }
//
//    //得到单链表的长度
//    public int size() {
//        ListNode cur = head;
//        int count = 0;
//        while (cur != null) {
//            count++;
//            cur = cur.next;
//        }
//        return count;
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
//
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
//    public void clear() {
//
//    }
//
//}





