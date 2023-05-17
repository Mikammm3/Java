import java.util.Arrays;

public class MyArrayList {
    private int[] elem;//用来存放数据元素
    private int usedSize;//代表当前顺序表中的有效数据个数

    private static final int DEFAULT_SIZE = 10;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
    }

    //指定容量
    public MyArrayList(int initcapacity) {
        this.elem = new int[initcapacity];
    }

    // 打印顺序表,实际上就是遍历数组
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        if (this.usedSize == this.elem.length) {
            return true;
        } else {
            return false;
        }
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        if (isFull()) {
            //满了就扩容
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        this.elem[this.usedSize] = data;
        this.usedSize++;

    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        return true;
    }

    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        return -1;
    }

    // 给 pos 位置的元素设为 value
    public void set(int pos, int value) {
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
    }

    // 获取顺序表长度
    public int size() {
        return 0;
    }

    // 清空顺序表
    public void clear() {
    }

}
