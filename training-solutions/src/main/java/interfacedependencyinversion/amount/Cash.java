package interfacedependencyinversion.amount;

import java.util.ArrayList;
import java.util.List;

public class Cash implements Payable {
    @Override
    public int getPayableAmount(int amount) {
        int i = getLastDigit(amount);
        switch (i) {
            case 1:
            case 6:
                return amount - 1;
            case 2:
            case 7:
                return amount - 2;
            case 3:
            case 8:
                return amount + 2;
            case 4:
            case 9:
                return amount + 1;
            default:
                return amount;
        }
    }

    public int getLastDigit(int amount) {
        String s = Integer.toString(amount);
        int i = Integer.parseInt(s.substring(s.length() - 1));
        return i;
    }
}
