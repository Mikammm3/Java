
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        Object locker = new Object();
        for (int i = 0; i < 20; i++) {
            final int j = i;
            threads[i] = new Thread(() -> {
                System.out.println(j);
            });
        }
        for (int i = 0; i < 20; i++) {
            threads[i].start();
        }
        for (int i = 0; i < 20; i++) {
            threads[i].join();
        }
        System.out.println("ok");
    }
    /*public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println(0);
        });
        Thread t2 = new Thread(() -> {
            System.out.println(1);
        });
        Thread t3 = new Thread(() -> {
            System.out.println(2);
        });
        Thread t4 = new Thread(() -> {
            System.out.println(3);
        });
        Thread t5 = new Thread(() -> {
            System.out.println(4);
        });
        Thread t6 = new Thread(() -> {
            System.out.println(5);
        });
        Thread t7 = new Thread(() -> {
            System.out.println(6);
        });
        Thread t8 = new Thread(() -> {
            System.out.println(7);
        });
        Thread t9 = new Thread(() -> {
            System.out.println(8);
        });
        Thread t10 = new Thread(() -> {
            System.out.println(9);
        });
        Thread t11 = new Thread(() -> {
            System.out.println(10);
        });
        Thread t12 = new Thread(() -> {
            System.out.println(11);
        });
        Thread t13 = new Thread(() -> {
            System.out.println(12);
        });
        Thread t14 = new Thread(() -> {
            System.out.println(13);
        });
        Thread t15 = new Thread(() -> {
            System.out.println(14);
        });
        Thread t16 = new Thread(() -> {
            System.out.println(15);
        });
        Thread t17 = new Thread(() -> {
            System.out.println(16);
        });
        Thread t18 = new Thread(() -> {
            System.out.println(17);
        });
        Thread t19 = new Thread(() -> {
            System.out.println(18);
        });
        Thread t20 = new Thread(() -> {
            System.out.println(19);
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();
        t6.start();
        t6.join();
        t7.start();
        t7.join();
        t8.start();
        t8.join();
        t9.start();
        t9.join();
        t10.start();
        t10.join();
        t11.start();
        t11.join();
        t12.start();
        t12.join();
        t13.start();
        t13.join();
        t14.start();
        t14.join();
        t15.start();
        t15.join();
        t16.start();
        t16.join();
        t17.start();
        t17.join();
        t18.start();
        t18.join();
        t19.start();
        t19.join();
        t20.start();
        t20.join();
        System.out.println("ok");
    }*/

}
