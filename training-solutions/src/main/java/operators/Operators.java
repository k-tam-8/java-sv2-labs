package operators;

public class Operators {
    public String toBinary(int szam) {
        return Integer.toBinaryString(szam);
    }

    public boolean isEven(int szam) {
        return (szam % 2 == 0);
    }

    public String getResultOfDivision(int number, int divisor) {
        return number + " / " + divisor + " = " + (number / divisor) + ", maradék: " + (number % divisor);
    }

    public String isNull(String s) {
        return (s == null ? "null értékű" : "nem null értékű");
    }

    public boolean isEmpty(String s) {
        return (s == null || s == "" ? true : false);
    }
}
