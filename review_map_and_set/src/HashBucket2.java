
public class HashBucket2<K, V> {
    // 数组 + 链表
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

    // 提供构造方法
    public HashBucket2() {
        this.arr = (Node<K, V>[]) new Node[10];
    }

    public void put(K key, V val) {
        // 判断负载因子
        if (loadFactor() >= 0.75) {
            resize();
        }
        // 计算下标
        int index = key.hashCode() % arr.length;

        // 先看看链表中是否存在相同的 key
        Node<K, V> cur = arr[index];
        while (cur != null) {
            if (cur.key.equals(key)) {
                cur.val = val;
                return;
            }
            cur = cur.next;
        }
        // 插入，头插
        Node<K, V> node = new Node<>(key, val);
        // 先绑定后面的数据，再更新头节点
        node.next = arr[index];
        arr[index] = node;
        usedSize++;
    }

    private void resize() {
        // 扩容
        Node<K, V>[] tmpArr = (Node<K, V>[]) new Node[arr.length * 2];
        // 重新哈希
        for (int i = 0; i < arr.length; i++) {
            Node<K, V> cur = arr[i];
            while (cur != null) {
                Node<K, V> curNext = cur.next;
                // 重新计算下标
                int newIndex = cur.key.hashCode() % tmpArr.length;
                // 头插,先绑定后面的数据，然后再更新头节点
                cur.next = tmpArr[newIndex];
                tmpArr[newIndex] = cur;
                cur = curNext;
            }
        }
        arr = tmpArr;

    }

    private double loadFactor() {
        return usedSize * 1.0 / arr.length;
    }


    public V get(K key) {
        // 遍历链表即可
        int index = key.hashCode() % arr.length;
        Node<K, V> cur = arr[index];
        while (cur != null) {
            if (cur.key.equals(key)) {
                return cur.val;
            }
            cur = cur.next;
        }
        // 没找到就返回 null
        return null;
    }
}
