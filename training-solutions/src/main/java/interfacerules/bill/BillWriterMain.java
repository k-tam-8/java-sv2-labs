package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BillWriterMain {
    public static void main(String[] args) throws IOException {
        Bill bill = new Bill();
        List<String> readIn = new ArrayList<>();
        readIn = bill.readBillItemsFromFile(Path.of("src/main/resources/billitems.txt"));
        SimpleBillWriter sbw = new SimpleBillWriter();
        System.out.println(sbw.writeBill(readIn));
        ComplexBillWriter cbw = new ComplexBillWriter();
        System.out.println(cbw.writeBill(readIn));
        BillWriter bw = new SimpleBillWriter();
        System.out.println(bw.writeBill(readIn));
    }
}
