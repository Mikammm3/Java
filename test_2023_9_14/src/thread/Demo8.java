package thread;

// 线程的打断
public class Demo8 {
    private static boolean isQuit = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (!isQuit) {
                //此处的打印可以替换成任意的逻辑来表示实际工作的内容
                System.out.println("线程工作中");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("线程工作完毕");
        });
        t.start();
        Thread.sleep(5000);

        isQuit = true;
        System.out.println("设置 isQuit 为 true");
    }
}
