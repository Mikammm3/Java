
//LeetCode 剑指 Offer 06. 从尾到头打印链表
//class Solution {
//    //因为不清楚链表有几个元素，所以可以利用顺序表来添加元素
//    ArrayList<Integer> arrayList = new ArrayList<>();
//    public int[] reversePrint(ListNode head) {
//        revserseAdd(head);
//        int[] ans = new int[arrayList.size()];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = arrayList.get(i);
//        }
//        return ans;
//    }
//
//    public  void revserseAdd(ListNode head) {
//        //遍历完了就说明递归结束了
//        if (head == null) {
//            return;
//        }
//        //利用递归先遍历完链表，然后再返回增加元素
//        revserseAdd(head.next);
//        arrayList.add(head.val);
//    }
//}