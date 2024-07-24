

public class HashBucket {
    // 链表 + 数组
    static class Node {
        public int key;
        public int val;
        public Node next;

        // 提供构造方法
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    // 数组
    public Node[] arr;
    // 节点个数
    public int usedSize;

    public HashBucket() {
        arr = new Node[10];
    }

    public void put(int key, int val) {
        // 如果负载因子大于等于 0.75，那就需要扩容
        if (loadFactor() >= 0.75) {
            resize();
        }

        // 计算哈希码
        int index = key % arr.length;

        // 先遍历一遍链表看看有没有 key，如果有，得更新 val
        Node cur = arr[index];
        while (cur != null) {
            // key 相同，更新 val
            if (cur.key == key) {
                cur.val = val;
                return;
            }
            cur = cur.next;
        }

        // 创建节点
        Node node = new Node(key, val);
        // 头插链表
        node.next = arr[index];// 先绑定后面的数据，再进行连接
        arr[index] = node;
        usedSize++;
    }

    private void resize() {
        Node[] tmpArr = new Node[arr.length * 2];
        // 遍历原来的数组，将所有的元素，重新哈希到新数组当中
        for (int i = 0; i < arr.length; i++) {
            Node cur = arr[i];
            while (cur != null) {
                Node curNext = cur.next;
                int newIndex = cur.key % tmpArr.length;
                // 头插
                cur.next = tmpArr[newIndex];// 先绑定后面的数据
                tmpArr[newIndex] = cur;// 更新头节点
                cur = curNext;
            }
        }
        arr = tmpArr;
    }


    private double loadFactor() {
        return usedSize * 1.0 / arr.length;
    }


    public int get(int key) {
        int index = key % arr.length;
        Node cur = arr[index];
        while (cur != null) {
            if (cur.key == key) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
}


