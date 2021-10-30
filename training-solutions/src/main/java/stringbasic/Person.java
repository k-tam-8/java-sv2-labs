package stringbasic;

public class Person {
    private String name;
    private String email;
    private String TAJ;
    private String creditCard;
    private String phoneNumber;

    public Person(String name, String email, String TAJ, String creditCard, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.TAJ = TAJ;
        this.creditCard = creditCard;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTAJ() {
        return TAJ;
    }

    public void setTAJ(String TAJ) {
        this.TAJ = TAJ;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
