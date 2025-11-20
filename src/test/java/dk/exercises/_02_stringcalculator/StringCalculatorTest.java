package dk.exercises._02_stringcalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    @Test
    void emptyStringReturnsZero() {
        int result = StringCalculator.add("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void singleNumberReturnsValue() {
        // TODO
    }

    @Test
    void twoNumbersSeparatedByCommaAreSummed() {
        // TODO
    }

    @Test
    void supportsNewlineAsDelimiter() {
        // TODO
    }

    @Test
    void throwsForNegativeNumbers() {
        // TODO
    }
}

