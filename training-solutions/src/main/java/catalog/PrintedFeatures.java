package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {
    private List<String> authors = new ArrayList<>();
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        checkMissingTitle(title);
        checkNumberOfPagesValid(numberOfPages);
        checkAuthorsValid(authors);
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    private void checkMissingTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
    }

    private void checkNumberOfPagesValid(int numberOfPages) {
        if (numberOfPages < 0) {
            throw new IllegalArgumentException();
        }
    }

    private void checkAuthorsValid(List<String> authors) {
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
