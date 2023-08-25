public class HashBucket {

    static class Node {
        public int key;
        public int val;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node[] arr;
    public int usedSize;

    public HashBucket() {
        arr = new Node[10];
    }

    public void put(int key, int val) {
        //先得知道放到哪个下标里
        int index = key % arr.length;
        //再看看表中有没有key，如果有，那val得更新
        Node cur = arr[index];
        while (cur != null) {
            if (cur.key == key) {
                cur.val = val;
                return;
            }
            cur = cur.next;
        }

        //没有这个key
        //头插法
        Node node = new Node(key, val);
        node.next = arr[index];
        arr[index] = node;
        usedSize++;

        if (loadFactor() >= 0.75) {
            //超载
            resize();
        }
    }

    private void resize() {
        Node[] tmpArr = new Node[2 * arr.length];
        //遍历原来的数组 将所有元素 重新哈希 到新的数组当中
        for (int i = 0; i < arr.length; i++) {
            Node cur = arr[i];
            while (cur != null) {
                Node curNext = cur.next;
                int index = cur.key % tmpArr.length;
                //头插
                cur.next = tmpArr[index];//先绑定后面的数据
                tmpArr[index] = cur;//更新头节点
                cur = curNext;
            }
        }

        arr = tmpArr;
    }

    //计算负载因子
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
