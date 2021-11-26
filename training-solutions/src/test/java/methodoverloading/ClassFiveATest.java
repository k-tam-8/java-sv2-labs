package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {
    @Test
    void testFirstMethod() {
        ClassFiveA cfa = new ClassFiveA();
        String name = cfa.getTodayReferringStudent(3);
        assertEquals("Lala" , name);
    }
    @Test
    void testSecondMethod() {
        ClassFiveA cfa = new ClassFiveA();
        String name = cfa.getTodayReferringStudent(Number.FOUR.getNumberOfStudent());
        assertEquals("Pistike" , name);
    }
    @Test
    void testThirdMethod() {
        ClassFiveA cfa = new ClassFiveA();
        String name = cfa.getTodayReferringStudent("OnE");
        assertEquals("Béla" , name);
    }
}