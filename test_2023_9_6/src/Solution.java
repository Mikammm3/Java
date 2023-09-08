
// 每个线程循环 1w 次，累加变量 count 的值，count 默认值为 0，注意线程安全问题。
public class Solution {
    private static int count;
    private static Object locker = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (locker) {
                    count++;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (locker) {
                    count++;
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(Solution.count);
    }
}
