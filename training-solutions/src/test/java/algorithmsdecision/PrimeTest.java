package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @Test
    void testPrime() {
        assertTrue(new Prime().isPrime(7));
    }
    @Test
    void testPrimeTwo() {
        assertFalse(new Prime().isPrime(8));
    }
}