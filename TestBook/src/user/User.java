package user;

import book.BookList;
import operation.IOperation;

public abstract class User {
    private String name;
    public IOperation[] iOperation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public IOperation doOperation(IOperation[] iOperation, int pos) {
        return iOperation[pos];
    }

}
