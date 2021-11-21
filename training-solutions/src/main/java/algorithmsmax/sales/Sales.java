package algorithmsmax.sales;

import java.util.List;

public class Sales {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson maxIn = null;
        for (Salesperson salesperson : sales) {
            if (maxIn == null || maxIn.getAmount() < salesperson.getAmount()) {
                maxIn = salesperson;
            }
        }
        return maxIn;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson maxIn = sales.get(0);
        int maxProfit = sales.get(0).getAmount() - sales.get(0).getTarget();
        for (Salesperson salesperson : sales) {
            int difference = salesperson.getAmount() - salesperson.getTarget();
            if (difference > maxProfit) {
                maxIn = salesperson;
                maxProfit = difference;
            }
        }
        return maxIn;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson minIn = sales.get(0);
        int minProfit = sales.get(0).getAmount() - sales.get(0).getTarget();
        for (Salesperson salesperson : sales) {
            int difference = salesperson.getAmount() - salesperson.getTarget();
            if (difference < minProfit) {
                minIn = salesperson;
                minProfit = difference;
            }
        }
        return minIn;
    }
}
