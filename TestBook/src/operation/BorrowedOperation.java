package operation;

import book.BookList;

import java.util.Scanner;

public class BorrowedOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");
        System.out.println("请输入要借阅的书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUseSize(); i++) {
            if (bookList.getBook()[i].getName().equals(name)) {
                System.out.println("找到了！");
                bookList.getBook()[i].setBorrowed(true);
                System.out.println(bookList.getBook()[i]);
                return;
            }
        }
        System.out.println("不好意思，你好像没有这本书呢");
    }
}
