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
    void shouldBePalindrome() {
        boolean isPalindrome = text.isPalindrome("level");
        assertTrue(isPalindrome);
    }

    @Test
    void shouldBeNotPalindrome() {
        boolean isPalindrome = text.isPalindrome("code");
        assertFalse(isPalindrome);
    }

    @Test
    void shouldGetCorrectLength() {
        int wordLength = text.getTextLength("level");
        assertEquals(5, wordLength);
    }

    @Test
    void shouldReturnZeroWhenTextIsEmpty(){
        int wordLength = text.getTextLength("");
        assertEquals(0, wordLength);
    }
}