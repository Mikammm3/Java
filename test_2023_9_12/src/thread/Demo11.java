package thread;

public class Demo11 {
    public static void main(String[] args) throws InterruptedException {
        long beg = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println(end - beg);
    }
}
