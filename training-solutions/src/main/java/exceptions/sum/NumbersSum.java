package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        int sum = 0;
        if (numbers == null){
            throw new IllegalArgumentException("Null értékű tömb!");
        }
            for (int i : numbers) {
                sum += i;
            }

        return sum;
    }

    public int getSum(String[] numbers) {
        int sum = 0;
        if (numbers == null){
            throw new IllegalArgumentException("Null értékű tömb!");
        }
        try {
            for (String s : numbers) {
                sum += Integer.parseInt(s);
            }
        }
        catch (NumberFormatException nfe){
            throw new IllegalArgumentException("Nem alakítható számmá!");

        }
        return sum;
    }
}
