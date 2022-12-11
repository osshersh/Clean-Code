package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void shouldReturnValue1DivideValue2() {
        double result = new Divide().calculation(20, 5);
        assertEquals(4, result);
    }

    @Test
    void shouldReturn0WhenValue2IsZero() {
        double result = new Divide().calculation(20, 0);
        assertEquals(0, result);
    }
}