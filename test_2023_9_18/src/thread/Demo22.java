package thread;

class SingletonLazy {
    private static volatile SingletonLazy instance = null;

    public static SingletonLazy getInstance() {
        // 是否是首次创建对象
        if (instance == null) {
            // 保证串行化执行，不会 new 多个对象
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
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
