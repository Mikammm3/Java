package thread;

public class Demo16 {

    private static Object locker1 = new Object();
    private static Object locker2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (locker1) {
                // 此处的 sleep 很重要，要确保 t1 和 t2 都分别拿到一把锁之后，再进行后续动作
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (locker2) {
                    System.out.println("t1 加锁成功");
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
                synchronized (locker1) {
                    System.out.println("t2 加锁成功");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
