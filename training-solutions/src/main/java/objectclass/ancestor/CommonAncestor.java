package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> objList = new ArrayList<>();
        Fruit fruit = new Fruit();
        objList.add(fruit);
        Apple apple = new Apple();
        objList.add(apple);
        Starking starking = new Starking();
        objList.add(starking);
        Vegetable vegetable = new Vegetable();
        objList.add(vegetable);
        objList.add("alma");
        objList.add(12);
        objList.add('x');
        LocalDate date = LocalDate.now();
        objList.add(date);
        int[] array = {1,2,3};
        objList.add(array);
        List<String> stringList = Arrays.asList("aaaa","bbbb");
        objList.add(stringList);
        System.out.println(objList);
    }
}
