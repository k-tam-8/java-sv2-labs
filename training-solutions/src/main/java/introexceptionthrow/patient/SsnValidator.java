package introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9) {
            throw new IllegalArgumentException("Csak 9 számjegyű lehet!");
        }
        for (int i = 0; i < ssn.length(); i++) {
            if (!Character.isDigit(ssn.charAt(i))) {
                throw new IllegalArgumentException("Csak számból állhat a TAJ szám!");
            }
        }
        int tmpNumber = 0;
        for (int i = 1; i < 9; i++) {
            if (i % 2 == 0) {
                char c = ssn.charAt(i - 1);
                tmpNumber += Character.getNumericValue(c) * 7;
            }
            if (i % 2 == 1) {
                char c = ssn.charAt(i - 1);
                tmpNumber += Character.getNumericValue(c) * 3;
            }
        }
        int secCode = Character.getNumericValue(ssn.charAt(8));
        if (tmpNumber % 10 == secCode) {
            return true;
        } else {
            throw new IllegalArgumentException("Nem megfelelő TAJ szám!");
        }
    }
}
