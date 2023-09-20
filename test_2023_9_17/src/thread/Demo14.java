package thread;

class Counter {
    public int count;

    synchronized public void increase() {
        count++;
    }

    public void increase2() {
        synchronized (this) {
            count++;
        }
    }

    synchronized public static void increase3() {

    }

    public static void increase4() {
        synchronized (Counter.class) {

        }
    }
}


// synchronized 的使用方法
public class Demo14 {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                counter.increase();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                counter.increase();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
