package localvariables;

import com.sun.source.tree.WhileLoopTree;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(10.4, true);
        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());
        int wholeDistance= (int) distance.getDistanceInKm();
        System.out.println(wholeDistance);
    }
}
