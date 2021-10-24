package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Hardware hardware = new Hardware("VGA","GeForce 1070");
        Hardware hardwareTwo = new Hardware("PSU","DeepCool S500");
        Software software= new Software("Winamp",5.8);
        Software softwareTwo= new Software("3D Studio",2010);
        Cpu cpu = new Cpu("Intel",2600.5);
        PersonalComputer pc =new PersonalComputer(cpu);
        pc.addHardver(hardware);
        pc.addSoftware(software);
        System.out.println(pc.toString());
        pc.addHardver(hardwareTwo);
        pc.addSoftware(softwareTwo);
        System.out.println(pc.toString());
        System.out.println(pc.getHardwares().get(1));
        System.out.println(pc.getSoftwares().size());
    }
}
