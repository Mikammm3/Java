class Person implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Test2 {
    public static int func() {
        try {
            return 10;
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            return 100;
        }
    }

    public static void main(String[] args) {
        System.out.println(func());
    }

    public static void main3(String[] args) {
        try {
            System.out.println(10 / 0);

            int[] arr = null;
            System.out.println(arr.length);

        } catch (ArithmeticException e) {
            e.printStackTrace();//打印异常信息
            System.out.println("捕获到了算术异常！");
        } catch (NullPointerException e) {
            e.printStackTrace();//打印异常信息
            System.out.println("捕获到了空指针异常！");
        }

        System.out.println("其他业务代码");
    }

    public static void main2(String[] args) throws CloneNotSupportedException {
        int a = 0;
        if (a == 0) {
            throw new CloneNotSupportedException();
        }
        /*int a = 10;
        int b = 0;
        if (b == 0) {
            //一般用来抛出一个自定义的异常
            throw new ArithmeticException("b == 0");
        }
        int c = a / b;*/

    }

    public static void main1(String[] args) throws CloneNotSupportedException {
        //System.out.println(10 / 0);
        /*int[] arr = new int[10];
        System.out.println(arr[1000]);*/
        Person person = new Person();
        person.clone();
    }
}

