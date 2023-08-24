import java.util.*;

public class Test {

    public static void main(String[] args) {
        HashBucket hashBuck = new HashBucket();
        hashBuck.put(1, 1);
        hashBuck.put(3, 3);
        hashBuck.put(13, 13);
        hashBuck.put(5, 5);
        hashBuck.put(6, 6);
        hashBuck.put(16, 6);
        hashBuck.put(8, 6);
        hashBuck.put(18, 6);

        System.out.println(hashBuck.get(6));
        System.out.println(hashBuck.get(61));
        System.out.println();
    }


    public static void main3(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("abc");
        set.add("hello");
        set.add("plo");

        System.out.println(set);

        for (String s : set) {
            System.out.print(s + " ");
        }
    }

    public static void main2(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        TreeMap<String, Integer> map2 = new TreeMap<>();
        map.put("this", 3);
        map.put("pig", 7);
        map.put("a", 5);

        int val = map.get("a");
        System.out.println(val);

        Set<String> set = map.keySet();
        System.out.println();

        Collection<Integer> collection = map.values();


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("key: " + entry.getKey() + "  Values :" + entry.getValue());
        }
    }

    public static void main1(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(3);
        binarySearchTree.insert(6);
        binarySearchTree.insert(8);
        binarySearchTree.insert(5);

        System.out.println();

        binarySearchTree.remove(6);
        System.out.println();
    }

}


//class Solution {
//    public int firstUniqChar(String s) {
//        int[] hash = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            hash[ch - 'a']++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (hash[ch - 'a'] == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}


//class BinarySearchTree2 {
//
//    static class TreeNode {
//        public int key;
//        public TreeNode left;
//        public TreeNode right;
//
//        TreeNode(int key) {
//            this.key = key;
//        }
//    }
//
//    public TreeNode root;
//
//    /**
//     * 插入一个元素
//     *
//     * @param key
//     */
//    public boolean insert(int key) {
//        TreeNode node = new TreeNode(key);
//        if (root == null) {
//            root = node;
//            return true;
//        }
//        TreeNode cur = root;
//        TreeNode parent = null;
//        while (cur != null) {
//            parent = cur;
//            if (cur.key > key) {
//                cur = cur.left;
//            } else if (cur.key < key) {
//                cur = cur.right;
//            } else {
//                return false;
//            }
//        }
//        if (parent.key > key) {
//            parent.left = node;
//        } else {
//            parent.right = node;
//        }
//        return true;
//    }
//
//    //查找key是否存在
//    public TreeNode search(int key) {
//        TreeNode cur = root;
//        while (cur != null) {
//            if (cur.key > key) {
//                cur = cur.left;
//            } else if (cur.key < key) {
//                cur = cur.right;
//            } else {
//                return cur;
//            }
//        }
//        return null;
//    }
//
//    //删除key的值
//    public boolean remove(int key) {
//        //找到你要删除的节点
//        TreeNode cur = root;
//        TreeNode parent = null;
//        while (cur != null) {
//            parent = cur;
//            if (cur.key > key) {
//                cur = cur.left;
//            } else if (cur.key < key) {
//                cur = cur.right;
//            } else {
//                removeNode(cur, parent);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private void removeNode(TreeNode cur, TreeNode parent) {
//        if (cur.left == null) {
//            if (cur == root) {
//                root = cur.right;
//            } else if (parent.left == cur) {
//                parent.left = cur.right;
//            } else {
//                parent.right = cur.right;
//            }
//        } else if (cur.right == null) {
//            if (cur == root) {
//                root = cur.left;
//            } else if (parent.left == cur) {
//                parent.left = cur.left;
//            } else {
//                parent.right = cur.left;
//            }
//        } else {
//            //找替罪羊
//            TreeNode targetParent = cur;
//            TreeNode target = cur.right;
//            while (target.left != null) {
//                targetParent = target;
//                target = target.left;
//            }
//            //赋值
//            cur.key = target.key;
//            if (targetParent.left == target) {
//                targetParent.left = target.right;
//            } else {
//                targetParent.right = target.right;
//            }
//        }
//    }
//
//}


//class HashBucket2 {
//    private static class Node {
//        private int key;
//        private int value;
//        Node next;
//
//
//        public Node(int key, int value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//
//
//    private Node[] array;
//    private int size;   // 当前的数据个数
//    private static final double LOAD_FACTOR = 0.75;
//    private static final int DEFAULT_SIZE = 8;//默认桶的大小
//
//    public int put(int key, int value) {
//        Node node = new Node(key, value);
//        int index = key % array.length;
//        Node cur = array[index];
//        while (cur != null) {
//            if (cur.key == key) {
//                cur.value = value;
//                return value;
//            }
//            cur = cur.next;
//        }
//        node.next = array[index];
//        array[index] = node;
//        size++;
//        if (loadFactor() >= LOAD_FACTOR) {
//            resize();
//        }
//        return value;
//    }
//
//
//    private void resize() {
//        Node[] tmpArr = new Node[2 * array.length];
//        for (int i = 0; i < array.length; i++) {
//            Node cur = array[i];
//            while (cur != null) {
//                Node curNext = cur.next;
//                int nexIndex = cur.key % tmpArr.length;
//                cur.next = tmpArr[nexIndex];
//                tmpArr[nexIndex] = cur;
//                cur = curNext;
//            }
//        }
//        array = tmpArr;
//    }
//
//
//    private double loadFactor() {
//        return size * 1.0 / array.length;
//    }
//
//
//    public HashBucket2() {
//        array = new Node[DEFAULT_SIZE];
//    }
//
//
//    public int get(int key) {
//        int index = key % array.length;
//        Node cur = array[index];
//        while (cur != null) {
//            if (cur.key == key) {
//                return cur.value;
//            }
//            cur = cur.next;
//        }
//        return -1;
//    }
//}