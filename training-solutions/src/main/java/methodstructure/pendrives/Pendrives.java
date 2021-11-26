package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> pendriveList) {
        Pendrive mostCheapPendrivePerGb = pendriveList.get(0);
        for (Pendrive pendrive : pendriveList) {
            if (pendrive.calculatePriceGb() < mostCheapPendrivePerGb.calculatePriceGb()) {
                mostCheapPendrivePerGb = pendrive;
            }
        }
        return mostCheapPendrivePerGb;
    }

    public Pendrive getCheapest(List<Pendrive> pendriveList) {
        Pendrive mostCheapPendrive = pendriveList.get(0);
        for (Pendrive pendrive : pendriveList) {
            if (pendrive.isCheaperThan(mostCheapPendrive)) {
                mostCheapPendrive = pendrive;
            }
        }
        return mostCheapPendrive;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendriveList, int percent, int capacity) {
        for (Pendrive pendrive : pendriveList) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }
}
