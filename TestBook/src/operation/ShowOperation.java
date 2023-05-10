package operation;

import book.BookList;

public class ShowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书！");
        for (int i = 0; i < bookList.getUseSize(); i++) {
            System.out.println(bookList.getBook()[i]);
        }
    }
}
