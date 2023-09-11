

public class Solution {
    public static void main(String[] args) {
        Object locker1 = new Object();
        Object locker2 = new Object();

        Thread a = new Thread(() -> {
            synchronized (locker2) {
                try {
                    locker2.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("a");
            }

        });
        Thread b = new Thread(() -> {
            synchronized (locker1) {
                try {
                    locker1.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("b");
            }
            synchronized (locker2) {
                locker2.notify();
            }

        });
        Thread c = new Thread(() -> {
            synchronized (locker1) {
                System.out.println("c");
                locker1.notify();
            }
        });
        a.start();
        b.start();
        c.start();
    }
}
