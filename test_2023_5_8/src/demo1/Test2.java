package demo1;

class OuterClass {
    public int data1 = 1;
    private int data2;
    public static int data3;

    class InnerClass {
        public int data1 = 1111;
        public int data4 = 4;
        private int data5 = 5;
        public static final int data6 = 6;

        public void test() {
            System.out.println(OuterClass.this.data1);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println("实例内部类的test方法");
        }
    }

    public void test() {
        System.out.println("外部类的test方法");
    }
}

public class Test2 {
    public static void main(String[] args) {

        //创建实例内部类对象，依赖于外部类对象
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();//方法1
        OuterClass.InnerClass innerClass2 = new OuterClass().new InnerClass();//方法2
    }

}
