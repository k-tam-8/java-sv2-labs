package searching;

import java.time.LocalDateTime;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {
    private int registrationNumber;
    private String description;
    private LocalDateTime inDate;

    public LostProperty(int registrationNumber, String description, LocalDateTime inDate) {
        this.registrationNumber = registrationNumber;
        this.description = description;
        this.inDate = inDate;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    @Override
    public int compareTo(LostProperty o) {
        if (o.description.compareTo(this.description) != 0) {
            return o.description.compareTo(this.description);
        } else return o.inDate.compareTo(this.inDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return Objects.equals(description, that.description) && Objects.equals(inDate, that.inDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, inDate);
    }
}
