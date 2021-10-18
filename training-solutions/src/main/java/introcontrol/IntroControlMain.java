package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.subtractTenIfGreaterThanTen(60));
        System.out.println(introControl.subtractTenIfGreaterThanTen(5));
        System.out.println();
        System.out.println(introControl.describeNumber(4));
        System.out.println(introControl.describeNumber(0));
        System.out.println();
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Jack"));
        System.out.println();
        System.out.println(introControl.calculateBonus(1250000));
        System.out.println();
        introControl.printNumbers(16);
        System.out.println();
        introControl.printNumbersBetween(12,26);
        System.out.println();
        introControl.printNumbersBetweenAnyDirection(52, 41);
        introControl.printNumbersBetweenAnyDirection(30, 46);
        System.out.println();
        introControl.printOddNumbers(15);

    }
}
