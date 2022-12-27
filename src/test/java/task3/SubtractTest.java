package task3;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.SeparatorUI;

import static org.junit.jupiter.api.Assertions.*;

class SubtractTest {

    @Test
    void shouldSubtract() {
        double result = new Subtract().calculate(5, 5);
        assertEquals(0, result);
    }
}