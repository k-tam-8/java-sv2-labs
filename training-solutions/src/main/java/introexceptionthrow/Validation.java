package introexceptionthrow;

public class Validation {

    public void validateName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("A név üres!");
        }
    }

    public void validateAge(String ageString) {
        if (ageString.equals("")) {
            throw new IllegalArgumentException("Nem lehet üres az életkor!");
        }
        for (int i = 0; i < ageString.length(); i++) {
            if (!Character.isDigit(ageString.charAt(i))) {
                throw new IllegalArgumentException("Betű nem szerepelhet az életkorban!");
            }
        }
        if (Integer.parseInt(ageString) < 1 || Integer.parseInt(ageString) > 119) {
            throw new IllegalArgumentException("Az életkor csak 0 és 120 közé eshet!");
        }
    }
}
