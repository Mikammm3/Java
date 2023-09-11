package thread;

// 期望这个类，能够有唯一实例
class Singleton {
    private static final Singleton instance = new Singleton();

    // 通过这个方法获取到刚才的实例
    // 后续如果想使用这个类的实例，就都通过 getInstance 方法来获取
    public static Singleton getInstance() {
        return instance;
    }

    // 把构造方法设为 private，此时类外面的其他代码，就无法 new 出这个类的对象了
    private Singleton() {
    }
}

public class Demo21 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
