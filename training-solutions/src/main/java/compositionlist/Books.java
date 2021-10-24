package compositionlist;

import objects.Book;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> bookTitles=new ArrayList<>();

    public void addBook(String title) {
        bookTitles.add(title);
    }
    public void findBookAndSetAuthor(String title,String author){
        for (int i=0;i<bookTitles.size();i++) {
            if (bookTitles.get(i)==title) {
                bookTitles.set(i, author + ":" + bookTitles.get(i));
                System.out.println("módosítás sikerült");
            }
        }
    }

    public List<String> getBookTitles() {
        return bookTitles;
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.addBook("Egri Csillagok");
        books.addBook("A Pál Utcai Fiúk");
        books.addBook("Az Ember Tragédiája");
        books.findBookAndSetAuthor("Biblia","x y");
        books.findBookAndSetAuthor("Egri Csillagok","Gárdonyi Géza");
        System.out.println(books.getBookTitles());
    }
}
