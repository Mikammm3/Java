
// leetcode 25. K 个一组翻转链表
//class Solution {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        if (head == null) return null;
//        int size = 0;
//        ListNode nextList = head;
//        while (nextList != null && size != k) {
//            size++;
//            nextList = nextList.next;
//        }
//        // 不足 k 个
//        if (size < k) return head;
//
//        ListNode prev = head;
//        ListNode cur = head.next;
//        while (cur != nextList) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        head.next = reverseKGroup(nextList, k);
//        return prev;
//
//    }
//}

// leetcode 138. 随机链表的复制
//class Solution {
//    public Node copyRandomList(Node head) {
//        if (head == null) return null;
//        Map<Node, Node> hash = new HashMap<>();
//        Node cur = head;
//        while (cur != null) {
//            Node node = new Node(cur.val);
//            hash.put(cur, node);
//            cur = cur.next;
//        }
//        cur = head;
//        while (cur != null) {
//            hash.get(cur).next = hash.get(cur.next);
//            hash.get(cur).random = hash.get(cur.random);
//            cur = cur.next;
//        }
//
//        return hash.get(head);
//    }
//}

//class Solution {
//    public ListNode sortList(ListNode head) {
//        if (head == null || head.next == null) return head;
//        // 归并排序
//        ListNode fast = head.next;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        ListNode next = slow.next;
//        slow.next = null;
//        ListNode l1 = sortList(head);
//        ListNode l2 = sortList(next);
//        ListNode ret = merge(l1, l2);
//        return ret;
//    }
//
//    public ListNode merge(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                cur.next = l1;
//                l1 = l1.next;
//            } else {
//                cur.next = l2;
//                l2 = l2.next;
//            }
//            cur = cur.next;
//        }
//        if (l1 != null) cur.next = l1;
//        if (l2 != null) cur.next = l2;
//        return dummy.next;
//    }
//
//}

// leetcode 23. 合并 K 个升序链表
//class Solution {
//    public ListNode mergeKLists(ListNode[] lists) {
//        if (lists == null || lists.length == 0) return null;
//        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<>() {
//            public int compare(ListNode o1, ListNode o2) {
//                return o1.val - o2.val;
//            }
//        });
//        for (ListNode head : lists) {
//            if (head != null) {
//                queue.offer(head);
//            }
//        }
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        while (!queue.isEmpty()) {
//            ListNode head = queue.poll();
//            ;
//            cur.next = head;
//            if (head.next != null) queue.add(head.next);
//            cur = cur.next;
//        }
//        return dummy.next;
//    }
//}


// leetcode 146. LRU 缓存
//class LRUCache {
//
//    class ListNode {
//        ListNode next;
//        ListNode prev;
//        int key;
//        int val;
//
//        ListNode(int key, int val) {
//            this.key = key;
//            this.val = val;
//        }
//
//        ListNode() {
//        }
//    }
//
//    Map<Integer, ListNode> hash = new HashMap<>();
//    ListNode dummyHead = new ListNode();
//    ListNode dummyTail = new ListNode();
//    int capacity = 0;
//
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//        dummyHead.next = dummyTail;
//        dummyTail.prev = dummyHead;
//        dummyHead.prev = dummyTail;
//        dummyTail.next = dummyHead;
//    }
//
//    // 头插尾删
//    public int get(int key) {
//        if (!hash.containsKey(key)) return -1;
//        ListNode node = hash.get(key);
//        remove(node);
//        add(node);
//        return node.val;
//    }
//
//    public void put(int key, int value) {
//        ListNode node = hash.getOrDefault(key, null);
//        if (node != null) {
//            node.val = value;
//            remove(node);
//            add(node);
//            return;
//        } else {
//            node = new ListNode(key, value);
//            add(node);
//            hash.put(key, node);
//        }
//        if (hash.size() > capacity) {
//            ListNode tail = dummyTail.prev;
//            hash.remove(tail.key);
//            remove(tail);
//        }
//    }
//
//    public void add(ListNode node) {
//        ListNode head = dummyHead.next;
//        node.next = head;
//        node.prev = dummyHead;
//        head.prev = node;
//        dummyHead.next = node;
//    }
//
//    public void remove(ListNode node) {
//        node.prev.next = node.next;
//        node.next.prev = node.prev;
//    }
//}


// leetcode 94. 二叉树的中序遍历
//class Solution {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ret = new ArrayList<>();
//        if(root == null) return ret;
//        ret.addAll(inorderTraversal(root.left));
//        ret.add(root.val);
//        ret.addAll(inorderTraversal(root.right));
//        return ret;
//    }
//}


// leetcode 104. 二叉树的最大深度
//class Solution {
//    public int maxDepth(TreeNode root) {
//        if (root == null) return 0;
//        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
//    }
//}


// leetcode 226. 翻转二叉树
//class Solution {
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;
//        TreeNode left = root.left;
//        TreeNode right = root.right;
//        root.left = invertTree(right);
//        root.right = invertTree(left);
//        return root;
//
//    }
//}


// leetcode 101. 对称二叉树
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        return isSymmetric(root.left, root.right);
//    }
//
//    public boolean isSymmetric(TreeNode p, TreeNode q) {
//        // 值，结构
//        if (p == null && q == null) return true;
//        if (p == null && q != null || p != null && q == null) return false;
//        if (p.val != q.val) return false;
//        return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
//    }
//}


// leetcode 543. 二叉树的直径
//class Solution {
//    public int diameterOfBinaryTree(TreeNode root) {
//        if (root == null) return 0;
//        getHigh(root);
//        return max;
//    }
//
//    int max = 0;
//
//    public int getHigh(TreeNode root) {
//        if (root == null) return 0;
//        int left = getHigh(root.left);
//        int right = getHigh(root.right);
//        max = Math.max(left + right, max);
//        return Math.max(left, right) + 1;
//    }
//}