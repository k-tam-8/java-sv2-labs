package AAAOwnProjects;

import java.util.List;

public class googleAlgor {

    // adott egy lista ami számokat tartalmaz, keressük meg hány pár van ezekben aminek összege egy megadott szám!

    public int findPairs(List<Integer> numbers, int sum) {
        int pairs = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
