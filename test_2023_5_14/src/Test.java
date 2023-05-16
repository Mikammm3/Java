public class Test {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a == b);
        System.out.println(c == d);
    }

    public static void main1(String[] args) {
        //装箱：把一个基本数据类型转变成包装类的过程
        //int a = 10;
        //Integer b = a;//自动装箱
        //Integer c = Integer.valueOf(a);

        /*Integer a = 10;
        int b = a;//自动拆箱
        int c = a.intValue();*/
        Integer a = new Integer(10);
        int b = a;
    }
}

