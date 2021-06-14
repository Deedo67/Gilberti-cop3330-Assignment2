package oop.assignment2.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void rankPassword_returns_veryweak() {
        PasswordValidator Validator  = new PasswordValidator();

        int actual = Validator.rankPassword("36879");

        // then
        assertTrue(actual);
    }

    @Test
    void rankPassword_returns_weak() {
        PasswordValidator Validator  = new PasswordValidator();

        int actual = Validator.rankPassword("GRSG");

        assertTrue(actual);
    }

    @Test
    void rankPassword_returns_strong() {
        PasswordValidator Validator  = new PasswordValidator();

        int actual = Validator.rankPassword("HYJKI42G9K");

        assertTrue(actual);
    }

    @Test
    void rankPassword_returns_verystong() {
        PasswordValidator Validator  = new PasswordValidator();

        int actual = Validator.rankPassword("VF54&*jHUT#2");

        assertTrue(actual);
    }
}