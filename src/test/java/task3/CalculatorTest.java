package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void initList() {
        calculator = new Calculator(List.of(new Addition(), new Multiply(), new Divide(), new Subtract()));
    }

    @Test
    void shouldAddWhenSignIsPlus() {
        assertEquals(4, calculator.calculateMathematics(2, '+', 2));
    }

    @Test
    void shouldMultiplyWhenSignIsMultiply() {
        assertEquals(6, calculator.calculateMathematics(3, '*', 2));
    }

    @Test
    void shouldDivideWhenSignIsDivide() {
        assertEquals(4, calculator.calculateMathematics(8, '/', 2));
    }

    @Test
    void shouldSubtractWhenSignIsSubtract() {
        assertEquals(4, calculator.calculateMathematics(6, '-', 2));
    }
}