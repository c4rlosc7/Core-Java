package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("IsUniqueTest")
class IsUniqueTest {
    @Test
    @DisplayName("is Unique Test Method abcde")
    void isUniqueTestABCDE() {
        boolean actual = IsUnique.isUnique("abcde");
        boolean expected = true;
        assertEquals(expected, actual, "abcde should return TRUE");
    }

    @Test
    @DisplayName("is Unique Test Method aAbBcCdDeE")
    void isUniqueTestAABBCCDDEE() {
        boolean actual = IsUnique.isUnique("aAbBcCdDeE");
        boolean expected = true;
        assertEquals(expected, actual, "aAbBcCdDeE should return true");
    }

    @Test
    @DisplayName("is Unique Test Method abcded")
    void isUniqueTestABCDED() {
        boolean actual = IsUnique.isUnique("abcded");
        boolean expected = false;
        assertEquals(expected, actual, "abcded should return FALSE");
    }
}