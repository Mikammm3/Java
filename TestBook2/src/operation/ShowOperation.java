package operation;

import book.Book;
import book.BookList;

public class ShowOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书！");
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
