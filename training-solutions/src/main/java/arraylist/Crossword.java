package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        List<String> cWords = Arrays.asList("KUCLS", "KÁLYHA", "LÓ","AJTÓ", "CSERESZNYEFA",
                "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");
        for (int i = 0;i< cWords.size();i++){
            if (cWords.get(i).toString().length()==6) System.out.println(cWords.get(i));
        }
    }
}
