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
    void hasOnlyNumbers() {
        assertFalse(id.validadeIdentifier("3"));
    }

    @Test
    void exceedsMaximumCharacters() {
        assertFalse(id.validadeIdentifier("abc123g"));
    }

    @Test
    void onlySpecialCharacters() {
        assertFalse(id.validadeIdentifier("@"));
    }

    @Test
    void startsWithANumberButHasLetters() {
        assertFalse(id.validadeIdentifier("35a7x"));
    }

    @Test
    void hasSpecialCharacters() {
        assertFalse(id.validadeIdentifier("ua00!"));
    }

    @Test
    void hasOnlyOneLetter() {
        assertTrue((id.validadeIdentifier("b")));
    }

    @Test
    void startsWithALetterButHasNumbersAndLetters() {
        assertTrue(id.validadeIdentifier("ac645j"));
    }

    @Test
    void hasOnlyLetters() {
        assertTrue(id.validadeIdentifier("ogsach"));
    }

    @Test
    void startsWithALetterAndTheRestAreNumbers() {
        assertTrue(id.validadeIdentifier("z00223"));
    }

    @Test
    void startsWithALetterAndHasLessThanSixValidCharacters() {
        assertTrue(id.validadeIdentifier("k03"));
    }

    @Test
    void hasOnlyLettersAndIsLessThanSixValidCharacters() {
        assertTrue(id.validadeIdentifier("cd"));
    }
}
