package conversion;

import mathproblems.Division;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void addDigitsToList(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                numbers.add(Integer.parseInt(String.valueOf(text.charAt(i))));
            }
        }
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("uj8fwe76f7e6w2");
        System.out.println(digits.getNumbers());
    }
}
