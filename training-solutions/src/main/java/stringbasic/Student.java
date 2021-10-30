package stringbasic;

public class Student {
    private Person person;
    private String neptune;
    private String schoolId;
    private String idCard;

    public Student(Person person, String neptune, String schoolId, String idCard) {
        this.person = person;
        this.neptune = neptune;
        this.schoolId = schoolId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptune() {
        return neptune;
    }

    public void setNeptune(String neptune) {
        this.neptune = neptune;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
