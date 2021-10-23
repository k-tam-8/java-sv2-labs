package aslist;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("TV", "Telefon", "Orrszőrnyíró");
        System.out.println(importantThings);
        importantThings.set(1, "Elefánt");
        System.out.println(importantThings);
    }

}
