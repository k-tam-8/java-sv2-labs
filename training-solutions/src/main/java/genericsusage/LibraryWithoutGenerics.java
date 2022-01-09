package genericsusage;

import java.util.ArrayList;
import java.util.List;

public class LibraryWithoutGenerics {
    List books = new ArrayList<>();

    public Book getFirstBook(List books) {
        isEmpty(books);
        isNull(books);
        return (Book) books.get(0);
    }

    private void isEmpty(List books) {
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
