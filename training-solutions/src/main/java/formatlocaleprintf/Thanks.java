package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> lstStr= Arrays.asList("John", "Jack", "Tom");
        for (int i=0;i<lstStr.size();i++){
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!",lstStr.get(i).toString());
            System.out.println();
        }
    }
}
