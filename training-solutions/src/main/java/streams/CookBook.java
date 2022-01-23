package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CookBook {

    List<Cake> cakeList = new ArrayList<>();

    public CookBook(List<Cake> cakeList) {
        this.cakeList = cakeList;
    }

    public List<String> listCakeNamesWithGivenIngredient(String ingredient) {
        List<String> filteredCakeList = cakeList.stream()
                .filter(cake -> cake.getIngredients().contains(ingredient))
                .map(cake -> cake.getName())
                .collect(Collectors.toList());
        return filteredCakeList;
    }

    public List<String> listCakeNamesWithMaxIngredients(int max) {
        List<String> filteredCakeList = cakeList.stream()
                .filter(cake -> cake.getIngredients().size() <= max)
                .map(cake -> cake.getName())
                .collect(Collectors.toList());
        return filteredCakeList;
    }
}
