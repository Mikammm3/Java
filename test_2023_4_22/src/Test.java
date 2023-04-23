public class Test {
    public static void main1(String[] args) {

        {
            int x = 10;
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        Student.classRoom = "109";
        System.out.println(Student.classRoom);
        Student student = new Student("张三", 19);
        System.out.println(student);

    }
}

class Student {
    public String name;
    public int age;

    public static String classRoom;

    {//实例代码块，用来初始化普通成员变量的
        this.name = "mika";
        this.age = 17;
        System.out.println("实例代码块");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static {//静态代码块，用来初始化静态成员变量的
        classRoom = "109";
    }

    public void show() {
        System.out.println("姓名：" + this.name + " 年龄：" + this.age);
    }

    public static void fun() {
        System.out.println("这是一个静态方法");
        //show();//err 不能在静态方法内部直接调用非静态方法/成员方法
        Student student = new Student("A", 19);
        student.show();
    }
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

//    public Student(int age) {
//        this.age = age;
//    }
//
//    public Student(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Student() {
//        //this("爱抖露", 17);
//        System.out.println("这是一个没有参数的构造方法");
//    }

    public Student(String name, int age) {
        //this();
        this.name = name;
        this.age = age;
        System.out.println("这是一个有两个参数的构造方法");
    }

//    public void show() {
//        System.out.println("姓名：" + this.name + " 年龄：" + this.age);
//    }

//    public void eat() {
//        System.out.println(this.name + "在吃饭");
//        this.show();
//    }
}

//public class Test {
//    public static void main(String[] args) {
//        Student student = new Student();
////        student.setName("xila");
////        System.out.println(student.getName());
//        //student.name = "xila";
//        //Student student2 = new Student("zhangsan", 18);
//    }
//}

