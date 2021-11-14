package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        System.out.print("Kérek egy legfeljebb 5 betűs szót: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length()>5) {
            throw new IllegalArgumentException("A szó maximum 5 betűből álllhat!");
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(s.charAt(i))) {
                throw new IllegalArgumentException("A szó csak betűket tartalmazhat");
            }
        }
        System.out.println(s);
    }
}
