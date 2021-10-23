package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static void main(String[] args) {
    List<String> weekDays= Arrays.asList("Hétfő", "Kedd", "Szerda",
            "Csütörtök", "Péntek", "Szombat", "Vasárnap");
    weekDays.set(1, "Szerda");
        System.out.println(weekDays.toString());
}
}
