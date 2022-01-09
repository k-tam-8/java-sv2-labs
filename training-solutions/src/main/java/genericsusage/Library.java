package genericsusage;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public Book getFirstBook(List<Book> books) {
        isEmpty(books);
        isNull(books);
        return books.get(0);
    }

    private void isEmpty(List<Book> books) {
        if (books.isEmpty()) {
            throw new IllegalArgumentException("A lista üres");
        }
    }

    private void isNull(List<Book> books) {
        if (books == null) {
            throw new NullPointerException("Nem található");
        }
    }
}
