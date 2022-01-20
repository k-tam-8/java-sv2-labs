package searching;

import java.util.*;

public class LostAndFoundOffice {
    private List<LostProperty> lostPropertyList = new ArrayList<>();

    public LostProperty findLostProperty(LostProperty searched){
        int searching = Collections.binarySearch(lostPropertyList, searched);
        if (searching<0){
            throw new IllegalArgumentException("Not found.");
        } else return lostPropertyList.get(searching);
    }

}
