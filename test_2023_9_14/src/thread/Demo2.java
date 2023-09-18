package thread;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        // 描述了线程的入口是啥样的
        while (true) {
            System.out.println("hello thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Demo2 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();// 通过这个操作，来调用系统api，来完成创建线程的工作

        while (true) {
            System.out.println("hello main");
            Thread.sleep(1000);
        }
    }

}
