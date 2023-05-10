import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.io.StringReader;
import java.util.Scanner;

public class Main {

    public static User login() {
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：  1 ->管理员   0 ->普通用户");
        int input = scanner.nextInt();
        if (input == 1) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        User user = login();
        BookList bookList = new BookList();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
}