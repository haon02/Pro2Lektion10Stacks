package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import stacks.Validator;

public class ValidatorTest {
    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new Validator();
    }

    @Test
    void test_validator_canValidateBrackets() {
        // --------------------------------------------------
        // ARRANGE & ACT & ASSERT
        // --------------------------------------------------

        String exampleFromOpgave = "(3+{5{99{*}}[23[{67}67]]})";
        assertTrue(validator.validateBrackets(exampleFromOpgave));

        String wrongOrder = "(}){";
        assertFalse(validator.validateBrackets(wrongOrder));

        assertTrue(validator.validateBrackets("()"));
        assertTrue(validator.validateBrackets("[]"));
        assertTrue(validator.validateBrackets("{}"));
        assertTrue(validator.validateBrackets("[{()}]"));

        assertFalse(validator.validateBrackets("("), "Mangler slutparentes");
        assertFalse(validator.validateBrackets(")"), "Starter med slutparentes");
        assertFalse(validator.validateBrackets("(]"), "Mismatch mellem typer");

    }
}

