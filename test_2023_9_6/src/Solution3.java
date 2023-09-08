
// 死锁代码
public class Solution3 {
    private static Object locker1 = new Object();
    private static Object locker2 = new Object();
    private static Object locker3 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (locker1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (locker2) {
                    System.out.println("t1");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (locker2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (locker3) {
                    System.out.println("t2");
                }
            }

        });
        Thread t3 = new Thread(() -> {
            synchronized (locker3) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (locker1) {
                    System.out.println("t3");
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        
    }
}
