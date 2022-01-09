package catalog;

public final class SearchCriteria {
    private final String contributor;
    private final String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public boolean hasContributor() {
        return contributor != null && !contributor.isBlank();
    }

    public boolean hasTitle() {
        return title != null && !title.isBlank();
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public static SearchCriteria createByBoth(String author, String anotherAuthor) {
        //SearchCriteria searchCriteria = new SearchCriteria()
        return null;
    }

    public static SearchCriteria createByContributor(String criteria) {
        return null;
    }

    public static SearchCriteria createByTitle(String title) {
        return null;
    }


}
