package task1;

public class Text {

    public boolean isTextEmpty(String text) {
        return text == null || text.equals("");
    }

    public boolean isPalindrome(String text) {
        if (!(isTextEmpty(text))) {
            int lengthText = text.length();
            String reverse = "";
            for (int i = lengthText - 1; i >= 0; i--) {
                reverse = reverse + text.charAt(i);
            }
            return reverse.equalsIgnoreCase(text);
        }
        return false;
    }

    public int getTextLength(String text) {
        if (!(isTextEmpty(text))) {
            return text.length();
        }
        return 0;
    }
}