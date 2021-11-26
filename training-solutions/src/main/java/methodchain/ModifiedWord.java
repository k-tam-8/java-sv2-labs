package methodchain;

public class ModifiedWord {
    private String word="";

    public String modify(String word) {
        ModifiedWord mw = new ModifiedWord().firstLetterToUpperCase(word).
                secondLetterToX().
                thirdLetterToUpperCase(word).
                fourthLetterToY();
        return mw.word;
    }

    public ModifiedWord firstLetterToUpperCase(String word){
        char c = word.toUpperCase().charAt(0);
        this.word+=Character.toString(c);
        return this;
    }
    public ModifiedWord secondLetterToX(){
        this.word+="x";
        return this;
    }
    public ModifiedWord thirdLetterToUpperCase(String word){
        char c = word.toUpperCase().charAt(2);
        this.word+=Character.toString(c);
        return this;
    }
    public ModifiedWord fourthLetterToY(){
        this.word+="y";
        return this;
    }
}
