package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {
    @Test
    void test() {
        Paper paper = new Paper();
        paper.addToMap("1.a", 30);
        paper.addToMap("2.a", 50);
        paper.addToMap("3.a", 90);
        paper.addToMap("4.a", 10);
        paper.addToMap("5.a", 1);
        assertEquals(5,paper.getResults().size());
        paper.putFurtherPaper("1.b", 45);
        assertEquals(6, paper.getResults().size());

        assertEquals("3.a", paper.getWinnerClass());
        assertEquals(181, paper.getTotalWeight());
    }
}