package streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CookBookTest {
    @Test
    void name() {
        Cake cake1 = new Cake("kalács", Arrays.asList("só", "cukor"));
        Cake cake2 = new Cake("sütemény", Arrays.asList("só", "cukor", "vaj"));
        Cake cake3 = new Cake("perec", Arrays.asList("só", "tejföl", "tojás"));
        CookBook cb = new CookBook(Arrays.asList(cake1, cake2, cake3));
        System.out.println(cb.listCakeNamesWithMaxIngredients(2));
        System.out.println(cb.listCakeNamesWithGivenIngredient("cukor"));
    }
}