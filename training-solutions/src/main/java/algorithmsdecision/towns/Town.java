package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> list, int number){
        for (int i : list){
            if (i<number) {
                return true;
            }
        }
        return false;
    }
}
