package methodstructure.bmi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {
    BodyMass bodyMass;

    @BeforeEach
    void init(){
        bodyMass = new BodyMass();
        bodyMass.setHeightInM(1.85);
        bodyMass.setWeightInKg(68);
    }

    @Test
    void testGetWeightInKg() {
        assertEquals(68, bodyMass.getWeightInKg());
    }

    @Test
    void testGetHeightInM() {
        assertEquals(1.85, bodyMass.getHeightInM());
    }

    @Test
    void testGetBody() {
        assertEquals(BmiCategory.NORMAL, bodyMass.getBody());
    }

    @Test
    void testGetBodyMassIndex() {
        assertEquals(19.86851716581446,bodyMass.getBodyMassIndex());
    }
}