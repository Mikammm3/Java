

// 牛客网 反转部分单向链表
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int[] arr = new int[n];
//            Node head = null;
//            Node cur = head;
//            // 先创建出链表，然后再翻转
//            // 接收值并创建链表
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = in.nextInt();
//                if (i == 0) {
//                    head = new Node(arr[i]);
//                    cur = head;
//                } else {
//                    cur.next = new Node(arr[i]);
//                    cur = cur.next;
//                }
//            }
//            int l = in.nextInt();
//            int r = in.nextInt();
//            Node newHead = reverseList(head, l, r);
//
//            // 打印值
//            cur = newHead;
//            while (cur != null) {
//                System.out.print(cur.val + " ");
//                cur = cur.next;
//            }
//
//        }
//    }
//
//
//    public static Node reverseList(Node head, int left, int right) {
//        // 可以使用虚拟头节点
//        Node dummy = new Node(-1);
//        dummy.next = head;
//
//        // 先记录要反转的次数
//        int count = right - left;
//        // 找到待反转的节点的前一个节点
//        Node prev = dummy;
//        while (left - 1 != 0) {
//            prev = prev.next;
//            left--;
//        }
//        // 这里进行反转
//        Node cur = prev.next;
//        while (count != 0) {
//            Node curNext = cur.next;
//
//            cur.next = curNext.next;
//            curNext.next = prev.next;
//            prev.next = curNext;
//            count--;
//        }
//        // 返回虚拟头节点的下一个节点
//        return dummy.next;
//
//    }
//}
//
//class Node {
//    int val;
//    Node next;
//
//    public Node(int val) {
//        this.val = val;
//    }
//}