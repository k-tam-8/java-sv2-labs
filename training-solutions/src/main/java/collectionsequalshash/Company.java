package collectionsequalshash;

import java.util.Objects;

public class Company {
    private String name;
    private int TaxNumber;

    public Company(String name, int taxNumber) {
        this.name = name;
        TaxNumber = taxNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return TaxNumber == company.TaxNumber && Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, TaxNumber);
    }
}
