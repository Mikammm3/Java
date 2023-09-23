package thread;

public class Demo3 {

    public static void main(String[] args) throws InterruptedException {
        //继承 Thread ，重写 run ，但是使用匿名内部类
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("hello thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread.start();

        while (true) {
            System.out.println("hello main");
            Thread.sleep(1000);
        }
    }
}
