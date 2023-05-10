package operation;

import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
        System.out.println("请输入要删除的书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUseSize(); i++) {
            if (bookList.getBook()[i].getName().equals(name)) {
                System.out.println("找到了！");
                for (int j = i; j < bookList.getUseSize() - 1; j++) {
                    bookList.getBook()[i] = bookList.getBook()[i + 1];
                }
                bookList.setUseSize(bookList.getUseSize() - 1);
                return;
            }
        }
        System.out.println("不好意思，你好像没有这本书呢");
    }


}
