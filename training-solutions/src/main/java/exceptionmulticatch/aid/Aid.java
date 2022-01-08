package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> amountsPerOneMan = new ArrayList<>();
        try {
            List<String> fileReadIn = Files.readAllLines(path);
            for (String s : fileReadIn) {
                String[] stringArray = s.split(":");
               amountsPerOneMan.add(stringArray[0] + ": " + Integer.parseInt(stringArray[1].trim())*amount);
            }
        } catch (IOException | NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println(("Invalid file"));;
        }
        return amountsPerOneMan;
    }

    public static void main(String[] args) {
        Aid aid = new Aid(156);
        System.out.println(aid.countAmountsOfAid(Path.of("src/main/resources/population1.txt")));
        System.out.println(aid.countAmountsOfAid(Path.of("src/main/resources/population2.txt")));
        System.out.println(aid.countAmountsOfAid(Path.of("src/main/resources/population3.txt")));
        System.out.println(aid.countAmountsOfAid(Path.of("src/main/resources/population4.txt")));
    }
}
