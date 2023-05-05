package demo4接口使用案例;

import java.util.Arrays;
import java.util.Comparator;

//class Student implements Comparable<Student> {
//    public String name;
//    public int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.age - o.age;
//    }
//}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

//比较器
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Test {

    public static void main(String[] args) {
        Student student1 = new Student("张三", 10);
        Student student2 = new Student("李四", 15);

        AgeComparator ageComparator = new AgeComparator();
        System.out.println(ageComparator.compare(student1, student2));
        System.out.println("================");

        NameComparator nameComparator = new NameComparator();
        System.out.println(nameComparator.compare(student1, student2));
    }

    /*public static void bubbleSort(Comparable[] comparable) {
        for (int i = 0; i < comparable.length - 1; i++) {
            for (int j = 0; j < comparable.length - 1 - i; j++) {
                if (comparable[j].compareTo(comparable[j + 1]) > 0) {
                    Comparable tmp = comparable[j];
                    comparable[j] = comparable[j + 1];
                    comparable[j + 1] = tmp;
                }
            }
        }
    }*/

    /*public static void main1(String[] args) {
     *//*Student student1 = new Student("张三", 10);
        Student student2 = new Student("李四", 15);
        //Student student3 = new Student("王五", 18);
        System.out.println(student1.compareTo(student2));*//*

     *//*Student[] students = {new Student("张三", 12),
                new Student("李四", 10),
                new Student("王五", 18)};
        bubbleSort(students);
        //Arrays.sort(students);
        System.out.println(Arrays.toString(students));*//*
    }*/

}
