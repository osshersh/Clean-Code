package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void shouldDivide() {
        double result = new Divide().calculate(20, 5);
        assertEquals(4, result);
    }

    @Test
    void shouldReturn0WhenValue2IsZero() {
        double result = new Divide().calculate(20, 0);
        assertEquals(0, result);
    }
}