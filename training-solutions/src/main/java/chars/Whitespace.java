package chars;

public class Whitespace {
    public String makeWhitespaceToStar(String text){
        String s="";
        for (int i=0;i<text.length();i++){
            if (Character.isWhitespace(text.charAt(i))) {
                s+="*";
            }
            else s+=text.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {
        Whitespace whitespace=new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("hu uh ih   iu  i "));
    }
}
