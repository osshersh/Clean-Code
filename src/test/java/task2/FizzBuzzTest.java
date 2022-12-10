package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnTrueWhenNumberDivide3() {
        boolean isFizz = fizzBuzz.getFizz(9);
        assertTrue(isFizz);
    }

    @Test
    void shouldReturnTrueWhenNumberDivide5() {
        boolean isBuzz = fizzBuzz.getBuzz(5);
        assertTrue(isBuzz);
    }
}