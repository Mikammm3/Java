package operation;

import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");
        System.out.println("请输入你要借阅的书的名字:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                System.out.println("找到了！");
                bookList.getBooks(i).setBorrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("不好意思，你好像没有这本书呢");
    }
}
