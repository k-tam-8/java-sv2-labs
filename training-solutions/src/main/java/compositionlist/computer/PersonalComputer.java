package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {
    private List<Hardware> hardwares=new ArrayList<>();
    private List<Software> softwares=new ArrayList<>();
    private Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public List<Hardware> getHardwares() {
        return hardwares;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public Cpu getCpu() {
        return cpu;
    }
    public void addHardver(Hardware hardware){
        this.hardwares.add(hardware);
    }
    public void addSoftware(Software software){
        this.softwares.add(software);
    }

    @Override
    public String toString() {
        return "PersonalComputer hardware: " + hardwares +
                " \nPersonalComputer szoftvere:" + softwares +
                " \nPersonalComputer cpuja: " + cpu;
    }
}
