package thread;

public class Demo19 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        synchronized (object) {
            System.out.println("wait 之前");
            // 把 wait 要放到 synchronized 里面来调用，保证确实是拿到锁了的。
            object.wait();
            System.out.println("wait 之后");
        }
    }
}
