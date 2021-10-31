package stringseparate;

import java.util.Arrays;
import java.util.List;

public class Codes {
    public String getCodesStartWithLetter(List<String> codes) {
            StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codes.size(); i++) {
            if (Character.isAlphabetic(codes.get(i).toString().charAt(0))) {
                sb = sb.append(codes.get(i) + ", ");
            }
        }
        sb.delete(sb.length()-2,sb.length()-1);
        return sb.toString();
    }

    public static void main(String[] args) {
        Codes codes = new Codes();
        System.out.print("Betűvel kezdődő kódok: ");
        List<String> codeList = Arrays.asList("Tds787", "xnd867", "9d4s56", "pi9e2e", "9d4s5s");
        System.out.println(codes.getCodesStartWithLetter(codeList));
    }
}
