package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem=new BillItem("krumpli", 20, 5,25);
        System.out.println((int)billItem.calculateTotalPrice());
    }
}
