package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    @Test
    void shouldMultiply() {
        double result = new Multiply().calculate(5, 5);
        assertEquals(25, result);
    }
}