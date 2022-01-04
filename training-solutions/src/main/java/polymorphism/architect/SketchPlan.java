package polymorphism.architect;

public class SketchPlan extends Plan{
    private String title;

    public SketchPlan(int pagesOfDocumentation, String title) {
        super(pagesOfDocumentation);
        this.title = title;
    }

    @Override
    public int getPagesOfDocumentation() {
        return super.pagesOfDocumentation;
    }

    public String getTitle() {
        return title;
    }
}
