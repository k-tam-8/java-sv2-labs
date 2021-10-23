package finalmodifier;

public class TaxCalculator {
    public static final int AFA=27;

    public double tax(double price){
        return price/100*AFA;
    }
    public double priceWithTax(double price){
        return price+tax(price);
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator=new TaxCalculator();
        System.out.println(taxCalculator.priceWithTax(100));
    }
}
