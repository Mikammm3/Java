
// leetcode 146. LRU 缓存
//class LRUCache {
//    class ListNode {
//        int key, value;
//        ListNode prev, next;
//
//        public ListNode(int k, int v) {
//            key = k;
//            value = v;
//        }
//    }
//
//    Map<Integer, ListNode> cache = new HashMap<>();
//    int capacity;
//    // 引入虚拟头尾节点
//    ListNode head = new ListNode(-1, -1);
//    ListNode tail = new ListNode(-1, -1);
//
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//        // 引用，不用判断边界
//        head.next = tail;
//        tail.prev = head;
//    }
//
//    public int get(int key) {
//        ListNode node = getAndDelete(key);
//        if (node == null) return -1;
//        return node.value;
//    }
//
//    public void put(int key, int value) {
//        ListNode node = getAndDelete(key);
//        if (node != null) {
//            node.value = value;
//            return;
//        }
//        // 添加节点, 放入书堆，判断缓存大小
//        node = new ListNode(key, value);
//        cache.put(key, node);
//        addFirst(node);
//        if (cache.size() > capacity) {
//            // 删除尾巴节点
//            ListNode t = tail.prev;
//            remove(t);
//            cache.remove(t.key);
//        }
//
//    }
//
//
//    public ListNode getAndDelete(int key) {
//        if (!cache.containsKey(key)) {
//            // 没书
//            return null;
//        }
//
//        // 有书，删除，放到书头
//        ListNode node = cache.get(key);
//        remove(node);
//        addFirst(node);
//        return node;
//    }
//
//    public void remove(ListNode cur) {
//        ListNode curNext = cur.next;
//        ListNode curPrev = cur.prev;
//        curPrev.next = curNext;
//        curNext.prev = curPrev;
//    }
//
//    // 头插
//    public void addFirst(ListNode cur) {
//        ListNode headNext = head.next;
//        cur.next = headNext;
//        cur.prev = head;
//        headNext.prev = cur;
//        head.next = cur;
//    }
//}

// leetcode 94. 二叉树的中序遍历
//class Solution {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ret = new ArrayList<>();
//        if (root == null) return ret;
//        ret.addAll(inorderTraversal(root.left));
//        ret.add(root.val);
//        ret.addAll(inorderTraversal(root.right));
//        return ret;
//    }
//}