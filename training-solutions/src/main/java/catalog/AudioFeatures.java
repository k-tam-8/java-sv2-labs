package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private List<String> composer = new ArrayList<>();
    private int length;
    private List<String> performers = new ArrayList<>();
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        checkMissingTitle(title);
        checkLength(length);
        checkPerformers(performers);
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        checkMissingTitle(title);
        checkLength(length);
        checkPerformers(performers);
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    private void checkMissingTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException();
        }
    }

    private void checkLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException();
        }
    }

    private void checkPerformers(List<String> performers) {
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public List<String> getContributors() {
        List<String> collapsedList = new ArrayList<>(composer);
        collapsedList.addAll(performers);
        return collapsedList;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
