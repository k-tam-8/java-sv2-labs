package chars;

import java.util.Scanner;

public class LettersAndDigits {
    public void printLetterOrDigit(String text){
        for (int i =0;i<text.length();i++){
            System.out.print(text.charAt(i) + " : ");

            if (Character.isDigit(text.charAt(i))) {
                System.out.println("szám");}

            else if (Character.isAlphabetic(text.charAt(i))) {
                System.out.println("betű");}

            else
                System.out.println("egyéb");
        }
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        String text=scan.nextLine();
        lettersAndDigits.printLetterOrDigit(text);
    }
}
