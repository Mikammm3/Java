package TestDemo3;

public class TestDemo {
    protected int a = 10;

    public static void main(String[] args) {
        final int a = 10;
        //a = 99;
        //System.out.println(a);
        /*final int[] arr = {1, 2, 3, 4, 5};
        arr = new int[10];*/
    }
}


class Student {
    public int age;
}

class Teacher {
    public int age;
}

class School {
    public Student[] student;
    public Teacher[] teacher;

    public void fun() {
        this.student = new Student[10];
        this.teacher = new Teacher[10];
    }
}



