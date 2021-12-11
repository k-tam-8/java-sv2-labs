package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter{
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String s : billItems) {
            String[] stringArr = s.split(";");
            int price = Integer.parseInt(stringArr[1]) * Integer.parseInt(stringArr[2]);
            sb.append(stringArr[0] + "; darabszám: " + stringArr[2] + ", egységár: " +
                    stringArr[1] + ", összesen: " + price + " Ft\n");
        }
        sb.deleteCharAt(sb.length()-1);
        String s = sb.toString();
        return s;
    }
}
