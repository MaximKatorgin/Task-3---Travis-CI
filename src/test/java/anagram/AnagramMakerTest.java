package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramMakerTest {
    private AnagramMaker anagramMaker = new AnagramMaker();

    @Test
    public void reverseOnlyLetters_shouldReturnSame_whenEmptyInput() {
        String expected = "";
        String actual = anagramMaker.reverseOnlyLetters("");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOnlyLetters_shouldReverseWord_whenInputOnlyLetterWord() {
        String expected = "olleh";
        String actual = anagramMaker.reverseOnlyLetters("hello");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOnlyLetters_shouldReverseWords_whenInputTwoOnlyLetterWords() {
        String expected = "dcba hgfe";
        String actual = anagramMaker.reverseOnlyLetters("abcd efgh");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOnlyLetters_shouldReverseOnlyLetters_whenInputSymbolsAndNumbers() {
        String expected = "d1cba hgf!e";
        String actual = anagramMaker.reverseOnlyLetters("a1bcd efg!h");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOnlyLetters_shouldReturnSame_whenInputSymbolWord() {
        String expected = "#@&^$";
        String actual = anagramMaker.reverseOnlyLetters("#@&^$");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOnlyLetters_shouldReverseOnlyLetters_whenInputWithMultipleSpaces() {
        String expected = "d1cba     hgf!e";
        String actual = anagramMaker.reverseOnlyLetters("a1bcd     efg!h");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOnlyLetters_shouldReturnSame_whenInputOnlyNumbers() {
        String expected = "1238712931";
        String actual = anagramMaker.reverseOnlyLetters("1238712931");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOnlyLetters_shouldReturnSame_whenInputTwoOnlyNumbersWords() {
        String expected = "12387 12931";
        String actual = anagramMaker.reverseOnlyLetters("12387 12931");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOnlyLetters_shouldReverseOnlyLetters_whenInputTwoDifferentWords() {
        String expected = "olleh 12931";
        String actual = anagramMaker.reverseOnlyLetters("hello 12931");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOnlyLetters_shouldThrowException_whenNullInput() {
        Class<IllegalArgumentException> expected = IllegalArgumentException.class;
        String nullString = null;
        assertThrows(expected, () -> anagramMaker.reverseOnlyLetters(nullString));
    }

    @Test
    public void reverseOnlyLetters_shouldReverseWords_whenInputDifferentCase() {
        String expected = "oLLeH dlRoW";
        String actual = anagramMaker.reverseOnlyLetters("HeLLo WoRld");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseOnlyLetters_shouldReverseWord_whenInputUpperCaseOnly() {
        String expected = "OLLEH";
        String actual = anagramMaker.reverseOnlyLetters("HELLO");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseLettersOnly_shouldReturnSame_whenInputSymbolsAndNumbers() {
        String expected = "@$7!%21";
        String actual = anagramMaker.reverseOnlyLetters("@$7!%21");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseLettersOnly_shouldReverseOnlyLetters_whenInputDifferentCasesAndSymbols() {
        String expected = "LleH@ D@r1W";
        String actual = anagramMaker.reverseOnlyLetters("HelL@ W@r1D");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseLettersOnly_shouldReverseOnlyLettersWords_whenInputDifferentWordsAndSpaces() {
        String expected = "LleH@  5672@$^%91    D@r1W";
        String actual = anagramMaker.reverseOnlyLetters("HelL@  5672@$^%91    W@r1D");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseLettersOnly_shouldReturnSame_whenInputMultipleSameLetters() {
        String expected = "aaaaaaa";
        String actual = anagramMaker.reverseOnlyLetters("aaaaaaa");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseLettersOnly_shoulReverseWord_whenInputMultipleSameLettersInDifferentCase() {
        String expected = "AAAaaaa";
        String actual = anagramMaker.reverseOnlyLetters("aaaaAAA");
        assertEquals(expected, actual);
    }

    @Test
    public void reverseLettersOnly_shoulReturnSame_whenInputOnlyMultipleSpaces() {
        String expected = "  ";
        String actual = anagramMaker.reverseOnlyLetters("  ");
        assertEquals(expected, actual);
    }
}
