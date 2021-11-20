package introexceptionwritefiletestjunit5;

import attributes.book.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {
    @TempDir
    File temporaryFolder;

    @Test
    void booksTest() throws IOException {
        Path path = temporaryFolder.toPath().resolve("books.txt");
        List<String> bookList = new Books().readIn();
        bookList = new Books().cleanList(bookList);
        new Books().writeFile(bookList, path);
        assertEquals(Arrays.asList("Gárdonyi Géza: Egri csillagok",
                "Molnár Ferenc: Pál utcai fiúk",
                "Fekete István: Tüskevár",
                "Jókai Mór: Kőszívű ember fiai"), bookList);

    }

}