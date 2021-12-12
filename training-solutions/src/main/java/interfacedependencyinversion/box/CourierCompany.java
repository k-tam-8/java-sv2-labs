package interfacedependencyinversion.box;

public class CourierCompany {
    public static void main(String[] args) {
        Box s = new SmallBox();
        Box m = new MediumBox();
        Box l = new LargeBox();
        Box xl = new ExtraLargeBox();
        System.out.println(s.getSize() + ", " + s.getPrice());
        System.out.println(m.getSize() + ", " + m.getPrice());
        System.out.println(l.getSize() + ", " + l.getPrice());
        System.out.println(xl.getSize() + ", " + xl.getPrice());
    }
}
