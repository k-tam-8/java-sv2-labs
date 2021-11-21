package algorithmssum;

import java.util.List;

public class SalesAmountSumCalculator {
    public int SalesAmountSumCalculator(List<Salesperson> salePersons) {
        int sumPersons = 0;
        for (Salesperson saleperson : salePersons) {
            sumPersons += saleperson.getAmount();
        }
        return sumPersons;
    }
}
