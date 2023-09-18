package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo27 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
    }
}
