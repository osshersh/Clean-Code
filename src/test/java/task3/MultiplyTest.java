package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    @Test
    void shouldReturnValue1MultiplyValue2() {
        double result = new Multiply().calculation(5, 5);
        assertEquals(25, result);
    }
}