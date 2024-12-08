package testIdentifier;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IdentifierTest {
    private Identifier id = new Identifier();

    @Test
    void emptyString() {
        assertFalse(id.validadeIdentifier(""));
    }

    @Test
    void containsOnlyLettersOrDigitsAndIsAtLeastOneCharLongAndStartsWithALetter() {
        assertTrue(id.validadeIdentifier("a"));
    }

    @Test
    void startsWithLetterAndHasDigitsAndIsLessThanSevenCharsLong() {
        assertTrue(id.validadeIdentifier("a12345"));
    }

    @Test
    void isMoreThanSixCharsLong() {
        assertFalse(id.validadeIdentifier("a123456"));
    }

    @Test
    void startsWithANumber() {
        assertFalse(id.validadeIdentifier("2"));
    }

    @Test
    void containsSymbols() {
        assertFalse(id.validadeIdentifier("A#$12"));
    }

}
