package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        for (Position i:Position.values()){
            System.out.println(i +" "+ i.getBenefit() + " " + i.getSalary());
        }
    }
}
