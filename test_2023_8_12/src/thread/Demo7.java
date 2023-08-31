package thread;

public class Demo7 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("线程开始");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("线程结束");
        });

        thread.start();
        System.out.println(thread.isAlive());
        Thread.sleep(3000);
        System.out.println(thread.isAlive());
        
    }
}
