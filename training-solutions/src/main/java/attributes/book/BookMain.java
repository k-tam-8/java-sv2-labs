package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Az öreg halász és a tenger");
        book.setTitle("Egri csillagok");
        System.out.println(book.getTitle());
    }}
