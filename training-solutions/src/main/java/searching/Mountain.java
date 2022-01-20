package searching;

import java.util.Arrays;

public class Mountain {
    private int[] peaks = {345,567,678,756,879,956,989};

    public boolean searchPeak(Peak peak){
        return Arrays.binarySearch(peaks,peak.getHeight())>0;
    }

}
