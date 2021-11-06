package top.bhfz.interator;

/**
 * @author Davy
 * @date 2021/11/6
 */
public class BookShelfIterator implements Iterator<Book> {

    private final BookShelf bookShelf;
    private Integer index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getSize();
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
