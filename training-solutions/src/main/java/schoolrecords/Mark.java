package schoolrecords;

public class Mark {
    private MarkType markType;
    private Tutor tutor;
    private Subject subject;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        this.tutor = tutor;
        this.markType = markType;
        this.subject = subject;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        this.tutor = tutor;
        this.markType = MarkType.valueOf(markType);
        this.subject = subject;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return subject + ": " + markType.getMarkName() + "("  + markType.getMark() + ")";
    }
}
