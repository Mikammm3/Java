import java.util.Arrays;

public class TestHeap {
    //因为堆实际上是用层序遍历的方式存储在顺序表中的
    //所以我们需要一个数组
    private int[] elem;

    private int useSize;//元素个数

    public TestHeap() {
        this.elem = new int[10];
    }

    public void initHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            elem[i] = array[i];
            useSize++;
        }
    }

    //创建大根堆的前提是先初始化数组
    //得从最后一棵子树开始调整 => 已知，数组最后一个元素的下标，求他的父亲节点
    //每一次调整，都是从根节点 往下 调整(向下调整)
    public void createHeap() {
        for (int parent = (useSize - 1 - 1) / 2; parent >= 0; parent--) {
            shiftDown(parent, useSize);//向下调整
        }
    }

    private void shiftDown(int parent, int useSize) {
        int child = 2 * parent + 1;//左孩子
        while (child < useSize) {
            if (child + 1 < useSize && elem[child] < elem[child + 1]) {
                //存在右孩子并且右孩子比左孩子要大
                child++;
            }
            //来到这里，child一定是左右孩子的最大值
            //然后和parent比较，进行调整
            if (elem[child] > elem[parent]) {
                swap(child, parent);//交换
                //还要再看看交换完的是否符合子树的大根堆规则
                //所以parent要向下更新成child，再进行比较调整
                parent = child;
                child = 2 * parent + 1;
            } else {
                //左右孩子都比根小
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int tmp = elem[i];
        elem[i] = elem[j];
        elem[j] = tmp;
    }


    public void offer(int val) {
        //先判断满没满
        if (isFull()) {
            this.elem = Arrays.copyOf(elem, elem.length * 2);
        }

        //元素插入到最后一个位置
        this.elem[useSize] = val;
        //进行向上调整
        shiftUp(useSize);
        //调整完后useSize++
        useSize++;
    }

    //跟向下调整类似
    private void shiftUp(int child) {
        int parent = (child - 1) / 2;
        //child等于0的时候说明循环结束，此时parent < 0
        while (child > 0) {
            if (elem[child] > elem[parent]) {
                swap(child, parent);
                //让child向上更新成parent，看看新的堆是否符合大根堆要求
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }
    }

    private boolean isFull() {
        return this.useSize == elem.length;
    }

    public int poll() {
        //1.让堆顶元素与最后一个元素交换
        int tmp = elem[0];
        swap(0, useSize - 1);
        useSize--;

        //2.向下调整0下标的元素
        shiftDown(0, useSize);
        return tmp;
    }

}
