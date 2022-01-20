package searching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookSearch {
    private List<Book> books = new ArrayList<>();

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title){
        int temp = Collections.binarySearch(books, new Book(title, author));
        return books.get(temp);
    }
}
