package lambda;

import java.util.ArrayList;
import java.util.List;

public class TreeNursery {
    List<Sapling> saplingList = new ArrayList<>();

    public void prune(int maxHeight) {
        saplingList.forEach(sapling -> sapling.cut(maxHeight));
    }

    public void sell(String species, int minHeight) {
        saplingList.removeIf(sapling -> sapling.getSpecies().equals(species) && sapling.getHeight() > minHeight);
    }
}
