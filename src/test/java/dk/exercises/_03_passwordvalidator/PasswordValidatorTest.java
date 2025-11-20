package dk.exercises._03_passwordvalidator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PasswordValidatorTest {

    @Test
    void passwordMustBeAtLeastEightCharacters() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.isValid("short");
        assertThat(result).isFalse();
    }

    @Test
    void passwordMustContainUppercase() {
        // TODO
    }

    @Test
    void passwordMustContainDigit() {
        // TODO
    }

    @Test
    void validPasswordReturnsTrue() {
        // TODO
    }
}

