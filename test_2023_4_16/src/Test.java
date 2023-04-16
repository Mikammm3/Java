import java.util.Random;
import java.util.Scanner;

public class Test {

    public static int add(int x, int y) {
        return x + y;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void main(String[] args) {
        //写isLeapYear(2020).sout + 回车 能够快速打印
        System.out.println(isLeapYear(2020));
    }

    public static void main1(String[] args) {
        Random random = new Random();//工具
        int randNum = random.nextInt(100) + 1;//生成随机数
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要猜数字:>");
            int guess = scan.nextInt();
            if (guess > randNum) {
                System.out.println("猜大了");
            } else if (guess == randNum) {
                System.out.println("猜对了");
                break;
            } else {
                System.out.println("猜小了");
            }
        }
    }
}


//import java.util.Scanner;

//public class Test {
//    public static void main(String[] args) {
//        //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，
//        //提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
//        int count = 0;
//        String password = "hello";
//        Scanner scan4 = new Scanner(System.in);
//        while (count < 3) {
//            System.out.println("请输入密码");
//            String ps = scan4.nextLine();
//            if (ps.equals(password)) {
//                System.out.println("登陆成功");
//                break;
//            }
//            count++;
//            if (count == 3) {
//                System.out.println("退出程序");
//                break;
//            }
//        }
//    }
//}





