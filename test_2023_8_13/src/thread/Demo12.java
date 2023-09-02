package thread;

public class Demo12 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        // 在调用 start 之前获取状态，此时就是 NEW 状态
        System.out.println(t.getState());
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getState());
            Thread.sleep(1000);
        }
        t.join();
        //在线程结束之后，获取线程的状态，此时就是 TERMINATED 状态
        System.out.println(t.getState());

    }
}
