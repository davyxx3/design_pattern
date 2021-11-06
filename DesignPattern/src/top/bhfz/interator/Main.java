package top.bhfz.interator;

/**
 * @author Davy
 * @date 2021/11/6
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book(1, "HK"));
        bookShelf.appendBook(new Book(2, "UK"));
        bookShelf.appendBook(new Book(3, "US"));
        bookShelf.appendBook(new Book(4, "EU"));
        bookShelf.appendBook(new Book(5, "JP"));
        Iterator<Book> bookIterator = bookShelf.iterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }
    }
}
