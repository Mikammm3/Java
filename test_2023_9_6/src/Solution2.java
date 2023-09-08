

public class Solution2 {
    private static Object locker = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.print("A");
        });
        Thread t2 = new Thread(() -> {
            System.out.print("B");
        });
        Thread t3 = new Thread(() -> {
            System.out.print("C");
        });

        Thread[] threads = {t1, t2, t3};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < threads.length; j++) {
                synchronized (locker) {
                    threads[j].run();
                }
            }
            System.out.println();
        }
    }
}
