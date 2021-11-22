package immutable;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String address;
    private final LocalDate dateOfIn;
    private final String number;

    public Monument(String name, String address, LocalDate dateOfIn, String number) {
        if ((isEmpty(name)) && (isEmpty(address)) && (isEmpty(number)) && (dateOfIn == null)) {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }
        this.name = name;
        this.address = address;
        this.dateOfIn = dateOfIn;
        this.number = number;
    }


    public boolean isEmpty(String text) {
        if (text == null && text == "") {
            return true;
        } else throw new IllegalArgumentException("Nem lehet üres!");
    }
}
