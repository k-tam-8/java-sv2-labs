package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    @Test
    void testArrayList() {
        Recipe recipe = new Recipe();
        recipe.addIngredients(Path.of("recipe.txt"));
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"), recipe.getIngredients());
        assertNotEquals(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom", "sütőpor", "vaniliincukor", "tejföl", "alma", "fahéj"), recipe.getIngredients());
    }
}