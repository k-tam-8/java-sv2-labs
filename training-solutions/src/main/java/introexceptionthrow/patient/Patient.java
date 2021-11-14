package introexceptionthrow.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;
        if (this.name.equals("")) {
            throw new IllegalArgumentException("A név nem lehet üres!");
        } else if (this.yearOfBirth < 1900) {
            throw new IllegalArgumentException("Születési év nem lehet kisebb mint 1900!");
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        SsnValidator ssnValidator = new SsnValidator();
        try {
            Patient patient = new Patient("fgdzgg", "257489650", 1950);
            ssnValidator.isValidSsn(patient.socialSecurityNumber);
        } catch (IllegalArgumentException nfe) {
            System.out.println(nfe);
        }
    }
}
