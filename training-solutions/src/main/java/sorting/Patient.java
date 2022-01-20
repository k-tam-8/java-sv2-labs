package sorting;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String id;
    private LocalDateTime dateIn;

    public Patient(String name, String id, LocalDateTime dateIn) {
        this.name = name;
        this.id = id;
        this.dateIn = dateIn;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDateIn() {
        return dateIn;
    }
}
