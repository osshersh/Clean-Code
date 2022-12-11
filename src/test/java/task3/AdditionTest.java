package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void shouldReturnValue1AddValue2() {
        double result = new Addition().calculation(3, 3);
        assertEquals(6, result);
    }
}