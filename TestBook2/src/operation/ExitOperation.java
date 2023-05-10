package operation;

import book.BookList;

public class ExitOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        bookList.setUsedSize(0);
        System.exit(0);
        System.out.println("退出系统！");
    }
}
