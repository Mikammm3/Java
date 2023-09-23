package thread;

// 不写作泛型了，直接让这个队列里面存储字符串
class MyBlockingQueue {

    // 此处这里的最大长度，也可以指定构造方法，也可以构造方法的参数来判定
    private String[] data = new String[1000];

    private volatile int head = 0;// 队列的起始位置
    private volatile int tail = 0;// 队列的结束位置的下一个位置
    private volatile int size = 0;// 记录当前队列有效元素个数

    // 提供核心方法，入队列和出队列
    public void put(String elem) throws InterruptedException {
        synchronized (this) {
            while (size == data.length) {
                // 普通队列如果满了,就返回
                // 阻塞队列的话，就阻塞
                this.wait();
            }
            // 队列没满，就真正的往里面放元素
            data[tail] = elem;
            tail++;
            // 如果 tail 自增之后，到达了数组末尾，就需要让它回到开头(环形队列)
            if (tail == data.length) {
                tail = 0;
            }
            size++;
            this.notify();// 这个 notify 用来唤醒 take 的 wait
        }
    }

    public String take() throws InterruptedException {
        synchronized (this) {
            while (size == 0) {
                // 如果普通队列为空，就返回 null
                // 阻塞队列的话，就阻塞
                this.wait();
            }
            // 队列不空，就需要把 head 位置的元素给删除掉，并且返回
            String tmp = data[head];
            head++;
            if (head == data.length) {
                head = 0;
            }
            size--;
            // 这个 notify 用来唤醒 put 的 wait
            this.notify();
            return tmp;
        }
    }
}


public class Demo24 {
    public static void main(String[] args) {
        // 生产者，消费者，分别使用一个线程表示。（也可以使用多个线程）
        MyBlockingQueue queue = new MyBlockingQueue();

        // 消费者
        Thread t1 = new Thread(() -> {
            while (true) {
                try {
                    String num = queue.take();
                    System.out.println("消费元素：" + num);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        // 生产者
        Thread t2 = new Thread(() -> {
            int num = 1;
            while (true) {
                try {
                    queue.put(num + "");
                    System.out.println("生产元素：" + num);
                    num++;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
