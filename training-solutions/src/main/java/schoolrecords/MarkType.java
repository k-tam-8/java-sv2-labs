package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private final int mark;
    private final String markName;

    MarkType(int mark, String markName) {
        this.mark = mark;
        this.markName = markName;
    }

    public int getMark() {
        return mark;
    }

    public String getMarkName() {
        return markName;
    }
}
