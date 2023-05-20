/*
public class Main {
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


    public void addIndex(int index, int data) {
        if (index < 0 || index > size()) {
            System.out.println("index 不合法");
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
        int tmp = index - 1;
        ListNode node = new ListNode(data);
        ListNode cur = head;
        while (tmp != 0) {
            cur = cur.next;
            tmp--;
        }
        node.next = cur.next;
        cur.next = node;

    }
}*/
