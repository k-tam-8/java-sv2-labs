package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {
    @Test
    void testListAdd() {
        Dog dog = new Dog("Csibész", 3, Species.LABRADOR);
        Vet vet = new Vet();
        vet.addDog(dog);
        assertEquals(2, vet.getCode());
    }
}