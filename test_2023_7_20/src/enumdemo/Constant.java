package enumdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Constant {
    public static final int RED = 1;
    public static final int WHITE = 2;
    public static final int GREEN = 3;


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("enumdemo.TestEnum");
        Constructor<TestEnum> con =
                (Constructor<TestEnum>) c.getDeclaredConstructor(String.class, int.class, int.class, String.class);
        con.setAccessible(true);
        TestEnum testEnum = con.newInstance("测试", 999, 5, "BLUE");
        System.out.println(testEnum);
    }
}


//public class Singleton {
//    private volatile static Singleton uniqueInstance;
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        if (uniqueInstance == null) {
//            synchronized (Singleton.class) {
//                if (uniqueInstance == null) {//进入区域后，再检查一次，如果仍是null,才创建实例
//                    uniqueInstance = new Singleton();
//                }
//            }
//        }
//        return uniqueInstance;
//    }
//}


//class Singleton {
//    /**
//     * 私有化构造器
//     */
//    private Singleton() {
//    }
//
//    /**
//     * 对外提供公共的访问方法
//     */
//    public static Singleton getInstance() {
//        return UserSingletonHolder.INSTANCE;
//    }
//
//    /**
//     * 写一个静态内部类，里面实例化外部类
//     */
//    private static class UserSingletonHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Singleton u1 = Singleton.getInstance();
//        Singleton u2 = Singleton.getInstance();
//        System.out.println("两个实例是否相同：" + (u1 == u2));
//    }
//}


//public enum TestEnum {
//    INSTANCE;
//
//    public TestEnum getInstance() {
//        return INSTANCE;
//    }
//
//    public static void main(String[] args) {
//        TestEnum singleton1 = TestEnum.INSTANCE;
//        TestEnum singleton2 = TestEnum.INSTANCE;
//        System.out.println("两个实例是否相同：" + (singleton1 == singleton2));
//    }
//}