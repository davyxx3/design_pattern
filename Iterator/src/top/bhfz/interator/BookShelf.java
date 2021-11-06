package top.bhfz.interator;

/**
 * @author Davy
 * @date 2021/11/6
 */
public class BookShelf implements Aggregate<Book> {

    private final Integer capacity;
    private final Book[] books;
    private Integer size = 0;

    public BookShelf(Integer capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[size++] = book;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
