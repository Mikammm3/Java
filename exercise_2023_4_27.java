


//PTA L1-065 嫑废话上代码
public class Main {
    public static void main(String[] args) {
        System.out.println("Talk is cheap. Show me the code.");
    }
}


//PTA L1-066 猫是液体
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        System.out.println(l * w * h);
        scan.close();
    }
}


//PTA L1-067 洛希极限
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        int b = scan.nextInt();
        double r = 0;
        double liuTi = 2.455;
        double gangTi = 1.26;
        double c = scan.nextDouble();
        if (b == 0) {
            r = a * liuTi;
        } else {
            r = a * gangTi;
        }
        System.out.printf("%.02f ", r);
        if (c >= r) {
            System.out.println("^_^");
        } else {
            System.out.println("T_T");
        }
        scan.close();
    }
}


