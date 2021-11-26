package methodpass;

public class One {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);
        i++;
        System.out.println(i);
        One one = new One();
        one.addOne(i);
        System.out.println(i);
    }

    public int addOne(int number) {
        return number++;
    }
}
