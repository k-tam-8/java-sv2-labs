package streams;

import java.util.ArrayList;
import java.util.List;

public class Cake {
    private String name;
    private List<String> ingredients = new ArrayList<>();

    public Cake(String name, List<String> ingridients) {
        this.name = name;
        this.ingredients = ingridients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return new ArrayList<>(ingredients);
    }
}
