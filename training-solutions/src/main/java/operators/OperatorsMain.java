package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(operators.toBinary(12));
        System.out.println(operators.isEven(1656));
        System.out.println(operators.getResultOfDivision(21, 9));
        String s = null;
        System.out.println(operators.isNull(s));
        System.out.println(operators.isNull("lololololl"));
        System.out.println(operators.isEmpty("re"));
        System.out.println(operators.isEmpty(s));
        System.out.println(operators.isEmpty(""));

    }
}
