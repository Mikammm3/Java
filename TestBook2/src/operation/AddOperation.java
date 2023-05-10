package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书！");
        System.out.println("请输入你要新增的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你要新增的书的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入你要新增的书的类型：");
        String type = scanner.nextLine();
        System.out.println("请输入你要新增的书的价格：");
        int price = scanner.nextInt();
        int currentSize = bookList.getUsedSize();
        bookList.setBooks(currentSize, new Book(name, author, price, type));
        bookList.setUsedSize(currentSize + 1);
    }
}
