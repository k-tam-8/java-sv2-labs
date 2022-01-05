package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb verb1 = new PhrasalVerb("megy","át");
        Verb verb2 = new PhrasalVerbWithSuffix("megy","át","eget");

        Preposition preposition1 = new PhrasalVerb("megy","át");
        Preposition preposition2 = new PhrasalVerbWithSuffix("megy","át","eget");

        PhrasalVerb phrasalVerb = new PhrasalVerb("megy","át");
        Preposition phrasalVerb2 = new PhrasalVerbWithSuffix("megy","át","eget");

        Suffix suffix = new PhrasalVerbWithSuffix("megy","át","eget");

        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("megy","át","eget");

        System.out.println(verb1.getWord());
        System.out.println(verb2.getWord());

        System.out.println(preposition1.getWholeWord());
        System.out.println(preposition1.getPreposition());
        System.out.println(preposition2.getWholeWord());
        System.out.println(preposition2.getPreposition());

        System.out.println(phrasalVerb.getPreposition());
        System.out.println(phrasalVerb.getWholeWord());
        System.out.println(phrasalVerb2.getPreposition());
        System.out.println(phrasalVerb2.getWholeWord());

        System.out.println(suffix.getSuffix());

        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}
