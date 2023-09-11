package thread;

public class Demo6 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("hello thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "这是新线程");

        // 设置 thread 为后台线程
        thread.setDaemon(true);
        
        thread.start();

    }
}
