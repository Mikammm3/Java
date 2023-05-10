package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书！");
        System.out.println("请输入书名：");
        int currentSize = bookList.getUseSize();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //bookList.getBook()[currentSize].setName(name);
        System.out.println("请输入作者：");
        String author = scanner.nextLine();
        //bookList.getBook()[currentSize].setAuthor(name);
        System.out.println("请输入类型：");
        String type = scanner.nextLine();
        //bookList.getBook()[currentSize].setType(name);
        System.out.println("请输入价格：");
        int price = scanner.nextInt();
        //bookList.getBook()[currentSize].setPrice(price);
        bookList.setBook(new Book(name, author, type, price), currentSize);
        bookList.setUseSize(currentSize + 1);
    }
}
