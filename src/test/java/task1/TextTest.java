package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {
    Text text = new Text();

    @Test
    void shouldReturnEmptyTextWhenTextIsEmpty() {
        boolean isEmpty = text.isTextEmpty("");
        assertTrue(isEmpty);
    }

    @Test
    void shouldReturnNullWhenTextIsNull() {
        boolean isNull = text.isTextEmpty(null);
        assertTrue(isNull);
    }

    @Test
    void shouldReturnProperWhenWordIsPalindrome() {
        boolean isPalindrome = text.isPalindrome("level");
        assertTrue(isPalindrome);
    }

    @Test
    void shouldReturnProperWhenWordIsNotPalindrome() {
        boolean isPalindrome = text.isPalindrome("code");
        assertFalse(isPalindrome);
    }

    @Test
    void shouldReturnProperWhenMethodGetTextLengthCorrectCalculateTextLength() {
        int wordLength = text.getTextLength("level");
        assertEquals(5, wordLength);
    }

    @Test
    void shouldReturnProperWhenMethodGetTextLengthIncorrectCalculateTextLength() {
        int wordLength = text.getTextLength("level");
        assertNotEquals(3, wordLength);
    }
}