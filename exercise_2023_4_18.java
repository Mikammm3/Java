import java.util.Scanner;

public class exercise_2023_4_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (b == 0) {
            System.out.println(a + "/" + b + "=Error");
        } else if (b < 0) {
            System.out.printf("%d/(%d)=%.2f\n", a, b, a * 1.0 / b);
        } else {
            System.out.printf("%d/%d=%.2f\n", a, b, a * 1.0 / b);
        }
        scan.close();
    }
}
