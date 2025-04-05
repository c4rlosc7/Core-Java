package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    @DisplayName("TwoSum Test Method 9256")
    void twoSumTest9256() {
        int[] result = TwoSum.twoSum(new int[] {9, 2, 5, 6}, 7);
        // Arrays.stream(result).forEach(System.out::println);
        assertTrue((result[0] == 1 && result[1] == 2) || (result[0] == 2 && result[1] == 1));
    }

    @Test
    @DisplayName("TwoSum Test Method 271115")
    void twoSumTest271115() {
        int[] result = TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
        assertTrue((result[0] == 0 && result[1] == 1) || (result[0] == 1 && result[1] == 0));
    }

    @Test
    @DisplayName("TwoSum Test Method -34390")
    void twoSumTestNeg34390() {
        int[] result = TwoSum.twoSum(new int[] {-3, 4, 3, 90}, 0);
        assertTrue((result[0] == 0 && result[1] == 2) || (result[0] == 2 && result[1] == 0));
    }

}