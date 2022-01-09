package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companyList = new ArrayList<>();
        companyList.add(new Company("Cég Kft", 1234));
        System.out.println(companyList.contains(new Company("Cég Kft", 1234)));

    }
}
