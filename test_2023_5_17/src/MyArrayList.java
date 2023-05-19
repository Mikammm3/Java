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
    //1.挪数据  从后往前挪
    public void add(int pos, int data) {
        //必须判断pos是否合法
        //1 2 3 4 _
        if (pos < 0 || pos > this.usedSize) {
            throw new PosOutOfBoundsException(pos + " 位置不合法");
        }
        if (isFull()) {
            //满了就扩容
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];//把i下标的值赋给i+1
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    // 判定是否包含某个元素
    // 如果此时找的是引用类型，就不能使用==，
    // 而是使用equals(返回布尔类型)或者compareTo(返回整型)
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        checkPos(pos);
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value [更新/覆盖]
    public void set(int pos, int value) {
        checkPos(pos);
        this.elem[pos] = value;
    }

    // 检查pos位置是否合法
    private void checkPos(int pos) {
        if (pos < 0 || pos >= usedSize) {
            throw new PosOutOfBoundsException(pos + " 位置不合法");
        }
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = indexOf(toRemove);
        if (index == -1) {
            System.out.println("没有这个数据！");
            return;
        }
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        //this.elem[this.usedSize - 1] = null;//引用类型
        this.usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        //如果是引用类型，那么必须走一步就置空一个，不然会造成内存泄漏
        /*for (int i = 0; i < this.usedSize; i++) {
            this.elem[i] = null;
        }*/
        this.usedSize = 0;
    }

}