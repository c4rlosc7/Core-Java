package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    @DisplayName("is Unique Test Method 9256")
    void twoSumTest9256() {
        int[] result = TwoSum.twoSum(new int[] {9, 2, 5, 6}, 7);
        // Arrays.stream(result).forEach(System.out::println);
        assertTrue((result[0] == 1 && result[1] == 2) || (result[0] == 2 && result[1] == 1));
    }

}