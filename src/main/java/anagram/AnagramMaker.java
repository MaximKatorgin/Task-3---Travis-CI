package anagram;

public class AnagramMaker {

    private static final String STRING_DEVIDER = " ";

    public String reverseOnlyLetters(String inputText) {
        if (inputText == null) {
            throw new IllegalArgumentException("Input string can't be null");
        }
        if (inputText.trim().isEmpty()) {
            return inputText;
        }
        String[] words = inputText.split(STRING_DEVIDER);

        for (int i = 0; i < words.length; i++) {
            words[i] = this.reverseLettersInWord(words[i]);
        }
        return String.join(STRING_DEVIDER, words);
    }

    private String reverseLettersInWord(String word) {
        char[] symbols = word.toCharArray();
        int start = 0;
        int end = symbols.length - 1;
        char tmp;
        while (start < end) {
            if (Character.isLetter(symbols[start])) {
                if (Character.isLetter(symbols[end])) {
                    tmp = symbols[start];
                    symbols[start] = symbols[end];
                    symbols[end] = tmp;
                    start++;
                    end--;
                } else {
                    end--;
                }
            }  else {
                start++;
            }
        }
        return new String(symbols);
    }
}


