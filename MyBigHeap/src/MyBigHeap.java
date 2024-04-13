import java.util.Arrays;

public class MyBigHeap {
    //因为堆实际上是用层序遍历的方式存储在顺序表中的
    //所以我们需要一个数组
    private int[] elem;
    private int usedSize;

    // 生成构造方法
    public MyBigHeap() {
        elem = new int[10];
    }

    // 初始化
    public void initHeap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            elem[i] = arr[i];
            usedSize++;
        }
    }

    //创建大根堆的前提是先初始化数组
    //得从最后一棵子树开始调整 => 已知，数组最后一个元素的下标，求他的父亲节点
    //每一次调整，都是从根节点 往下 调整(向下调整)
    public void createHeap() {
        for (int parent = (usedSize - 1 - 1) / 2; parent >= 0; parent--) {
            shiftDown(parent, usedSize);
        }
    }

    private void shiftDown(int parent, int usedSize) {
        int child = 2 * parent + 1;// 左孩子
        // 进入循环说明有左孩子
        while (child < usedSize) {
            if (child + 1 < usedSize && elem[child] < elem[child + 1]) {
                //存在右孩子并且右孩子比左孩子要大
                child++;
            }
            //来到这里，child 一定是左右孩子的最大值
            //然后和 parent 比较，进行调整
            if (elem[parent] < elem[child]) {
                swap(parent, child);
                //还要再看看交换完的是否符合子树的大根堆规则
                //所以parent要向下更新成child，再进行比较调整
                parent = child;
                child = 2 * parent + 1;
            } else {
                //根比左右孩子大
                break;
            }
        }
    }

    private void swap(int parent, int child) {
        int tmp = elem[parent];
        elem[parent] = elem[child];
        elem[child] = tmp;
    }

    public void offer(int val) {
        // 首先判断堆满没满
        if (usedSize == elem.length) {
            elem = Arrays.copyOf(elem, elem.length * 2);
        }
        elem[usedSize] = val;
        shiftUp(usedSize);
        usedSize++;
    }

    private void shiftUp(int child) {
        int parent = (child - 1) / 2;
        while (child > 0) {
            //child等于 0 的时候说明循环结束，此时parent < 0
            if (elem[parent] < elem[child]) {
                swap(parent, child);
                //让child向上更新成parent，看看新的堆是否符合大根堆要求
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;

            }
        }
    }

    public int poll() {
        if (usedSize == 0) {
            return Integer.MIN_VALUE;
        }
        int ret = elem[0];
        // 1. 让堆顶元素与最后一个元素交换
        swap(0, usedSize - 1);
        usedSize--;

        // 2. 向下调整 0 下标的元素
        shiftDown(0, usedSize);
        return ret;
    }

}
