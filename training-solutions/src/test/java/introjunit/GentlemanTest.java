package introjunit;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GentlemanTest {
    @Test
    public void testThis(){
        String name="John";
        String greeting=new Gentleman().sayHello(name);
        assertEquals(greeting, "Hello John");
    }
    @Test
    public void testThis2(){
        String name=null;
        String greeting = new Gentleman().sayHello(name);
        assertEquals(greeting, "Hello Anonymus");

    }

}
