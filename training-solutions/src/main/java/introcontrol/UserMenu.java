package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");
        int num = sc.nextInt();
        if (num == 1) System.out.println("Felhasználók listázása");
        else if (num == 2) System.out.println("Felhasználó felvétele");

    }
}
