package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
        if (this.name.equals("")) {
            throw new IllegalArgumentException("A név nem lehet üres!");
        }
        if (this.yearOfBirth<1900) {
            throw new IllegalArgumentException("Születési év nem lehet kisebb mint 1900!");
        }
    }
    public String getName(){
        return this.name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        try {
            Patient patient = new Patient("fd", "198515", 1858);
        } catch (IllegalArgumentException nfe){
            System.out.println(nfe);
        }
    }
}
