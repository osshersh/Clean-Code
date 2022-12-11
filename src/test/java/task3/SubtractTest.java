package task3;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.SeparatorUI;

import static org.junit.jupiter.api.Assertions.*;

class SubtractTest {

    @Test
    void shouldReturnValue1SubtractValue2() {
        double result = new Subtract().calculation(5, 5);
        assertEquals(0, result);
    }
}