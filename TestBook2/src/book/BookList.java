package book;

//书架
public class BookList {
    private Book[] books = new Book[10];
    private int usedSize;//记录当前存放多少本书

    public BookList() {
        this.books[0] = new Book("三国演义", "罗贯中", 78, "小说");
        this.books[1] = new Book("西游记", "吴承恩", 83, "小说");
        this.books[2] = new Book("红楼梦", "曹雪芹", 87, "小说");
        this.usedSize = 3;
    }

    public Book getBooks(int pos) {
        return this.books[pos];
    }

    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
