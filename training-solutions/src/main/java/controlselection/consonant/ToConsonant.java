package controlselection.consonant;

public class ToConsonant {
    public char toConso(char charact) {
        char[] maganh = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < maganh.length; i++) {
            if (maganh[i] == charact) {
                return (char) ((char) charact + 1);
            }
        }
        return charact;
    }

    public static void main(String[] args) {
        ToConsonant toConsonant = new ToConsonant();
        System.out.println(toConsonant.toConso('k'));
    }
}
