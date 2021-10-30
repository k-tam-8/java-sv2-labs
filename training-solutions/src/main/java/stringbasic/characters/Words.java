package stringbasic.characters;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a szót: ");
        String word = sc.nextLine();
        System.out.println("Betűzd le a következő szót: " + word);
        String wordGuess="";
        for (int i=0;i<word.length();i++){
            wordGuess=wordGuess.concat(sc.nextLine());
        }
        System.out.println(wordGuess.equals(word) ? "jó lebetűzés: " + wordGuess : "rossz lebetűzés: " + wordGuess);
    }
}
