package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name name = new Name("Kiss","Béla","János");
        Name anotherName = new Name("Kovács","","István", Title.Mr);
        System.out.println(name.concatNameHungarianStyle());
        System.out.println(name.concatNameWesternStyle());
        System.out.println(anotherName.concatNameHungarianStyle());
        System.out.println(anotherName.concatNameWesternStyle());
    }
}
