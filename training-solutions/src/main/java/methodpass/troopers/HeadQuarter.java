package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> trooperList = new ArrayList<>();

    public List<Trooper> getTrooperList() {
        return trooperList;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper != null && !trooper.getName().isEmpty()) {
        trooperList.add(trooper);
        } else throw new IllegalArgumentException("Nem megfelelő adat!");
    }

    public void moveTrooperByName(String name, Position target) {
        Trooper trooper = findTrooperByName(name);
        if (trooper != null && !trooper.getName().isEmpty()) {
            moveTrooper(trooper, target);
        } else throw new IllegalArgumentException("Nem megfelelő adat!");
    }

    public void moveClosestTrooper(Position target) {
        Trooper closestTrooper = findClosestTrooper(target);
        if (closestTrooper != null)
            moveTrooper(closestTrooper, target);
        else throw new IllegalArgumentException("Nem megfelelő adat!");
    }

    private Trooper findTrooperByName(String name) {
        Trooper trooperByName = null;
        for (Trooper trooper : trooperList) {
            if (trooper.getName().equals(name)) {
                trooperByName = trooper;
            }
        }
        return trooperByName;
    }

    private Trooper findClosestTrooper(Position target) {
        Trooper trooperByDistance = null;
        double i = trooperList.get(0).distanceFrom(target);
        for (Trooper trooper : trooperList) {
            if (trooper.distanceFrom(target) < i) {
                i = trooper.distanceFrom(target);
                trooperByDistance = trooper;
            }
        }
        return trooperByDistance;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }
}
