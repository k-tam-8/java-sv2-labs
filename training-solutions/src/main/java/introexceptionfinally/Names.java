package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    private List<String> readNames() {
        try {
            return Files.readAllLines(Paths.get("names_.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        finally {
            System.out.println("End of reading.");
        }
    }

    public static void main(String[] args) {
        List<String> list= new Names().readNames();
        boolean quit = false;
        for (String s : list){
            if (s.toLowerCase().substring(0,3).equals("dr.") && !quit){
                System.out.println(s);
                quit=true;
            }
        }
    }
}
