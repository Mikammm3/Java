package thread;


// 线程安全
public class Demo13 {
    // 此处定义一个 int 类型的变量
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Object locker = new Object();

        Thread t1 = new Thread(() -> {
            // 对 count 变量进行自增 5w 次
            for (int i = 0; i < 50000; i++) {
                synchronized (locker) {
                    count++;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            // 对 count 变量进行自增 5w 次
            for (int i = 0; i < 50000; i++) {
                synchronized (locker) {
                    count++;
                }
            }
        });

        t1.start();
        t2.start();

        // 如果没有这两个 join，那是肯定是不行的，线程还没自增完，就开始打印了，很可能打印出来的 count 就是个 0
        t1.join();
        t2.join();

        // 预期结果应该是 10w
        System.out.println(count);
    }
}
