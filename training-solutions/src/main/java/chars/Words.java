package chars;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Words {
    public String pushWord(String word){
        String s = "";
        for (int i=0;i<word.length();i++){
            s+=(char)(word.charAt(i)+1);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word= scan.nextLine();
        Words words =new Words();
        System.out.println(words.pushWord(word));
    }
}
