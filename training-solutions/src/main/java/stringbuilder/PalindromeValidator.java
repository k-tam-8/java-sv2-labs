package stringbuilder;

public class PalindromeValidator {
    public boolean ispalindrome(String word){
        StringBuilder sb= new StringBuilder();
        sb.append(word.toLowerCase());
        String s=sb.toString();
        sb.reverse();
        return s.equals(sb.toString());
    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        System.out.println(palindromeValidator.ispalindrome("LsPpal"));
    }
}
