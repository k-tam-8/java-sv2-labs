package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints) {
        Scanner sc = new Scanner(ints).useDelimiter(";");
        String s = "";
        while (sc.hasNext()) {
            int x = sc.nextInt();
            if (x > 100) {
                s += Integer.toString(x) + ",";
            }
        }
        if (s != "") {
            return s.substring(0, s.length() - 1);
        } else return "nincs eredmény";
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
        System.out.println(intScanner.convertInts("198"));
        System.out.println(intScanner.convertInts("1;9;8;58"));
        System.out.println(intScanner.convertInts(""));
    }
}
