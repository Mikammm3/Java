package thread;


//创建一个类，继承自Thread
class MyThread extends Thread {
    @Override
    public void run() {
        // 这个方法就是线程的入口方法
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


//创建 线程
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyThread();
        // start 和 run 都是 Thread 的成员
        // run只是描述了线程的入口(线程要做什么任务)
        // start 则是真正调用了系统 API，在系统中创建出线程，让线程再调用run
        thread.start();
        //thread.run();
        while (true) {
            System.out.println("hello main");
            Thread.sleep(1000);
        }
    }
}




