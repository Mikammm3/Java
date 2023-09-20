package thread;

public class Demo10 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("t 线程工作中");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.start();
        // 让主线程等待 t 线程执行结束
        // 一旦调用 join，主线程就会触发阻塞，此时 t 线程就可以趁机完成后续的工作
        // 一直阻塞到 t 线程执行完毕了，join 才会解除阻塞，才能继续执行
        System.out.println("join 等待开始");
        t.join();
        System.out.println("join 等待结束");
    }
}
