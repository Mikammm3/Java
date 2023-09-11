package thread;

class SingletonLazy {
    private static SingletonLazy instance = null;

    public static SingletonLazy getInstance() {
        synchronized (SingletonLazy.class) {
            if (instance == null) {
                instance = new SingletonLazy();
            }
        }
        return instance;
    }

    private SingletonLazy() {

    }
}

public class Demo22 {
    public static void main(String[] args) {

    }
}
