package algorithmscount;

public class Digits {
    public int getCountOfNumbers() {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int firstDigit = Character.getNumericValue(Integer.toString(i).charAt(0));
            int secondDigit = Character.getNumericValue(Integer.toString(i).charAt(1));
            if (firstDigit - secondDigit == 5 || secondDigit - firstDigit == 5) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Digits().getCountOfNumbers());
    }
}
