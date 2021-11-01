package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    void firstTest() {
        String name = "John";
        String greeting = new Gentleman().sayHello(name);
        assertEquals("Hello John", greeting);
    }
    @Test
    void secondTest(){
        String name=null;
        String greeting=new Gentleman().sayHello(name);
        assertEquals("Hello Anonymus",greeting);
    }
}
