import com.sun.org.apache.regexp.internal.RE;


public class HashBucket2<K, V> {

    static class Node<K, V> {
        public K key;
        public V val;
        public Node<K, V> next;


        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node<K, V>[] arr;
    public int usedSize;

    public HashBucket2() {
        arr = (Node<K, V>[]) new Node[10];
    }


    public void put(K key, V val) {
        //hashCode()方法能将一个对象转变成整数
        int hash = key.hashCode();
        int index = hash % arr.length;

        Node<K, V> cur = arr[index];

        //遍历链表，看看key是否在来链表中存在
        while (cur != null) {
            //判断引用类型的对象是否相等得用equals
            if (cur.key.equals(key)) {
                cur.val = val;
                return;
            }
            cur = cur.next;
        }

        Node<K, V> node = new Node<>(key, val);
        node.next = arr[index];
        arr[index] = node;
        usedSize++;

        if (loadFacotr() >= 0.75) {
            resize();
        }
    }

    private void resize() {
        Node<K, V>[] tmpArr = (Node<K, V>[]) new Node[arr.length * 2];
        //遍历数组，所有元素 重新哈希
        for (int i = 0; i < arr.length; i++) {
            Node<K, V> cur = arr[i];
            while (cur != null) {
                //记录cur的下一个节点
                Node<K, V> curNext = cur.next;
                //调用hashCode方法将key转变成整数
                int hash = cur.key.hashCode();
                int nexIndex = hash % tmpArr.length;
                //进行头插
                cur.next = tmpArr[nexIndex];
                tmpArr[nexIndex] = cur;
                cur = curNext.next;
            }
        }

        arr = tmpArr;
    }

    private double loadFacotr() {
        return usedSize * 1.0 / arr.length;
    }


    public V get(K key) {
        int hash = key.hashCode();
        //得到下标，遍历链表
        int index = hash % arr.length;
        Node<K, V> cur = arr[index];
        while (cur != null) {
            if (cur.key.equals(key)) {
                return cur.val;
            }
            cur = cur.next;
        }
        //没找到就返回null
        return null;
    }
}









