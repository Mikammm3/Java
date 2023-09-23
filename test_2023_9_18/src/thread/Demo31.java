package thread;

import java.util.concurrent.Semaphore;

// 信号量示例
public class Demo31 {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(4);
        semaphore.acquire();
        System.out.println("P 操作");
        semaphore.acquire();
        System.out.println("P 操作");
        semaphore.acquire();
        System.out.println("P 操作");
        semaphore.acquire();
        System.out.println("P 操作");
        semaphore.acquire();
        System.out.println("P 操作");
        
        //semaphore.release();
    }
}
