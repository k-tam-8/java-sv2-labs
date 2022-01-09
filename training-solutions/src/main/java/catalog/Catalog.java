package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int page) {
        return 0;
    }

    public void deleteItemByRegistrationNumber(String regNum) {
        for (int i = 0; i < catalogItems.size(); i++) {
            if (catalogItems.get(i).getRegistrationNumber().equals(regNum)) {
                catalogItems.remove(i);
                i++;
            }
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        return null;
    }

    public int getAllPageNumber() {
        return 0;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        return null;
    }

    public int getFullLength() {
        return 0;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        return null;
    }
}
