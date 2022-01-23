package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Read {
    List<Book> bookList = new ArrayList<>();

    public Read(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        List<String> filteredBooks = bookList.stream()
                .filter(book -> book.getNumberOfPages() < maxNumberOfPages)
                .map(Book::getTitle)
                .collect(Collectors.toList());
        return filteredBooks;
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        List<String> filteredBooks = bookList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());
        return filteredBooks;
    }

    public List<String> listAuthors() {
        List<String> filteredBooks = bookList.stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
        Collections.sort(filteredBooks);
        return filteredBooks;
    }
}
