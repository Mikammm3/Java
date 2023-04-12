public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        System.out.println(a / b);
    }
    public static void main4(String[] args) {
//        String s = "Hello";
//        System.out.println(s);
//        String s2 = "world";
//        System.out.println(s2);
//        //这里的 + 表示拼接
//        System.out.println(s+s2);
//        int num = 10;
//        System.out.println(num+"");
//        System.out.println(String.valueOf(num));
//        System.out.println(10+20+"hello");
//        System.out.println("hello"+10+20);
        String str = "100";
        int num = Integer.parseInt(str);
    }
    public static void main3(String[] args) {
//        long n = 100L;
//        int a = 10;
//        a = n;
//        n = a;//隐式类型转换
//        System.out.println(n);
        int a = 100;
        long b =10L;
        a = (int)b;//强制类型转换

    }
    public static void main2(String[] args) {
//        double d = 3.14;
//        System.out.println(d);
//        System.out.println(Double.MAX_VALUE);
//        //无限趋近于0的正数
//        System.out.println(Double.MIN_VALUE);
        float f = 3.14f;
        System.out.println(f);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println("=================");
        char ch = 'A';
        char c = '呵';
        System.out.println(c);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println("==================");
        boolean flag1 = true;
        System.out.println(flag1);
        boolean flag2 = false;
        System.out.println(flag2);
    }
    public static void main1(String[] args) {
//        long n = 100L;
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(n);
//        short s = 10;
//        System.out.println(s);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
        byte b = 12;
        System.out.println(b);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
}
