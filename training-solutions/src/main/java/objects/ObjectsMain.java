package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        new Book();
        Book book = new Book();
        System.out.println(book);
        Book emptybook;
        //System.out.println(emptybook);
        emptybook=null;
        System.out.println(emptybook);
        System.out.println((emptybook==null ? "null értékü" : "nem null értékű"));
        Book book2 = new Book();
        System.out.println(book2);
        book2=null;
        System.out.println(book2);
        Book anotherBook = new Book();
        System.out.println(book2 ==anotherBook);
        anotherBook=book2;
        System.out.println(book2 ==anotherBook);
        Book[] books = {new Book(), new Book(), new Book()};
        List<Book> bookList= Arrays.asList(new Book(), new Book(), new Book());
        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(new Book());
        bookList2.add(new Book());
        bookList2.add(new Book());
        System.out.println(books.toString());
        System.out.println(bookList.toString());
        System.out.println(bookList2.toString());
    }
}
