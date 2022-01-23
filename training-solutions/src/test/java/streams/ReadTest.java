package streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReadTest {
    @Test
    void name() {
        Book book3 = new Book("AAA", "ABC",60);
        Book book1 = new Book("BBB", "DEF",40);
        Book book5 = new Book("EEE", "MNO",75);
        Book book2 = new Book("DDD", "JKL",34);
        Book book4 = new Book("EEE", "NNO",100);
        Read read = new Read(new ArrayList<>(Arrays.asList(book1, book2, book3,book4,book5)));
        System.out.println(read.listBookTitlesShorterThanGiven(50));
        System.out.println(read.listBookTitlesWithGivenAuthor("EEE"));
        System.out.println(read.listAuthors());
    }
}