package sorting;

import java.util.Arrays;

public class Income {
    private int[] incomes= {324,12423,3242,132,453,675,75,345,645,465};

    public int getHighestIncome(){
        Arrays.sort(incomes);
        return incomes[incomes.length-1];
    }
}
