package user;

import operation.*;

import java.util.Scanner;

public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
        this.ioPerations = new IOPeration[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new ShowOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("************************");
        System.out.println("hello " + super.getName() + " 欢迎来到管理员菜单！");
        System.out.println("1.查找图书!");
        System.out.println("2.新增图书!");
        System.out.println("3.删除图书!");
        System.out.println("4.显示图书!");
        System.out.println("0.退出系统!");
        System.out.println("************************");
        System.out.println("请选择你要的操作：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
