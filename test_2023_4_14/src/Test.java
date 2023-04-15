import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入要猜的数字");
            int guess = scan.nextInt();
            if (guess > randomNum) {
                System.out.println("猜大了");
            } else if (guess == randomNum) {
                System.out.println("猜对了");
                break;
            } else {
                System.out.println("猜小了");
            }
        }
    }

    public static void main12(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        while (a % b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }

    public static void main11(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        for (int i = 31; i >= 0; i -= 2) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print((num >> i) & 1);
        }
    }

    public static void main10(String[] args) {
        //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，
        //提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
        int count = 0;
        String password = "hello";
        Scanner scan4 = new Scanner(System.in);
        while (count < 3) {
            System.out.println("请输入密码");
            String ps = scan4.nextLine();
            if (ps == password) {
                System.out.println("登陆成功");
                break;
            }
            count++;
            if (count == 3) {
                System.out.println("退出程序");
                break;
            }
        }
    }

    public static void main9(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num != 0) {
            System.out.println(num % 10);
            num /= 10;
        }
        scan.close();
    }

    public static void main8(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
        int flag = 1;
        double sum = 0.0;
        for (int i = 1; i < 100; i++) {
            sum += 1.0 * flag / i;
            flag = -flag;
        }
        System.out.println(sum);
    }

    public static void main7(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 9) {
                count++;
            }
            if (i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a * b);
        scan.close();
    }

    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (scan.hasNextInt()) {
            num = scan.nextInt();
            sum += num;
        }
        scan.close();
        System.out.println(sum);
    }

    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        System.out.println(d);
        scan.close();

//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入年龄");
//        int age = scan.nextInt();
//        System.out.println(age);
//        scan.close();

//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入姓名");
//        String name = scan.nextLine();//读到空格就会停止
//        System.out.println(name);
//        scan.close();//输完之后得关闭方法
    }

    public static void main3(String[] args) {
//        int num = 100;
//        System.out.println("打印且换行");
//        System.out.print("打印但不换行");
//        System.out.printf("hello haha %d\n", num);
//        int ret = 1;
//        int sum = 0;
//        //计算1-5的阶乘和
//        for (int i = 1; i <= 5; i++) {
//            ret *= i;
//            sum += ret;
//        }
//        System.out.println(sum);
//        int i = 0;
//        do {
//            System.out.println(i++);
//        } while (i > 1);
    }

    public static void main2(String[] args) {
//        int score = 89;
//        if(score >= 85){
//            System.out.println("优秀");
//        }else if(score >=70 && score<85){
//            System.out.println("良好");
//        }else{
//            System.out.println("普通");
//        }
//        int num = 10;
//        if (num % 2 == 0) {
//            System.out.println("偶数");
//        } else {
//            System.out.println("奇数");
//        }
//        int year = 2020;
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println(year + "是闰年");
//        } else {
//            System.out.println(year + "不是闰年");
//        }
//        boolean b = true;
//        int num = 1;
//        switch (num) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            default:
//                System.out.println("hehe");
//                break;
//        }
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i++);
//        }
//        int num = 0;
//        while (num < 10) {
//            if (num == 2) {
//                continue;
//            }
//            System.out.println(num);
//            num++;
//        }
    }

    public static void main1(String[] args) {
        for (int i = 100; i <= 200; i++) {
            if (i % 4 != 0 || i % 3 != 0)
                continue;
            System.out.println(i);
        }
    }
}
