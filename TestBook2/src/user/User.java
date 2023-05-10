package user;

import book.BookList;
import operation.IOPeration;

public abstract class User {
    private String name;

    public IOPeration[] ioPerations;


    public User(String name) {
        this.name = name;
    }

    public void doOperation(int choice, BookList bookList) {
        ioPerations[choice].work(bookList);
    }

    public abstract int menu();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
