package collectionslist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {
    @Test
    void testOne() {
        Postman postman = new Postman();
        postman.addAddress("elso");
        postman.addAddress("masodik");
        postman.addAddress("harmadik");
        postman.removeAddress("harmadik");
        assertEquals(2, postman.getAddresses().size());
    }
}