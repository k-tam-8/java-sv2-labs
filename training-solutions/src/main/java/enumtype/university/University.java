package enumtype.university;

public enum University {
    BME("Budapesti Műszaki és Gazdaságtudományi Egyetem"),
    BGE("Budapesti Gazdasági Egyetem"),
    MATE("Magyar Agrár- és Élettudományi Egyetem"),
    MKE("Magyar Képzőművészeti Egyetem");
    private final String fullName;

    University(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

}
