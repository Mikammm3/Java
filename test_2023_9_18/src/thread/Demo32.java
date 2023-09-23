package thread;


import java.util.concurrent.CountDownLatch;

// CountDownLatch 示例
public class Demo32 {
    public static void main(String[] args) throws InterruptedException {
        // 10 个选手参赛。await 会在 10 次调用完 countDown 之后才能继续执行
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            int id = i;
            Thread t = new Thread(() -> {
                System.out.println("thread " + id);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // 通知说当前任务已经执行完毕了
                countDownLatch.countDown();
            });
            t.start();
        }
        // a => all
        countDownLatch.await();
        System.out.println("所有的任务都完成了。");
    }
}
