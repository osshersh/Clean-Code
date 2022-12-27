package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void shouldAdd() {
        double result = new Addition().calculate(3, 3);
        assertEquals(6, result);
    }
}