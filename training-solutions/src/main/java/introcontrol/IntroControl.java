package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        if (number<=10) return number; else return number-10;
    }
    public String describeNumber(int number) {
        if (number==0) return "zero"; else return "not zero";
    }
    public String greetingToJoe(String name) {
        if (name.equals("Joe")) return "Hello Joe"; else return "";
    }
    public int calculateBonus(int sale) {
        if (sale>1_000_000) return sale / 100 * 10; else return 0;
    }
    public int calculateConsumption(int prev, int next) {
        //ha ki kell vonni akkor hogy érné el az óra a 9999-et?
        if (prev>next) return prev-next; else return next-prev;
    }
    public void printNumbers(int max) {
        for (int i=0; i<=max;i++) { System.out.print(i + ", ");};
    }
    public void printNumbersBetween(int min, int max) {
        for (int i=min; i<=max;i++) { System.out.print(i + ", ");};
    }
    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a>=b) {
            for (int i = a; i >= b; i--) System.out.print(i + ", ");
        } else for (int i = a; i <= b; i++) System.out.print(i + ", ");
    }
    public void printOddNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            if (i % 2 == 1) System.out.print(i + ", ");
        }
    }

}
