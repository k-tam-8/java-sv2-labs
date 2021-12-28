package schoolrecords;

public class Mark {
    private MarkType markType;
    private Tutor tutor;
    private Subject subject;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        isParameterNull(markType,subject,tutor);
        this.tutor = tutor;
        this.markType = markType;
        this.subject = subject;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        anotherIsParameterNull(markType,subject,tutor);
        this.tutor = tutor;
        this.markType = MarkType.valueOf(markType);
        this.subject = subject;
    }

    private void isParameterNull(MarkType markType, Subject subject, Tutor tutor) {
        if (markType == null || subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }
    private void anotherIsParameterNull(String markType, Subject subject, Tutor tutor) {
        if (markType.isEmpty() || subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
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
        return  markType.getMarkName() + "(" + markType.getMark() + ")";
    }
}
