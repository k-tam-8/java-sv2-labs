package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {
    List<String> words = Arrays.asList("alma", "körte", "szilva", "barack", "");
        for (String s : words){
            try {
                System.out.print(s.charAt(0));
            }
            catch(NullPointerException npe) {
                System.out.println(npe.getMessage());
            }
        }
    }
}
