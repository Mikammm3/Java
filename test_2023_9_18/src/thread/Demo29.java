package thread;

import java.util.concurrent.atomic.AtomicInteger;

// 原子类示例
public class Demo29 {
    public static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                // count++;
                count.getAndIncrement();
                // ++count;
                // count.incrementAndGet();
                // count--;
                // count.getAndDecrement();
                // --count;
                // count.decrementAndGet();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                count.getAndIncrement();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count.get());
    }
}
