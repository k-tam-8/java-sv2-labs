package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Kérem a felhasználónevet: ");
        String username= scanIn.nextLine();
        System.out.print("Kérem a jelszót: ");
        String password1= scanIn.nextLine();
        System.out.print("Kérem a jelszót mégegyszer: ");
        String password2= scanIn.nextLine();
        System.out.print("Kérem az email címet: ");
        String email= scanIn.nextLine();
        UserValidator userValidator=new UserValidator();
        userValidator.isValidEmail(email);
        System.out.println("Felhasználónév " + (userValidator.isValidUsername(username) ? "helyes." : "nem helyes."));
        System.out.println("Jelszó " + (userValidator.isValidPassword(password1,password2) ? "helyes." : "nem helyes."));
        System.out.println("Email cím " + (userValidator.isValidEmail(email) ? "helyes." : "nem helyes."));


    }
}
