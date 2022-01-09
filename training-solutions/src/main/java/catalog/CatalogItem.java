package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... featureArray) {
        for (Feature f : featureArray) {
            features.add(f);
        }
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public List<Feature> getFeatures() {
        return new ArrayList<>(features);
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int fullLengthAtOneItem() {
        int sum = 0;
        for (Feature f : features) {
        //    sum+= (AudioFeatures) f.getLength();
        }
        return 0;
    }

    public int numberOfPagesAtOneItem() {
        return 0;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature f : features) {
            contributors.addAll(f.getContributors());
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature f : features) {
            titles.add(f.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature f : features) {
            if (f instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }
}
