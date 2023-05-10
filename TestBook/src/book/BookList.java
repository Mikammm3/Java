package book;

//书架
public class BookList {
    private Book[] book = new Book[10];
    private int useSize;

    public BookList() {
        this.book[0] = new Book("三国演义", "罗贯中", "小说", 89);
        this.book[1] = new Book("西游记", "吴承恩", "小说", 81);
        this.book[2] = new Book("红楼梦", "曹雪芹", "小说", 93);
        this.useSize = 3;
    }

    public Book[] getBook() {
        return this.book;
    }

    public void setBook(Book book, int pos) {
        this.getBook()[pos] = book;
    }

    public int getUseSize() {
        return useSize;
    }

    public void setUseSize(int useSize) {
        this.useSize = useSize;
    }
}
