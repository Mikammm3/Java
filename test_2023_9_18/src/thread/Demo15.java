package thread;

public class Demo15 {

    private static Object locker = new Object();

    public static void fun1() {
        synchronized (locker) {
            func2();
        }
    }

    public static void func2() {
        fun3();
    }

    public static void fun3() {
        fun4();
    }

    public static void fun4() {
        synchronized (locker) {

        }
    }

    public static void main(String[] args) {

    }
}
