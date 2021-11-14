package introexceptiontrycatchtrace;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> nameList = Arrays.asList("Joe", "Jack", null, "James");

    public String getWinner() {
        Random rnd = new Random();
        int number = rnd.nextInt(nameList.size());
        return this.nameList.get(number).toUpperCase();
    }
}
