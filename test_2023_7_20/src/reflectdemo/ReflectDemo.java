package reflectdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    //如何通过反射 实例化对象
    public static void reflectNewInstance() {
        //1.先获取Class对象
        Class<?> c1;
        try {
            c1 = Class.forName("reflectdemo.Student");
            //2.实例化对象调用newInstance()方法
            Student student = (Student) c1.newInstance();

            System.out.println(student);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


    // 反射私有的构造方法 屏蔽内容为获得公有的构造方法
    public static void reflectPrivateConstructor() {
        Class<?> c1;
        try {
            c1 = Class.forName("reflectdemo.Student");

            Constructor<Student> con =
                    (Constructor<Student>) c1.getDeclaredConstructor(String.class, int.class);

            //要想调用私有的，一定要调用setAccessible()
            con.setAccessible(true);

            Student student = con.newInstance("张三", 18);

            System.out.println(student);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    // 反射私有属性
    public static void reflectPrivateField() {
        Class<?> c1;
        try {
            c1 = Class.forName("reflectdemo.Student");
            Field field = c1.getDeclaredField("name");
            field.setAccessible(true);

            Student student = (Student) c1.newInstance();

            field.set(student, "王五");

            System.out.println(student);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


    // 反射私有方法
    public static void reflectPrivateMethod() {
        Class<?> c1;
        try {
            c1 = Class.forName("reflectdemo.Student");
            Method method = c1.getDeclaredMethod("function", String.class);
            method.setAccessible(true);

            Student student = (Student) c1.newInstance();

            method.invoke(student, "我是一个参数");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        reflectNewInstance();
        reflectPrivateConstructor();
        reflectPrivateField();
        reflectPrivateMethod();
    }
}
