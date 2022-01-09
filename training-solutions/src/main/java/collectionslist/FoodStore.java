package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {
    private List<Food> foodList = new LinkedList<>();

    public List<Food> getFoodList() {
        return new LinkedList<>(foodList);
    }

    public void addFood(Food food) {
        foodList.add(food);
    }

    public void sellFirst(Food food) {
        if (food.getExpDate().isEqual(LocalDate.now())) {
            foodList.add(0, food);
        } else foodList.add(food);
    }
}
