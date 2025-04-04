package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * isUnique(abcde) => true
 * isUnique(abcded) => false
 * a: b c d e
 * b: c d e
 *
 * O(n^2)
 *
 * Hashtable
 * a b c d e
 *
 * for O(N)
 * query to table O(1)
 * O(1)
 */
public class IsUnique {

    private static int NUMBER_OF_CHARS = 128;

    public static boolean isUnique(String string) {
        if (string.length() > NUMBER_OF_CHARS) return false;

        Set<Character> characters = new HashSet<>();
        for (Character character : string.toCharArray()) {
            if (characters.contains(character)) return false;
            characters.add(character);
        }
        return true;
    }
}
