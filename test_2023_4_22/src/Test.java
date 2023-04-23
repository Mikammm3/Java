class Student {
    public String name;
    public int age;

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

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
        //this("爱抖露", 17);
        System.out.println("这是一个没有参数的构造方法");
    }

    public Student(String name, int age) {
        //this();
        this.name = name;
        this.age = age;
        System.out.println("这是一个有两个参数的构造方法");
    }

    public void show() {
        System.out.println("姓名：" + this.name + " 年龄：" + this.age);
    }

    public void eat() {
        System.out.println(this.name + "在吃饭");
        this.show();
    }
}

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("xila");
        System.out.println(student.getName());
        //student.name = "xila";
        //Student student2 = new Student("zhangsan", 18);
    }
}

